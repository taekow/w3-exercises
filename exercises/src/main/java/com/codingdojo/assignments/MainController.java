package com.codingdojo.assignments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/cssfile")
	public String index() {
	    return "index.jsp";
	}
}
