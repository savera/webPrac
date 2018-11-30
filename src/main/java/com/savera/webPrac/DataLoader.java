package com.savera.webPrac;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataLoader {

	private PostRepository postRepo;

	@Autowired
	public DataLoader(PostRepository postRepo) {
		this.postRepo = postRepo;
	}

	@PostConstruct
	private void loadData() {

		postRepo.save(new Post("title 1", "hello", new Date())); 
		postRepo.save(new Post("title 2", "hello world", new Date())); 
		postRepo.save(new Post("title 3", "hello universe", new Date())); 
		
	}
}
