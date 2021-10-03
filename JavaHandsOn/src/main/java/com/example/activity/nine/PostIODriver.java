package com.example.activity.nine;

import java.util.ArrayList;

public class PostIODriver {
	
	public static void main(String[] args) {
		
		PostIO<Post> io = new PostIO<Post>();		
		ArrayList<Post> postList = new ArrayList<Post>();
		String filename = "post.txt";
		
		postList.add(new Post("Johnnie", 0));
		postList.add(new Post("Kenzy", 0));
		postList.add(new Post("Lizzy", 0));		
		io.writeObjects(postList, filename);
		
		try {
			System.out.println(io.readObjects(filename));
		} catch (Exception e) {
			e.printStackTrace();
		}

		postList.add(new Post("Matzie", 0));		
		io.writeObjects(postList, filename);
		
		try {
			System.out.println(io.readObjects(filename));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<postList.size(); i++) {
			if(postList.get(i).getUsername().equals("Kenzy")) {
				postList.get(i).setLikeCount(30);
			}
			
			if(postList.get(i).getUsername().equals("Johnnie")) {
				postList.get(i).setLikeCount(65);
			}
			
			if(postList.get(i).getUsername().equals("Lizzy")) {
				postList.get(i).setLikeCount(85);
			}
		}
		
		postList.add(new Post("Trollou", 165));
		postList.add(new Post("Appropriate", 800));				
		io.writeObjects(postList, filename);
		
		try {
			System.out.println(io.readObjects(filename));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

}
