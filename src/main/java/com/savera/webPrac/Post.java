package com.savera.webPrac;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity 
public class Post {
	@Id
	@GeneratedValue
	private	Long id; 
	private String title; 
	private String body; 
	private Date postedOn; 
	
	private Post(){
		
	}
	
	public Post(String title, String body, Date posted) {

	
		this.title = title; 
		this.body = body; 
		this.postedOn = posted; 
		
	}
	
	public Long getId() {
		return id;
	}
	
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
