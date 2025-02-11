package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SessionController {

	
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
	public String saveUser() {
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
	@PostMapping("sendOpt")
	public String sendOtp() {
		return "ChangePassword";
	}
	@PostMapping("resetPassword")
	public String resetPassword() {
		return "ChangePassword";
	}
	@PostMapping("updatepassword")
	public String updatepassword() {
		return "Login";
	}
	
	
}
