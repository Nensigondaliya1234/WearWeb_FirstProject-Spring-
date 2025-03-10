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

import com.grownited.entity.CategoryEntity;
import com.grownited.entity.ProductEntity;
import com.grownited.entity.SubCategoryEntity;
import com.grownited.repository.CategoryRepository;
import com.grownited.repository.ProductRepository;
import com.grownited.repository.SubCategoryRepository;

@Controller
public class ProductController {
	
	@Autowired
	CategoryRepository repositoryCategory;
	
	@Autowired
	SubCategoryRepository repositorySubCategory;
	
	@Autowired
	ProductRepository repositoryproduct;
	
	@GetMapping("product")
	public String product(Model model) {
    List<CategoryEntity> allCategory = repositoryCategory.findAll();// all state
	model.addAttribute("allCategory",allCategory);
	
	List<SubCategoryEntity> allSubCategory = repositorySubCategory.findAll();// all state
	model.addAttribute("allSubCategory",allSubCategory);
	return "Product";
	}
	
	@PostMapping("saveproduct")
	public String saveproduct(ProductEntity productEntity) {
		productEntity.setCreatedAt(Date.valueOf(LocalDate.now()));

		repositoryproduct.save(productEntity);

		return "Product";
	
	}
	
	@GetMapping("listproduct")
	public String listproduct(Model model) {
		List<ProductEntity> productList = repositoryproduct.findAll();
		model.addAttribute("productList", productList);
	return "ListProduct";
	}
	
	@GetMapping("viewproduct")
	public String viewproduct(Integer productId, Model model) {
		// ?
		System.out.println("id ===> " + productId);
		Optional<ProductEntity> op = repositoryproduct.findById(productId);
		if (op.isEmpty()) {
			// not found
		} else {
			// data found
			ProductEntity product = op.get();
			// send data to jsp ->
			model.addAttribute("product", product);

		}

		return "ViewProduct";
	}
	
	@GetMapping("deleteproduct")
	public String deleteproduct(Integer productId) {
		repositoryproduct.deleteById(productId);//delete from members where memberID = :memberId
		return "redirect:/listproduct";
	}
}
