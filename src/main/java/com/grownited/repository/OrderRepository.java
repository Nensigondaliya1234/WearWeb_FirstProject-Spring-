package com.grownited.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.grownited.entity.OrdersEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrdersEntity, Integer> {
	@Query(value = "select o.*,u.first_name from users u,orders o where o.user_id = u.user_id",nativeQuery = true)
	List<Object[]> getAll();
}
