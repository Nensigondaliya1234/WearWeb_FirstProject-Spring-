package com.grownited.controller;
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
		productEntity.setCreatedAt(LocalDate.now());
		
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
	
	
	@GetMapping("editproduct")
	public String editproduct(Integer productId,Model model) {
		Optional<ProductEntity> op = repositoryproduct.findById(productId);
		if (op.isEmpty()) {
			return "redirect:/listproduct";
		} else {
			model.addAttribute("product",op.get());
			return "EditProduct";

		}
	}
	//save -> entity -> no id present -> insert 
	//save -> entity -> id present -> not present in db -> insert 
	//save -> entity -> id present -> present in db -> update  

	@PostMapping("updateproduct")
	public String updateproduct(ProductEntity productEntity) {//pcode vhreg type vid 
		
		System.out.println(productEntity.getProductId());//id? db? 

		Optional<ProductEntity> op = repositoryproduct.findById(productEntity.getProductId());
		
		if(op.isPresent())
		{
			ProductEntity dbProduct = op.get(); //pcode vhreg type id userId 
			dbProduct.setOfferePrice(productEntity.getOfferePrice());//code
			dbProduct.setOfferePercentage(productEntity.getOfferePercentage());//code 
			dbProduct.setProductImage(productEntity.getProductImage());//code 
			dbProduct.setProductImage2(productEntity.getProductImage2());//code 
			dbProduct.setProductImage3(productEntity.getProductImage3());//code 
			dbProduct.setProductName(productEntity.getProductName());//code 

			repositoryproduct.save(dbProduct);
		}
		return "redirect:/listproduct";
	}
}
