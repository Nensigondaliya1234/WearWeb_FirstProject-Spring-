package com.grownited.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.grownited.entity.CartEntity;

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Integer> {
	@Query(value = "select c.*,p.product_name from product p,cart c where p.product_id = c.cart_id",nativeQuery = true)
	List<Object[]> getAll();
}
