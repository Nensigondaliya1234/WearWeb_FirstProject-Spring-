package com.grownited.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.CartEntity;
import com.grownited.entity.ProductEntity;
import com.grownited.entity.UserEntity;
import com.grownited.repository.CartRepository;
import com.grownited.repository.ProductRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class CartController {
	
	@Autowired
	ProductRepository repositoryProduct;
	
	@Autowired
	CartRepository repositoryCart;
	
	@GetMapping("cart")
	public String cart(Model model) {
List<ProductEntity> allProduct = repositoryProduct.findAll();// all state
		
		model.addAttribute("allProduct",allProduct);
		//
	return "Cart";
	}
	@PostMapping("savecart")
	public String savearea(CartEntity cartEntity,HttpSession session) {
		UserEntity user = (UserEntity) session.getAttribute("user");
		Integer userId = user.getUserId(); 
	    cartEntity.setUserId(userId);
		repositoryCart.save(cartEntity);
		return "Cart";
	
	}
	
	@GetMapping("listcart")
	public String listcart(Model model) {
		List<Object[]> cartList = repositoryCart.getAll();
		model.addAttribute("cartList",cartList);
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
