package com.grownited.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.ProductEntity;
import com.grownited.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository repositoryproduct;
	
	@GetMapping("product")
	public String product() {
		//
	return "Product";
	}
	@PostMapping("saveproduct")
	public String saveproduct(ProductEntity productEntity) {
		System.out.println(productEntity.getBasePrice());
		System.out.println(productEntity.getOfferePercentage());
		System.out.println(productEntity.getOfferePrice());
		System.out.println(productEntity.getProductDetail());
		System.out.println(productEntity.getProductImageURL1());
		System.out.println(productEntity.getProductImageURL2());
		System.out.println(productEntity.getProductImageURL3());
		System.out.println(productEntity.getProductName());
		System.out.println(productEntity.getQuantity());
		System.out.println(productEntity.getCategoryId());
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
