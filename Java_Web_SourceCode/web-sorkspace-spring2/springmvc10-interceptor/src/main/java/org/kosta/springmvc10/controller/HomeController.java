package org.kosta.springmvc10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@PostMapping
	@RequestMapping("home.do")
	public String home() {
		return "home";
	}
}
