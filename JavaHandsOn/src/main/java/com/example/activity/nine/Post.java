package com.example.activity.nine;

import java.io.Serializable;

//Fill out the Post class to create it a Serializable Java Bean
//Post should include the properties of content, username, and likeCount
public class Post implements Serializable{

	private static final long serialVersionUID = 3731763261L;
	
	private String content;
	private String username;
	private int likeCount;
	
	public Post() {
		this.setContent("");
		this.setUsername("");
		this.setLikeCount(0);
	}
	
	public Post(String content, String user, int likes) {
		this();
		this.setContent(content);
		this.setUsername(user);
		this.setLikeCount(likes);
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setUsername(String user) {
		this.username = user;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setLikeCount(int likes) {
		this.likeCount = likes;
	}
	
	public int getLikeCount() {
		return this.likeCount;
	}
	
}
