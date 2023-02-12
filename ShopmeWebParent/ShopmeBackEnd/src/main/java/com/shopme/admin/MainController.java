package com.shopme.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

	// @GetMapping("/index")
	// public String viewIndexPage() {
	// 	return "index";
	// }

	@GetMapping("/pricing")
	public String viewPricingPage() {
		return "/pricing";
	}

	@GetMapping("/blocks")
	public String viewBlocksPage() {
		return "blocks";
	}
}
