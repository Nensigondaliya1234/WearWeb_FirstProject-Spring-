package com.grownited.controller;

import java.util.List;
import java.util.Optional;

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
	
	
	@GetMapping("edituseraddress")
	public String edituseraddress(Integer userAddressId,Model model) {
		Optional<UserAddressEntity> op = repositoryUserAddress.findById(userAddressId);
		if (op.isEmpty()) {
			return "redirect:/listuseraddress";
		} else {
			model.addAttribute("useraddress",op.get());
			return "EditUserAddress";

		}
	}
	//save -> entity -> no id present -> insert 
	//save -> entity -> id present -> not present in db -> insert 
	//save -> entity -> id present -> present in db -> update  

	@PostMapping("updateuseraddress")
	public String updateuseraddress(UserAddressEntity useraddressEntity) {//pcode vhreg type vid 
		
		System.out.println(useraddressEntity.getUserAddressId());//id? db? 

		Optional<UserAddressEntity> op = repositoryUserAddress.findById(useraddressEntity.getUserAddressId());
		
		if(op.isPresent())
		{
			UserAddressEntity dbUserAddress = op.get(); //pcode vhreg type id userId 
			dbUserAddress.setLandMark(useraddressEntity.getLandMark());//code 
			dbUserAddress.setStreet(useraddressEntity.getStreet());//code 
			dbUserAddress.setTitle(useraddressEntity.getTitle());//code 
			dbUserAddress.setUnitName(useraddressEntity.getUnitName());//code 
			dbUserAddress.setZipcode(useraddressEntity.getZipcode());//code 

			//
			repositoryUserAddress.save(dbUserAddress);
		}
		return "redirect:/listuseraddress";
	}
}
