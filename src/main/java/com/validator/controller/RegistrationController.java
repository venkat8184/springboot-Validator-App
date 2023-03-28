package com.validator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {
     @RequestMapping("/viewReg")
	public String viewRegistration() {
		return "registration";
		
	}
}
