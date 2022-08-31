package com.example.helloworld.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody

public class LocationNameController {
	@RequestMapping("/lol")
	public String hello(@RequestParam(name = "location")String sijainti, @RequestParam(value ="name")String nimi) {
		return "Welcome to the "+sijainti+" "+nimi+"!";
			
		}
	
}
