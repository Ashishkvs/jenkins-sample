package com.imagegrafia.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
//@RequestMapping(value = "/")
public class HomeController {

	@GetMapping("/")
	public String getHome(Model model) {
		log.info("calling home ::::::::");
		return "index";
	}
}
