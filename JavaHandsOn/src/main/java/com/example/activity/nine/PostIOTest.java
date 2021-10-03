package com.example.activity.nine;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class PostIOTest {

	@Before
	public void clearTestFile() {
		if(Files.exists(Paths.get("post.txt"))) {
			System.out.println("Clearing the test file");
			try {
				Files.delete(Paths.get("test.txt"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
	
	@Test
	public void testEmptyPostList() throws IOException {
		ArrayList<Post> postList = new ArrayList<Post>();	
		assertEquals("The list should have no posts", 0, postList.size());
	}
	
	@Test
	public void testCreatNewPost() throws IOException {
		Post p1 = new Post("abcd", 0);
		ArrayList<Post> pList = new ArrayList<Post>();
		PostIO<Post> io = new PostIO<Post>();	
		String filename = "post.txt";
		pList.add(p1);
		io.writeObjects(pList, filename);
		
		assertEquals(1, pList.size());
	}
	
	@Test
	public void testCreateMultipleUsers() throws IOException {
		Post p1 = new Post("Kingsize",  0);
		Post p2 = new Post("Queensize", 0);
		ArrayList<Post> pList = new ArrayList<Post>();
		String filename = "post.txt";
		PostIO<Post> io = new PostIO<Post>();
		
		pList.add(p1);
		pList.add(p2);
		io.writeObjects(pList, filename);
		
		assertEquals(2, pList.size());
	}	

}
