package com.grownited.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.CityEntity;
import com.grownited.repository.CityRepository;

@Controller
public class CityController {
	
	@Autowired
	CityRepository repositoryCity;
	
	@GetMapping("city")
	public String city() {
		//
	return "City";
	}
	@PostMapping("savecity")
	public String savecity(CityEntity cityEntity) {
		System.out.println(cityEntity.getCityname());
		repositoryCity.save(cityEntity);

		return "City";
	
	}
	
	@GetMapping("listcity")
	public String listcity(Model model) {
		List<CityEntity> cityList = repositoryCity.findAll();
		model.addAttribute("cityList", cityList);
	return "ListCity";
	}
	
	@GetMapping("viewcity")
	public String viewcity(Integer cityId, Model model) {
		// ?
		System.out.println("id ===> " + cityId);
		Optional<CityEntity> op = repositoryCity.findById(cityId);
		if (op.isEmpty()) {
			// not found
		} else {
			// data found
			CityEntity city = op.get();
			// send data to jsp ->
			model.addAttribute("city", city);

		}

		return "ViewCity";
	}
	
	@GetMapping("deletecity")
	public String deletecity(Integer cityId) {
		repositoryCity.deleteById(cityId);//delete from members where memberID = :memberId
		return "redirect:/listcity";
	}

}
