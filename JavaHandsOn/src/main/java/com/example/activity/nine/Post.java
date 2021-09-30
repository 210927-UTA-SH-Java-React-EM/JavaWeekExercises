package com.example.activity.nine;

import java.io.Serializable;

//Fill out the Post class to create it a Serializable Java Bean
//Post should include the properties of content, username, and likeCount
public class Post implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String content;
	private String username;
	private int likecount;
	
	public Post(String content,String username, int likecount)
	{
	this.content = content;
	this.username = username;
	this.likecount = likecount;
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
	public int getLikecount() {
		return likecount;
	}
	public void setLikecount(int likecount) {
		this.likecount = likecount;
	}
}
