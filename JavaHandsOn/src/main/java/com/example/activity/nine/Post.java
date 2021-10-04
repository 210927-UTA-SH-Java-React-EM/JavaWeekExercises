package com.example.activity.nine;

import java.io.Serializable;

//Fill out the Post class to create it a Serializable Java Bean
//Post should include the properties of content, username, and likeCount
public class Post implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String content;
	private String userName;
	private int likeCount;
	
	public Post(String content, String userName, int likeCount)
	{
		this.content = content;
		this.userName = userName;
		this.likeCount = likeCount;
	}
	
	
	
	/**********************************
	 * get it or set it, then forget it
	 **********************************/
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	

}
