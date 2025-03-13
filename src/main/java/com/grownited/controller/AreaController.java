package com.grownited.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.AreaEntity;
import com.grownited.entity.CityEntity;
import com.grownited.repository.AreaRepository;
import com.grownited.repository.CityRepository;

@Controller
public class AreaController {
	
	@Autowired
	AreaRepository repositoryArea;
	
	@Autowired
	CityRepository repositoryCity;
	
	@GetMapping("area")
	public String area(Model model) {
     List<CityEntity> allCity = repositoryCity.findAll();// all state
		
		model.addAttribute("allCity",allCity);
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
	
	
	@GetMapping("viewarea")
	public String viewarea(Integer areaId, Model model) {
		// ?
		System.out.println("id ===> " + areaId);
		Optional<AreaEntity> op = repositoryArea.findById(areaId);
		if (op.isEmpty()) {
			// not found
		} else {
			// data found
			AreaEntity area = op.get();
			// send data to jsp ->
			model.addAttribute("area", area);

		}

		return "ViewArea";
	}
	
	@GetMapping("deletearea")
	public String deletearea(Integer areaId) {
		repositoryArea.deleteById(areaId);//delete from members where memberID = :memberId
		return "redirect:/listarea";
	}
	
	
	@GetMapping("editarea")
	public String editarea(Integer areaId,Model model) {
		Optional<AreaEntity> op = repositoryArea.findById(areaId);
		if (op.isEmpty()) {
			return "redirect:/listarea";
		} else {
			model.addAttribute("area",op.get());
			return "EditArea";

		}
	}
	//save -> entity -> no id present -> insert 
	//save -> entity -> id present -> not present in db -> insert 
	//save -> entity -> id present -> present in db -> update  

	@PostMapping("updatearea")
	public String updatearea(AreaEntity areaEntity) {//pcode vhreg type vid 
		
		System.out.println(areaEntity.getAreaId());//id? db? 

		Optional<AreaEntity> op = repositoryArea.findById(areaEntity.getAreaId());
		
		if(op.isPresent())
		{
			AreaEntity dbArea = op.get(); //pcode vhreg type id userId 
			dbArea.setAreaname(areaEntity.getAreaname());//code 
			//dbVehicle.setVehicleType(v.getVehicleType());//type 
			//
			repositoryArea.save(dbArea);
		}
		return "redirect:/listarea";
	}
	
	
}
