package com.example.activity.nine;

import java.io.Serializable;

//Fill out the Post class to create it a Serializable Java Bean
//Post should include the properties of content, username, and likeCount
public class Post implements Serializable {
	private static final long serialVersionUID = -8717611228173001524L;
	
	private String content;
	private String username;
	private int likeCount;
	
	public Post(String content, String username, int likeCount) {
		this.content = content;
		this.username = username;
		this.likeCount = likeCount;
	}

}
