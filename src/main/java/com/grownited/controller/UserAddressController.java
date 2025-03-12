package com.grownited.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.CityEntity;
import com.grownited.entity.StateEntity;
import com.grownited.entity.UserAddressEntity;
import com.grownited.entity.UserEntity;
import com.grownited.repository.CityRepository;
import com.grownited.repository.StateRepository;
import com.grownited.repository.UserAddressRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserAddressController {
	
	@Autowired
	CityRepository repositoryCity;
	
	@Autowired
	StateRepository repositoryState;
	
	@Autowired
	UserAddressRepository repositoryUserAddress;
	
	@GetMapping("useraddress")
	public String useraddress(Model model) {
		
    List<CityEntity> allCity = repositoryCity.findAll();// all city
		
		model.addAttribute("allCity",allCity);
    List<StateEntity> allState = repositoryState.findAll();// all state
		
		model.addAttribute("allState",allState);
		
	return "UserAddress";
	}
	@PostMapping("saveuseraddress")
	public String saveuseraddress(UserAddressEntity useraddressEntity,HttpSession session) {
		UserEntity user = (UserEntity) session.getAttribute("user");
		Integer userId = user.getUserId(); 
		useraddressEntity.setUserId(userId);
		repositoryUserAddress.save(useraddressEntity);

		return "UserAddress";
	
	}
	
	@GetMapping("listuseraddress")
	public String listuseraddress(Model model) {
		List<Object[]> useraddressList = repositoryUserAddress.getAll();
		model.addAttribute("useraddressList",useraddressList);
	return "ListUserAddress";
	}
	
	@GetMapping("viewuseraddress")
	public String viewuseraddress(Integer userAddressId, Model model) {
		List<Object[]> op = repositoryUserAddress.getByUserAddressId(userAddressId);
		model.addAttribute("userAddress", op);

		return "ViewUserAddress";
	}
	
	@GetMapping("deleteuseraddress")
	public String deleteuseraddress(Integer userAddressId) {
		repositoryUserAddress.deleteById(userAddressId);//delete from members where memberID = :memberId
		return "redirect:/listuseraddress";
	}
}
