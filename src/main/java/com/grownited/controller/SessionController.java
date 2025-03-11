package com.grownited.controller;


import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.grownited.entity.UserEntity;
import com.grownited.repository.SessionRepository;
import com.grownited.service.MailService;

import jakarta.servlet.http.HttpSession;

@Controller
public class SessionController {
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	MailService serviceMail;
	
	@Autowired
	 SessionRepository repouserEntity;
	
	@Autowired
	Cloudinary cloudinary;
	
	@GetMapping(value = {"/","signup"})
	public String signup() {
		//		
		return "SignUp"; 
	}

	@GetMapping("login")
	public String login() {
		//
		return "Login";
		
	}
	
	@PostMapping("saveuser")
	public String saveUser(UserEntity userEntity ,MultipartFile profilePic ) {
			System.out.println(profilePic.getOriginalFilename());// file name
			// cloud->
			
//			if(profilePic.getOriginalFilename().endsWith(".jpg") || || || ) {
//				
//			}else {
//				//
//				//model 
//				return "Signup";
//			}
			try {
				Map result = cloudinary.uploader().upload(profilePic.getBytes(), ObjectUtils.emptyMap());
				//System.out.println(result);
				//System.out.println(result.get("url"));
				userEntity.setProfilePicPath(result.get("url").toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		
		String encPassword = encoder.encode(userEntity.getPassword());
		userEntity.setPassword(encPassword);
		 //memory 
		//bcrypt singleton -> single object -> autowired
		
		//userEntity.setRole("USER");
		userEntity.setCreatedAt(Date.valueOf(LocalDate.now()));


		// send mail
		serviceMail.sendWelcomeMail(userEntity.getEmail(), userEntity.getFirstName());
		repouserEntity.save(userEntity);
		return "Login";
	}
	@GetMapping("forgetpassword")
		public String forgetpassword() {
			//
		return "ForgetPassword";
			
	}
	
	@PostMapping("sendOtp")
	public String sendOtp(String email, Model model) {
		// email valid
				Optional<UserEntity> op = repouserEntity.findByEmail(email);
				if (op.isEmpty()) {
					// email invalid
					model.addAttribute("error", "Email not found");
					return "ForgetPassword";
				} else {
					// email valid
					// send mail otp
					// opt generate
					// send mail otp
					String otp = "";
					otp = (int) (Math.random() * 1000000) + "";// 0.25875621458541
					
					UserEntity user = op.get();
					user.setOtp(otp);
					repouserEntity.save(user);// update otp for user
					serviceMail.sendOtpForForgetPassword(email, user.getFirstName(), otp);
					return "ChangePassword";

				}
		}
	@PostMapping("resetPassword")
	public String resetPassword(UserEntity userEntity) {
		System.out.println(userEntity.getPassword());
		return "ChangePassword";
	}
	
	@GetMapping("home")
	public String home() {
		//
	return "Home";
	}
	@PostMapping("savelogin")
	public String savelogin() {
		return "Home";
	
	}
	@GetMapping("listuser")
	public String listuser(Model model) {
    List<UserEntity> userList =repouserEntity.findAll();
      model.addAttribute("userList", userList);
		return "ListUser";
	}
	
	@PostMapping("authenticate")
	public String authenticate(String email,String password,Model model,HttpSession session) {
		System.out.println(email);
		System.out.println(password);
		
		Optional<UserEntity> op = repouserEntity.findByEmail(email);
		if (op.isPresent()) {
			// true
			// email
			UserEntity dbUser = op.get();
			boolean ans = encoder.matches(password, dbUser.getPassword());

			if (ans==true) {
				session.setAttribute("user", dbUser);// session -> user set
	            session.setMaxInactiveInterval(30 * 60); // 30 minutes in seconds

				if (dbUser.getRole().equals("ADMIN")) {

					return "redirect:/admindashboard";
				}  else if (dbUser.getRole().equals("SELLER")){
					return "redirect:/sellerdashboard";

				}else if (dbUser.getRole().equals("USER")){
						return "redirect:/home";

				}else {
				
					model.addAttribute("error", "Please contact Admin with Error Code #0991");
					return "Login";
					}
			}
		}
		model.addAttribute("error","Invalid Credentials");
		return "Login";
		
	}
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";// login url
	}

	@GetMapping("viewuser")
	public String viewuser(Integer userId, Model model) {
		// ?
		System.out.println("id ===> " + userId);
		Optional<UserEntity> op = repouserEntity.findById(userId);
		if (op.isEmpty()) {
			// not found
		} else {
			// data found
			UserEntity user = op.get();
			// send data to jsp ->
			model.addAttribute("user", user);

		}

		return "ViewUser";
	}
	
	@GetMapping("deleteuser")
	public String deleteuser(Integer userId) {
		repouserEntity.deleteById(userId);//delete from members where memberID = :memberId
		return "redirect:/listuser";
	}
	
	@PostMapping("updatepassword")
	public String updatePassword(String email, String password, String otp, Model model) {
		Optional<UserEntity> op = repouserEntity.findByEmail(email);
		if (op.isEmpty()) {
			model.addAttribute("error", "Invalid Data");
			System.out.println(password);
			return "ChangePassword";
		} else {
			UserEntity user = op.get();
			if (user.getOtp().equals(otp)) {
				String encPwd = encoder.encode(password);
				user.setPassword(encPwd);
				user.setOtp("");
				repouserEntity.save(user);// update
				System.out.println(password);
			} else {

				model.addAttribute("error", "Invalid Data");
				return "ChangePassword";
			}
		}
		model.addAttribute("msg","Password updated");
		return "Login";
	}

}
	

