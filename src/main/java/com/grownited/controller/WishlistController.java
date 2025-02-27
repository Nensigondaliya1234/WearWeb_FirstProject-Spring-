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

import com.grownited.entity.UserEntity;
import com.grownited.entity.WishlistEntity;
import com.grownited.repository.WishlistRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class WishlistController {
	
	@Autowired
	WishlistRepository repositoryWishlist;
	
	@GetMapping("wishlist")
	public String wishlist() {
		//
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
		List<WishlistEntity> wishlistList = repositoryWishlist.findAll();
		model.addAttribute("wishlistList", wishlistList);
	return "ListWishlist";
	}
	
	@GetMapping("viewwishlist")
	public String viewwishlist(Integer wishlistId, Model model) {
		// ?
		System.out.println("id ===> " + wishlistId);
		Optional<WishlistEntity> op = repositoryWishlist.findById(wishlistId);
		if (op.isEmpty()) {
			// not found
		} else {
			// data found
			WishlistEntity wishlistList = op.get();
			// send data to jsp ->
			model.addAttribute("wishlistList", wishlistList);

		}

		return "ViewWishlist";
	}
	
	@GetMapping("deletewishlistList")
	public String deletewishlistList(Integer wishlistId) {
		repositoryWishlist.deleteById(wishlistId);//delete from members where memberID = :memberId
		return "redirect:/listwishlistList";
	}
}
