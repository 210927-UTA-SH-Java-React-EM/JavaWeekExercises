package com.example.activity.nine;

import java.io.Serializable;

//Fill out the Post class to create it a Serializable Java Bean
//Post should include the properties of content, username, and likeCount
public class Post implements Serializable{
	
	private String content;
	private String username;
	private int likeCount;
	
	public Post()
	{
		this.content = "Test content";
		this.username = "Test User";
		this.likeCount = 0;
	}

	public Post(String con, String user, int like)
	{
		this.content = con;
		this.username = user;
		this.likeCount = like;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	
	
	@Override
	public String toString() {
		return "[Content=" + content + ", userName=" + username + ", likeCount="
				+ likeCount+ "]";
	}

	
	
}
