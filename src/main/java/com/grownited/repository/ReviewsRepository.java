package com.grownited.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.grownited.dto.ReviewsDto;
import com.grownited.entity.ReviewsEntity;

@Repository
public interface ReviewsRepository extends JpaRepository<ReviewsEntity, Integer> {
	@Query(value = "select r.*,p.Product_name from product p,reviews r where r.product_id = p.product_id",nativeQuery = true)
	List<ReviewsDto> getAll();
}
