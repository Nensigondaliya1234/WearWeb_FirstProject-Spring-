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
		return "redirect:/cart";
	
	}
	
	@GetMapping("listcart")
	public String listcart(Model model) {
		List<Object[]> cartList = repositoryCart.getAll();
		model.addAttribute("cartList",cartList);
	return "ListCart";
	}
	
	@GetMapping("viewcart")
	public String viewcart(Integer cartId, Model model) {
		List<Object[]> op = repositoryCart.getByCartId(cartId);
		model.addAttribute("cart", op);

		return "ViewCart";
	}
	
	@GetMapping("deletecart")
	public String deletecart(Integer cartId) {
		repositoryCart.deleteById(cartId);//delete from members where memberID = :memberId
		return "redirect:/listcart";
	}
	
	
	@GetMapping("editcart")
	public String editcart(Integer cartId,Model model) {
		Optional<CartEntity> op = repositoryCart.findById(cartId);
		if (op.isEmpty()) {
			return "redirect:/listcart";
		} else {
			model.addAttribute("cart",op.get());
			return "EditCart";

		}
	}
	//save -> entity -> no id present -> insert 
	//save -> entity -> id present -> not present in db -> insert 
	//save -> entity -> id present -> present in db -> update  

	@PostMapping("updatecart")
	public String updatecart(CartEntity cartEntity) {//pcode vhreg type vid 
		
		System.out.println(cartEntity.getCartId());//id? db? 

		Optional<CartEntity> op = repositoryCart.findById(cartEntity.getCartId());
		
		if(op.isPresent())
		{
			CartEntity dbCart = op.get(); //pcode vhreg type id userId 
			dbCart.setQuantity(cartEntity.getQuantity());//code 
			//dbVehicle.setVehicleType(cartEntity.getVehicleType());//type 
			//
			repositoryCart.save(dbCart);
		}
		return "redirect:/listcart";
	}
}
