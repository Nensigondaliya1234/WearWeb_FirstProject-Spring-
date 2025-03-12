package com.grownited.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.grownited.entity.UserAddressEntity;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddressEntity, Integer> {
	@Query(value = "select us.*,c.cityname,s.statename ,u.first_name,u.last_name from useraddress us,city c,state s, users u where us.city_id = c.city_id AND us.state_id = s.state_id AND us.user_id = u.user_id",nativeQuery = true)
	List<Object[]> getAll();
	
	@Query(value = "select us.*,c.cityname,s.statename ,u.first_name,u.last_name from useraddress us,city c,state s, users u where us.city_id = c.city_id AND us.state_id = s.state_id AND us.user_id = u.user_id AND us.user_address_id = :user_addressId",nativeQuery = true)
	List<Object[]> getByUserAddressId(Integer user_addressId);
}
