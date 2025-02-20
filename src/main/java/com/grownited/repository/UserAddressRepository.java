package com.grownited.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grownited.entity.UserAddressEntity;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddressEntity, Integer> {

}
