package com.grownited.controller;

import java.util.List;
import java.util.Optional;

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
	
	@GetMapping("viewcart")
	public String viewcart(Integer cartId, Model model) {
		// ?
		System.out.println("id ===> " + cartId);
		Optional<CartEntity> op = repositoryCart.findById(cartId);
		if (op.isEmpty()) {
			// not found
		} else {
			// data found
			CartEntity cart = op.get();
			// send data to jsp ->
			model.addAttribute("cart", cart);

		}

		return "ViewCart";
	}
	
	@GetMapping("deletecart")
	public String deletecart(Integer cartId) {
		repositoryCart.deleteById(cartId);//delete from members where memberID = :memberId
		return "redirect:/listcart";
	}
}
