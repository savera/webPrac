package com.savera.webPrac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TO DO: check end of part 2 for data; ended @2nd step of part 3

@SpringBootApplication
public class WebPracApplication {

	PostRepository postRepo; 
	
	@Autowired 
	DataLoader dataLoader = new DataLoader(postRepo); 
	
	public static void main(String[] args) {
		SpringApplication.run(WebPracApplication.class, args);
	}
	
	Post returnAllPosts() {
		
		for(Post p : postRepo.findAll()) {
			return p;
		}
		return null;
	}
}
