package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.ReviewsEntity;
import com.grownited.repository.ReviewsRepository;

@Controller
public class ReviewsController {
	
	@Autowired
	ReviewsRepository repositoryreviews;
	
	@GetMapping("reviews")
	public String reviews() {
		//
	return "Reviews";
	}
	@PostMapping("savereviews")
	public String savereviews(ReviewsEntity reviewsEntity) {
		System.out.println(reviewsEntity.getRating());
		System.out.println(reviewsEntity.getReviewText());
		repositoryreviews.save(reviewsEntity);

		return "Reviews";
	
	}
	
	@GetMapping("listreviews")
	public String listreviews(Model model) {
		List<ReviewsEntity> reviewsList = repositoryreviews.findAll();
		model.addAttribute("reviewsList", reviewsList);
	return "ListReviews";
	}
}
