package com.prashanthIt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WelcomeController {

	@GetMapping(value = "/price/{book}/{author}")
	public String displayMessage(@PathVariable("book") String bookName, @PathVariable("author") String authorName,
			Model model) {
		String msgTxt = "Price of " + bookName + "  written by " + authorName + " is 300$";
		model.addAttribute("msg", msgTxt);
		return "index";
	}
}
