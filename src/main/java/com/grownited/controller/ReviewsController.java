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
		reviewsEntity.setCreatedAt(Date.valueOf(LocalDate.now()));

		repositoryreviews.save(reviewsEntity);

		return "Reviews";
	
	}
	
	@GetMapping("listreviews")
	public String listreviews(Model model) {
		List<ReviewsEntity> reviewsList = repositoryreviews.findAll();
		model.addAttribute("reviewsList", reviewsList);
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
