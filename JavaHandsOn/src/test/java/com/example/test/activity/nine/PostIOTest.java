package com.example.test.activity.nine;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.example.activity.nine.Post;
import com.example.activity.nine.PostIO;

public class PostIOTest {
	
	private PostIO<Post> io = new PostIO<Post>();
	
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
	public void testEmptyUserList() {
		List<Post> userList;
		try {
			userList = io.readObjects();
			assertEquals("The list should have no posts", 0, userList.size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@Test
//	public void testCreatNewPost() {
//		Post p1 = new Post("Test Content", "Test Username", 0);
//		ArrayList<Post> pList;
//		try {
//			pList = io.readObjects();
//			pList.add(p1);
//			io.writeObjects(pList);
//
//			assertEquals(1, pList.size());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void testCreateMultipleUsers() {
//		Post p1 = new Post("Test Content", "Test Username", 0);
//		Post p2 = new Post("Test Content 2", "Test Username", 0);
//		ArrayList<Post> pList;
//		try {
//			pList = io.readObjects();
//			pList.add(p1);
//			pList.add(p2);
//			io.writeObjects(pList);
//
//			assertEquals(2, pList.size());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
