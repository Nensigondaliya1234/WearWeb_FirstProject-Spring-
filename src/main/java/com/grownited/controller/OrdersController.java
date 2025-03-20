package com.grownited.controller;
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
        ordersEntity.setCreatedAt(LocalDate.now()); 

		repositoryOrder.save(ordersEntity);

		return "Orders";
	
	}
	
	@GetMapping("listorder")
	public String listorder(Model model) {
		List<Object[]> ordersList = repositoryOrder.getAll();
		model.addAttribute("ordersList",ordersList);
	return "ListOrders";
	}
	
	@GetMapping("vieworders")
	public String vieworders(Integer orderId, Model model) {
		List<Object[]> op = repositoryOrder.getByOrderId(orderId);
		model.addAttribute("order", op);

		return "ViewOrders";
	}
	
	@GetMapping("deleteorders")
	public String deleteorders(Integer orderId) {
		repositoryOrder.deleteById(orderId);//delete from members where memberID = :memberId
		return "redirect:/listorder";
	}
	
	
	@GetMapping("editorders")
	public String editorders(Integer orderId,Model model) {
		Optional<OrdersEntity> op = repositoryOrder.findById(orderId);
		if (op.isEmpty()) {
			return "redirect:/listorders";
		} else {
			model.addAttribute("order",op.get());
			return "EditOrders";

		}
	}
	//save -> entity -> no id present -> insert 
	//save -> entity -> id present -> not present in db -> insert 
	//save -> entity -> id present -> present in db -> update  

	@PostMapping("updateorder")
	public String updateorders(OrdersEntity orderEntity) {//pcode vhreg type vid 
		
		System.out.println(orderEntity.getOrderId());//id? db? 

		Optional<OrdersEntity> op = repositoryOrder.findById(orderEntity.getOrderId());
		
		if(op.isPresent())
		{
			OrdersEntity dbOrder = op.get(); //pcode vhreg type id userId 
			dbOrder.setStatus(orderEntity.getStatus());//code 
			//dbVehicle.setVehicleType(v.getVehicleType());//type 
			//
			repositoryOrder.save(dbOrder);
		}
		return "redirect:/listorder";
	}
}
