package com.grownited.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grownited.entity.CartEntity;

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Integer> {

}
