package com.savera.webPrac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class Control {

	@Autowired
	DataLoader loadData; 
	
	
	@RequestMapping("/blog") //returns -> text 
	String method(Model model) {
	
		model.addAttribute("prods",loadData.getAllPosts());
		
		return "index";
	}
//	@RequestMapping("/blog")  //-> returns jason data
//	Iterable<Post> method(Model model) {
//		
//		return loadData.getAllPosts();
//	}
}
