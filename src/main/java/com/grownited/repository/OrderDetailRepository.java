package com.grownited.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.grownited.dto.OrderDetailDto;
import com.grownited.entity.OrderDetailEntity;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Integer>{
	@Query(value = "select od.*, o.total_amount, p. product_name from orders o, order_detail  od, product p where o.order_id = od.order_id and p.product_id = od.product_id",nativeQuery = true)
	List<OrderDetailDto> getAll();
} 