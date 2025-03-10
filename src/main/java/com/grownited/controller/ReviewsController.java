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
import com.grownited.entity.ReviewsEntity;
import com.grownited.entity.UserEntity;
import com.grownited.repository.ProductRepository;
import com.grownited.repository.ReviewsRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class ReviewsController {
	
	@Autowired
	ProductRepository repositoryProduct;
	
	@Autowired
	ReviewsRepository repositoryreviews;
	
	@GetMapping("reviews")
	public String reviews(Model model) {
List<ProductEntity> allProduct = repositoryProduct.findAll();// all state
		
		model.addAttribute("allProduct",allProduct);
	return "Reviews";
	}
	@PostMapping("savereviews")
	public String savereviews(ReviewsEntity reviewsEntity,HttpSession session) {
		UserEntity user = (UserEntity) session.getAttribute("user");
		Integer userId = user.getUserId(); 
		reviewsEntity.setUserId(userId);
		reviewsEntity.setCreatedAt(Date.valueOf(LocalDate.now()));

		repositoryreviews.save(reviewsEntity);

		return "Reviews";
	
	}
	
	@GetMapping("listreviews")
	public String listreviews(Model model) {
		List<Object[]> reviewsList = repositoryreviews.getAll();
		model.addAttribute("reviewsList",reviewsList);
	return "ListReviews";
	}
	
	@GetMapping("viewreviews")
	public String viewreviews(Integer reviewsId, Model model) {
		// ?
		System.out.println("id ===> " + reviewsId);
		Optional<ReviewsEntity> op = repositoryreviews.findById(reviewsId);
		if (op.isEmpty()) {
			// not found
		} else {
			// data found
			ReviewsEntity reviews = op.get();
			// send data to jsp ->
			model.addAttribute("reviews", reviews);

		}

		return "ViewReviews";
	}
	
	@GetMapping("deletereviews")
	public String deletereviews(Integer reviewsId) {
		repositoryreviews.deleteById(reviewsId);//delete from members where memberID = :memberId
		return "redirect:/listreviews";
	}
}
