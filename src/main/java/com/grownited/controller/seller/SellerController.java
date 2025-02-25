package com.grownited.controller.seller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SellerController {
	@GetMapping("sellerdashboard")
	public String sellerdashboard() {
		//
		return "SellerDashboard";
		
	}

}
