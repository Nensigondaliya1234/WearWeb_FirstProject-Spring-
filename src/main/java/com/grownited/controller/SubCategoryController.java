package com.grownited.controller;

import java.util.List;
import java.util.Optional;

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
	
	
	@GetMapping("editsubcategory")
	public String editsubcategory(Integer subCategoryId,Model model) {
		Optional<SubCategoryEntity> op = repositorySubCategory.findById(subCategoryId);
		if (op.isEmpty()) {
			return "redirect:/listsubcategory";
		} else {
			model.addAttribute("subcategory",op.get());
			return "EditSubCategory";

		}
	}
	//save -> entity -> no id present -> insert 
	//save -> entity -> id present -> not present in db -> insert 
	//save -> entity -> id present -> present in db -> update  

	@PostMapping("updatesubcategory")
	public String updatesubcategory(SubCategoryEntity subcategoryEntity) {//pcode vhreg type vid 
		
		System.out.println(subcategoryEntity.getSubCategoryId());//id? db? 

		Optional<SubCategoryEntity> op = repositorySubCategory.findById(subcategoryEntity.getSubCategoryId());
		
		if(op.isPresent())
		{
			SubCategoryEntity dbSubCategory = op.get(); //pcode vhreg type id userId 
			dbSubCategory.setSubCategoryname(subcategoryEntity.getSubCategoryname());//code 
			//dbVehicle.setVehicleType(v.getVehicleType());//type 
			//
			repositorySubCategory.save(dbSubCategory);
		}
		return "redirect:/listsubcategory";
	}
	
	
	
}
