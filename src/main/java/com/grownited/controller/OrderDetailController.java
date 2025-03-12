package com.grownited.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.OrderDetailEntity;
import com.grownited.entity.OrdersEntity;
import com.grownited.entity.ProductEntity;
import com.grownited.repository.OrderDetailRepository;
import com.grownited.repository.OrderRepository;
import com.grownited.repository.ProductRepository;

@Controller
public class OrderDetailController {
	
	@Autowired
	ProductRepository repositoryProduct;
	
	@Autowired
	OrderRepository repositoryOrder;
	
	@Autowired
	OrderDetailRepository repositoryOrderdetail;
	
	@GetMapping("orderdetail")
	public String orderdetail(Model model) {
		List<ProductEntity> allProduct = repositoryProduct.findAll();
		model.addAttribute("allProduct",allProduct);
        List<OrdersEntity> allOrder = repositoryOrder.findAll();
		model.addAttribute("allOrder",allOrder);
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
		List<Object[]> orderdetailList = repositoryOrderdetail.getAll();
		model.addAttribute("orderdetailList",orderdetailList);
	return "ListOrderDetail";
	}
	
	@GetMapping("vieworderdetail")
	public String vieworderdetail(Integer orderDetailId, Model model) {
		List<Object[]> op = repositoryOrderdetail.getByOrderDetailId(orderDetailId);
		model.addAttribute("orderDetail", op);
		return "ViewOrderDetail";
	}
	
	@GetMapping("deleteorderdetail")
	public String deleteorderdetail(Integer orderDetailId) {
		repositoryOrderdetail.deleteById(orderDetailId);//delete from members where memberID = :memberId
		return "redirect:/listorderdetail";
	}
}
