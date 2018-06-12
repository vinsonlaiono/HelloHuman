package com.vinsonaiono.HelloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class HelloHumanController {
	
	@RequestMapping("")
	public String index(@RequestParam(value="f", required=false) String name, @RequestParam(value="l", required=false) String last) {
		
		String results = "";
			
		if (name == null && last == null) {
			results = "<h1>Hello Human</h1><br><br><h4>Spring Boot is Awesome</h4>";
			return results;
		} else {
			results = "<h1>Hello " + name + " " + last + "</h1><br><br><h4>Welcome to Spring Boot</h4>";
			return results;
		}
	}

}
