package com.grownited.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.grownited.dto.WishlistDto;
import com.grownited.entity.WishlistEntity;
@Repository
public interface WishlistRepository extends JpaRepository<WishlistEntity, Integer> {
	@Query(value = "select w.*,p.product_name from product p,wishlist w where w.product_id = p.product_id",nativeQuery = true)
	List<WishlistDto> getAll();
}
