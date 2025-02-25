package com.grownited.controller;


import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String saveUser(UserEntity userEntity) {
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
	@GetMapping("changepassword")
		public String changepassword() {
			//
		return "ChangePassword";
			
	}
	@PostMapping("sendOtp")
	public String sendOtp(UserEntity userEntity) {
		System.out.println(userEntity.getEmail());

		
	    return "ChangePassword";
	}
	@PostMapping("resetPassword")
	public String resetPassword(UserEntity userEntity) {
		System.out.println(userEntity.getPassword());
		return "ChangePassword";
	}
	@PostMapping("updatepassword")
	public String updatepassword(UserEntity userEntity) {
		System.out.println(userEntity.getPassword());
		return "Login";
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
				session.setAttribute("user", dbUser); // session -> user set
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
	
}
	

