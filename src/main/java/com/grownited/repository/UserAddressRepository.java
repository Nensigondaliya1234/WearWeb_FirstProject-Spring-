package com.grownited.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.grownited.entity.UserAddressEntity;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddressEntity, Integer> {
	@Query(value = "select u.*,c.cityname,s.statename from useraddress u,city c,state s where u.city_id = c.city_id AND u.state_id = s.state_id",nativeQuery = true)
	List<Object[]> getAll();
}
