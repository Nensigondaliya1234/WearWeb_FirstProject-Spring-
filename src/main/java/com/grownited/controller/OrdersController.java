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
import com.grownited.entity.OrdersEntity;
import com.grownited.entity.UserEntity;
import com.grownited.repository.OrderRepository;

import jakarta.servlet.http.HttpSession;

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
	public String saveorder(OrdersEntity ordersEntity,HttpSession session) {
		UserEntity user = (UserEntity) session.getAttribute("user");
		Integer userId = user.getUserId(); 
		ordersEntity.setUserId(userId);
		ordersEntity.setCreatedAt(Date.valueOf(LocalDate.now()));

		repositoryOrder.save(ordersEntity);

		return "Orders";
	
	}
	
	@GetMapping("listorder")
	public String listorder(Model model) {
		List<OrdersEntity> ordersList = repositoryOrder.findAll();
		model.addAttribute("ordersList", ordersList);
	return "ListOrders";
	}
	
	@GetMapping("vieworders")
	public String vieworders(Integer orderId, Model model) {
		// ?
		System.out.println("id ===> " + orderId);
		Optional<OrdersEntity> op = repositoryOrder.findById(orderId);
		if (op.isEmpty()) {
			// not found
		} else {
			// data found
			OrdersEntity order = op.get();
			// send data to jsp ->
			model.addAttribute("order", order);

		}

		return "ViewOrders";
	}
	
	@GetMapping("deleteorders")
	public String deleteorders(Integer orderId) {
		repositoryOrder.deleteById(orderId);//delete from members where memberID = :memberId
		return "redirect:/listorder";
	}
}
