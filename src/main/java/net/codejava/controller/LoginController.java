package net.codejava.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {


	@GetMapping("/403")
	public String handle403() {
		return "403";
	}

	@GetMapping("/login")
	public String handleLogin() {
		return "login";
	}
	@RequestMapping("/list")
	public String viewHomePage(Model model) {
		List<String> listProducts = new ArrayList<String>();
		model.addAttribute("listProducts", listProducts);
		
		return "products";
	}
	


}
