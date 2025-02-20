package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.OrdersEntity;
import com.grownited.repository.OrderRepository;

@Controller
public class OrdersController {
	
	@Autowired
	OrderRepository repositoryOrder;
	
	@GetMapping("orders")
	public String orders() {
		//
	return "Orders";
	}
	@PostMapping("saveorder")
	public String saveorder(OrdersEntity ordersEntity) {
		System.out.println(ordersEntity.getStatus());
		System.out.println(ordersEntity.getTotalAmount());
		repositoryOrder.save(ordersEntity);

		return "Orders";
	
	}
	
	@GetMapping("listorder")
	public String listorder(Model model) {
		List<OrdersEntity> ordersList = repositoryOrder.findAll();
		model.addAttribute("ordersList", ordersList);
	return "ListOrders";
	}
}
