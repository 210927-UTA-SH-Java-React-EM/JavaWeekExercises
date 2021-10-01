package com.example.activity.nine;

import java.io.Serializable;

//Fill out the Post class to create it a Serializable Java Bean
//Post should include the properties of content, username, and likeCount
public class Post implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String content;
	private String username;
	private int count;
	
	
	
	public Post(String content, String username, int count) {
		this.content = content;
		this.username = username;
		this.count = count;
	}
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	

}
