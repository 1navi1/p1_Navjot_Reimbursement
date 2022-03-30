package com.revature.p1backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.revature.p1backend.model.Login;
import com.revature.p1backend.model.Users;
import com.revature.p1backend.service.UsersService;

@Controller
public class LoginController {

	@Autowired
	UsersService userService;
//
//	@PostMapping("/users/login")
//	public Users checkLogin(@RequestBody Login login) {
//		return userService.userLogin(login.getUsername(), login.getPassword());
//	}
	@RequestMapping("/")
    public String root() {
        return "index";   
        }
	@GetMapping("/register")
	public String viewHomepage(Model model) {
		model.addAttribute("user", new Users());
		return"signup_form";
	}
	
//	@RequestMapping(value="/save", method=RequestMethod.POST)    
//	public ModelAndView save(@ModelAttribute Users user)  
//	{    
//	ModelAndView modelAndView = new ModelAndView();    
//	modelAndView.setViewName("user-data");        
//	modelAndView.addObject("user", user);      
//	return modelAndView;    
//	} 
	@PostMapping("/users/login")
	public Users checkLogin(@RequestBody Login login) {
		return userService.userLogin(login.getUsername(), login.getPassword());
	}
	
}

