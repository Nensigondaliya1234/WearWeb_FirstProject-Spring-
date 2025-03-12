package com.grownited.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.CategoryEntity;
import com.grownited.entity.SubCategoryEntity;
import com.grownited.repository.CategoryRepository;
import com.grownited.repository.SubCategoryRepository;

@Controller
public class SubCategoryController {
	
	@Autowired
	CategoryRepository repositoryCategory;
	
	@Autowired
	SubCategoryRepository repositorySubCategory;
	
	@GetMapping("subcategory")
	public String subcategory(Model model) {
    List<CategoryEntity> allCategory = repositoryCategory.findAll();// all state
		
		model.addAttribute("allCategory",allCategory);
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
		List<Object[]> subcategoryList = repositorySubCategory.getAll();
		model.addAttribute("subcategoryList",subcategoryList);
	return "ListSubCategory";
	}
	
	
	@GetMapping("viewsubcategory")
	public String viewsubcategory(Integer subCategoryId, Model model) {
		List<Object[]> op = repositorySubCategory.getBySubCategoryId(subCategoryId);
		model.addAttribute("subCategory", op);

		return "ViewSubCategory";
	}
	
	@GetMapping("deletesubcategory")
	public String deletesubcategory(Integer subCategoryId) {
		repositorySubCategory.deleteById(subCategoryId);//delete from members where memberID = :memberId
		return "redirect:/listsubcategory";
	}
	
}
