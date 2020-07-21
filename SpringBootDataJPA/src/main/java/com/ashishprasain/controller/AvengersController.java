package com.ashishprasain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashishprasain.dao.AvengerRepo;
import com.ashishprasain.model.Avenger;

@Controller
public class AvengersController {
	
	@Autowired
	AvengerRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAvenger")
	public String addAvenger( Avenger avenger) {
		repo.save(avenger);
		return "home.jsp";
	}
}