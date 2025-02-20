package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.UserAddressEntity;
import com.grownited.repository.UserAddressRepository;

@Controller
public class UserAddressController {
	
	@Autowired
	UserAddressRepository repositoryUserAddress;
	
	@GetMapping("useraddress")
	public String useraddress() {
		//
	return "UserAddress";
	}
	@PostMapping("saveuseraddress")
	public String saveuseraddress(UserAddressEntity useraddressEntity) {
		System.out.println(useraddressEntity.getLandMark());
		System.out.println(useraddressEntity.getStreet());
		System.out.println(useraddressEntity.getTitle());
		System.out.println(useraddressEntity.getUnitName());
		System.out.println(useraddressEntity.getZipcode());
		repositoryUserAddress.save(useraddressEntity);

		return "UserAddress";
	
	}
	
	@GetMapping("listuseraddress")
	public String listuseraddress(Model model) {
		List<UserAddressEntity> useraddressList = repositoryUserAddress.findAll();
		model.addAttribute("useraddressList", useraddressList);
	return "ListUserAddress";
	}
}
