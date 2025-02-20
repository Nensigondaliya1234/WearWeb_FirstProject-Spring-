package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.AreaEntity;
import com.grownited.repository.AreaRepository;

@Controller
public class AreaController {
	
	@Autowired
	AreaRepository repositoryArea;
	
	@GetMapping("area")
	public String area() {
		//
	return "Area";
	}
	@PostMapping("savearea")
	public String savearea(AreaEntity areaEntity) {
		System.out.println(areaEntity.getAreaname());
		repositoryArea.save(areaEntity);
		
		return "City";
	
	}
	
	@GetMapping("listarea")
	public String listarea(Model model) {
		List<AreaEntity> areaList = repositoryArea.findAll();
		model.addAttribute("areaList", areaList);
	return "ListArea";
	}
}
