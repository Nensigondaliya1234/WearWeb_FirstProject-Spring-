package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.SubCategoryEntity;
import com.grownited.repository.SubCategoryRepository;

@Controller
public class SubCategoryController {
	
	@Autowired
	SubCategoryRepository repositorySubCategory;
	
	@GetMapping("subcategory")
	public String subcategory() {
		//
	return "SubCategory";
	}
	@PostMapping("savesubcategory")
	public String savesubcategory(SubCategoryEntity subcategoryEntity) {
		System.out.println(subcategoryEntity.getSubCategoryname());
		repositorySubCategory.save(subcategoryEntity);

		return "SubCategory";
	
	}
	
	@GetMapping("listsubcategory")
	public String listsubcategory(Model model) {
		List<SubCategoryEntity> subcategoryList = repositorySubCategory.findAll();
		model.addAttribute("subcategoryList", subcategoryList);
	return "ListSubCategory";
	}
}
