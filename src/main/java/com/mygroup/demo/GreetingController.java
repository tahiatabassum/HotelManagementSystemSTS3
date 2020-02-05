package com.mygroup.demo;

//http://localhost:8080/greeting

//http://localhost:8080/greeting?name=User

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	 @GetMapping("/greeting")
	    public String greeting(@RequestParam(name="name", required=false, defaultValue="Everyone") String name, Model model) {
	        model.addAttribute("name", name);
	        return "greeting";
	    }
}
