package com.grownited.controller;
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
		reviewsEntity.setCreatedAt(LocalDate.now());

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
		List<Object[]> op = repositoryreviews.getByReviewsId(reviewsId);
		model.addAttribute("reviews", op);

		return "ViewReviews";
	}
	
	@GetMapping("deletereviews")
	public String deletereviews(Integer reviewsId) {
		repositoryreviews.deleteById(reviewsId);//delete from members where memberID = :memberId
		return "redirect:/listreviews";
	}
	
	@GetMapping("editreviews")
	public String editreviews(Integer reviewsId,Model model) {
		Optional<ReviewsEntity> op = repositoryreviews.findById(reviewsId);
		if (op.isEmpty()) {
			return "redirect:/listreviews";
		} else {
			model.addAttribute("reviews",op.get());
			return "EditReviews";

		}
	}
	//save -> entity -> no id present -> insert 
	//save -> entity -> id present -> not present in db -> insert 
	//save -> entity -> id present -> present in db -> update  

	@PostMapping("updatereviews")
	public String updatereviews(ReviewsEntity reviewsEntity) {//pcode vhreg type vid 
		
		System.out.println(reviewsEntity.getReviewsId());//id? db? 

		Optional<ReviewsEntity> op = repositoryreviews.findById(reviewsEntity.getReviewsId());
		
		if(op.isPresent())
		{
			ReviewsEntity dbReviews = op.get(); //pcode vhreg type id userId 
			dbReviews.setRating(reviewsEntity.getRating());//code 
			dbReviews.setReviewText(reviewsEntity.getReviewText());//code 

			//dbVehicle.setVehicleType(v.getVehicleType());//type 
			//
			repositoryreviews.save(dbReviews);
		}
		return "redirect:/listreviews";
	}
	
	
}
