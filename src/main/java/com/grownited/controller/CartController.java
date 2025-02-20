package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.CartEntity;
import com.grownited.repository.CartRepository;

@Controller
public class CartController {
	
	@Autowired
	CartRepository repositoryCart;
	
	@GetMapping("cart")
	public String cart() {
		//
	return "Cart";
	}
	@PostMapping("savecart")
	public String savearea(CartEntity cartEntity) {
		System.out.println(cartEntity.getQuantity());
		repositoryCart.save(cartEntity);
		return "Cart";
	
	}
	
	@GetMapping("listcart")
	public String listcart(Model model) {
		List<CartEntity> cartList = repositoryCart.findAll();
		model.addAttribute("cartList", cartList);
	return "ListCart";
	}
}
