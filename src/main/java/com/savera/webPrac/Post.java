package com.savera.webPrac;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity 
public class Post {
	@Id
	@GeneratedValue
	private	long id; 
	private String title; 
	private String body; 
	private Date postedOn; 
	
	Post(){
		
	}
	
	public Post( String title, String body, Date posted) {

		this.title = title; 
		this.body = body; 
		this.postedOn = posted; 
		
	}
	
	public long getId() {
		return id;
	}
	
	@Id
	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}
}
