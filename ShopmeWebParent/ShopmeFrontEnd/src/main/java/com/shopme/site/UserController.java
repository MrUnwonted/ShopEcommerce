package com.shopme.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/shop")
	public String viewHomePage() {
		return "shop";
	}
	
	@GetMapping("/cart")
	public String viewCartPage() {
		return "cart";
	}
	
	@GetMapping("/about")
	public String viewAboutPage() {
		return "about";
	}
	
	@GetMapping("/contact")
	public String viewContactPage() {
		return "contact";
	}
	
	
	
	
	
	
}
