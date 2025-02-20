package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.WishlistEntity;
import com.grownited.repository.WishlistRepository;

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
	public String savewishlist(WishlistEntity wishlistEntity) {
		//
		repositoryWishlist.save(wishlistEntity);

		return "Wishlist";
	
	}
	
	@GetMapping("listwishlist")
	public String listwishlist(Model model) {
		List<WishlistEntity> wishlistList = repositoryWishlist.findAll();
		model.addAttribute("wishlistList", wishlistList);
	return "ListWishlist";
	}
}
