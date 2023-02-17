package com.shopme.admin;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.Authentication;

@Controller
public class MainController {

	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

	@GetMapping("/login")
	public String viewPricingPage() {	

	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

	if (authentication == null || authentication instanceof AnonymousAuthenticationToken){
		return "login";
		}
		else {
			return "redirect:/";
		}
	}
}
