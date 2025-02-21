package com.grownited.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.CategoryEntity;
import com.grownited.repository.CategoryRepository;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryRepository repositoryCategory;
	
	@GetMapping("category")
	public String category() {
		//
	return "Category";
	}
	@PostMapping("savecategory")
	public String savecategory(CategoryEntity categoryEntity) {
		System.out.println(categoryEntity.getCategoryname());
		repositoryCategory.save(categoryEntity);

		return "Category";
	
	}
	
	@GetMapping("listcategory")
	public String listcategory(Model model) {
		List<CategoryEntity> categoryList = repositoryCategory.findAll();
		model.addAttribute("categoryList", categoryList);
	return "ListCategory";
	}
	
	@GetMapping("viewcategory")
	public String viewcategory(Integer categoryId, Model model) {
		// ?
		System.out.println("id ===> " + categoryId);
		Optional<CategoryEntity> op = repositoryCategory.findById(categoryId);
		if (op.isEmpty()) {
			// not found
		} else {
			// data found
			CategoryEntity category = op.get();
			// send data to jsp ->
			model.addAttribute("category", category);

		}

		return "ViewCategory";
	}
	
	@GetMapping("deletecategory")
	public String deletecategory(Integer categoryId) {
		repositoryCategory.deleteById(categoryId);//delete from members where memberID = :memberId
		return "redirect:/listcategory";
	}
}
