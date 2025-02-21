package com.grownited.controller;

import java.util.List;
import java.util.Optional;

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
	
	@GetMapping("viewwishlist")
	public String viewwishlist(Integer wishlistListId, Model model) {
		// ?
		System.out.println("id ===> " + wishlistListId);
		Optional<WishlistEntity> op = repositoryWishlist.findById(wishlistListId);
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
	public String deletewishlistList(Integer wishlistListId) {
		repositoryWishlist.deleteById(wishlistListId);//delete from members where memberID = :memberId
		return "redirect:/listwishlistList";
	}
}
