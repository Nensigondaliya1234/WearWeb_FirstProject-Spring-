package com.grownited.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.ProductEntity;
import com.grownited.entity.UserEntity;
import com.grownited.entity.WishlistEntity;
import com.grownited.repository.ProductRepository;
import com.grownited.repository.WishlistRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class WishlistController {
	
	@Autowired
	ProductRepository repositoryProduct;
	
	@Autowired
	WishlistRepository repositoryWishlist;
	
	@GetMapping("wishlist")
	public String wishlist(Model model) {
     List<ProductEntity> allProduct = repositoryProduct.findAll();// all state
		
		model.addAttribute("allProduct",allProduct);
	return "Wishlist";
	}
	@PostMapping("savewishlist")
	public String savewishlist(WishlistEntity wishlistEntity,HttpSession session) {
		UserEntity user = (UserEntity) session.getAttribute("user");
		Integer userId = user.getUserId(); 
		wishlistEntity.setUserId(userId);
		wishlistEntity.setCreatedAt(Date.valueOf(LocalDate.now()));

		repositoryWishlist.save(wishlistEntity);

		return "Wishlist";
	
	}
	
	@GetMapping("listwishlist")
	public String listwishlist(Model model) {
		List<Object[]> wishlistList = repositoryWishlist.getAll();
		model.addAttribute("wishlistList",wishlistList);
	return "ListWishlist";
	}
	
	@GetMapping("viewwishlist")
	public String viewwishlist(Integer wishlistId, Model model) {
		List<Object[]> op = repositoryWishlist.getByWishlistId(wishlistId);
		model.addAttribute("wishlist", op);

		return "ViewWishlist";
	}
	
	@GetMapping("deletewishlist")
	public String deletewishlist(Integer wishlistId) {
		repositoryWishlist.deleteById(wishlistId);//delete from members where memberID = :memberId
		return "redirect:/listwishlist";
	}
	
	@GetMapping("editwishlist")
	public String editwishlist(Integer wishlistId,Model model) {
		Optional<WishlistEntity> op = repositoryWishlist.findById(wishlistId);
		if (op.isEmpty()) {
			return "redirect:/listarea";
		} else {
			model.addAttribute("area",op.get());
			return "EditWishlist";

		}
	}
	//save -> entity -> no id present -> insert 
	//save -> entity -> id present -> not present in db -> insert 
	//save -> entity -> id present -> present in db -> update  

	@PostMapping("updatewishlist")
	public String updatewishlist(WishlistEntity wishlistEntity) {//pcode vhreg type vid 
		
		System.out.println(wishlistEntity.getWishlistId());//id? db? 

		Optional<WishlistEntity> op = repositoryWishlist.findById(wishlistEntity.getWishlistId());
		
		if(op.isPresent())
		{
			WishlistEntity dbWishlist = op.get(); //pcode vhreg type id userId 
			//dbWishlist.setAreaname(wishlistEntity.get());//code 
			//dbVehicle.setVehicleType(v.getVehicleType());//type 
			//
			repositoryWishlist.save(dbWishlist);
		}
		return "redirect:/listwishlist";
	}
	
}
