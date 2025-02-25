package com.grownited.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.OrderDetailEntity;
import com.grownited.repository.OrderDetailRepository;

@Controller
public class OrderDetailController {
	
	@Autowired
	OrderDetailRepository repositoryOrderdetail;
	
	@GetMapping("orderdetail")
	public String orderdetail() {
		//
	return "OrderDetail";
	}
	@PostMapping("saveorderdetail")
	public String saveorderdetail(OrderDetailEntity orderDetailEntity) {
		System.out.println(orderDetailEntity.getQuantity());
		System.out.println(orderDetailEntity.getStatus());
		repositoryOrderdetail.save(orderDetailEntity);

		return "OrderDetail";
	
	}
	
	@GetMapping("listorderdetail")
	public String listorderdetail(Model model) {
		List<OrderDetailEntity> orderdetailList = repositoryOrderdetail.findAll();
		model.addAttribute("orderdetailList", orderdetailList);
	return "ListOrderDetail";
	}
	
	@GetMapping("vieworderdetail")
	public String vieworderdetail(Integer orderDetailId, Model model) {
		// ?
		System.out.println("id ===> " + orderDetailId);
		Optional<OrderDetailEntity> op = repositoryOrderdetail.findById(orderDetailId);
		if (op.isEmpty()) {
			// not found
		} else {
			// data found
			OrderDetailEntity orderdetail = op.get();
			// send data to jsp ->
			model.addAttribute("orderdetail", orderdetail);

		}

		return "ViewOrderDetail";
	}
	
	@GetMapping("deleteorderdetail")
	public String deleteorderdetail(Integer orderDetailId) {
		repositoryOrderdetail.deleteById(orderDetailId);//delete from members where memberID = :memberId
		return "redirect:/listorderdetail";
	}
}
