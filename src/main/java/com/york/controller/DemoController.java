package com.york.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

import com.york.dao.*;
import com.york.model.*;

@Controller
@RequestMapping(value="/demo")
public class DemoController {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	Code code;
		
	@RequestMapping(value="/form2", method=RequestMethod.POST)
	public ModelAndView addingStock(@ModelAttribute Formdemo formdemo,HttpServletRequest req) {		
		ModelAndView modelAndView = new ModelAndView("spring-form-demo");
		modelAndView.addObject("formdemo",formdemo);
		modelAndView.addObject("interestList", code.getInterestList());
		modelAndView.addObject("sexOptions", code.getSexOptions());
		modelAndView.addObject("skills", code.getSkills());
		modelAndView.addObject("countryList", code.getCountryList());
		
		System.out.println(formdemo.toString());
		return modelAndView;
	}
	
	@RequestMapping(value="/form", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView testValidationJs() {
		
		Formdemo formdemo= new  Formdemo();
		formdemo.setFirstName("York");
		formdemo.setLastName("Chen");
		formdemo.setReceiveNewsletter(false);;
		
		List<String> interests=new ArrayList<String>();
		interests.add("Basketball");
		interests.add("Swimming");
		formdemo.setInterests(interests);
		
		formdemo.setFavouriteWord("Cooking");

		formdemo.setSex("M");
		
		List<String> myskills= new ArrayList<String>();
		myskills.add("Java");
		myskills.add("Oracle");
		formdemo.setSkills(myskills);
				
		formdemo.setPassword("mypassword!");
				
		formdemo.setCountry("CA");
		
		formdemo.setNotes("This is a node");;
				
		ModelAndView modelAndView = new ModelAndView("spring-form-demo");
		modelAndView.addObject("interestList", code.getInterestList());
		modelAndView.addObject("sexOptions", code.getSexOptions());
		modelAndView.addObject("skills", code.getSkills());
		modelAndView.addObject("countryList", code.getCountryList());
		
		modelAndView.addObject("formdemo", formdemo);
		modelAndView.addObject("message", "Here you can add a new Stock.");
				
		System.out.println(formdemo.toString());
		return modelAndView;
	}
}
