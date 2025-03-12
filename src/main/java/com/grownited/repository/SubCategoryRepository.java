package com.grownited.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.grownited.entity.SubCategoryEntity;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategoryEntity, Integer> {
	@Query(value = "select s.*,c.categoryname from  sub_category s,category c where s.category_id = c.category_id",nativeQuery = true)
	List<Object[]> getAll();
	
	@Query(value = "select s.*,c.categoryname from  sub_category s,category c where s.category_id = c.category_id  and s.sub_category_id = :sub_categoryId",nativeQuery = true)
	List<Object[]> getBySubCategoryId(Integer sub_categoryId);
}
