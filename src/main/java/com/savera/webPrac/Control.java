package com.savera.webPrac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class Control {

	@Autowired
	DataLoader loadData; 
	
	String method(Model model) {
	
		model.addAttribute(loadData.getAllPosts());
		
		return null;
	}
	
}
