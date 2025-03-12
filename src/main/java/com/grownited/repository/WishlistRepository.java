package com.grownited.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.grownited.entity.WishlistEntity;
@Repository
public interface WishlistRepository extends JpaRepository<WishlistEntity, Integer> {
	@Query(value = "select w.*,p.product_name,u.first_name,u.last_name from product p,wishlist w ,users u where w.product_id = p.product_id and w.user_id = u.user_id",nativeQuery = true)
	List<Object[]> getAll();
	
	@Query(value = "select w.*,p.product_name,u.first_name,u.last_name from product p,wishlist w ,users u where w.product_id = p.product_id and w.user_id = u.user_id and w.wishlist_id = :wishlistId",nativeQuery = true)
	List<Object[]> getByWishlistId(Integer wishlistId);
}
