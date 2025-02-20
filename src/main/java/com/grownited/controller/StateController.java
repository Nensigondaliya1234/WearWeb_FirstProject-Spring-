package com.grownited.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.StateEntity;
import com.grownited.repository.StateRepository;



@Controller
public class StateController {
	
	@Autowired
	StateRepository repositorystate;
	
	@GetMapping("newstate")
	public String newstate() {
		//
	return "NewState";
	}
	@PostMapping("savestate")
	public String savestate(StateEntity stateEntity) {
		System.out.println(stateEntity.getStatename());
		repositorystate.save(stateEntity);
		repositorystate.save(stateEntity);

		return "Home";
	
	}
	@GetMapping("liststate")
	public String liststate(Model model) {
		List<StateEntity> stateList = repositorystate.findAll();
		model.addAttribute("stateList", stateList);
	return "ListState";
	}
	
    
	
    
}
