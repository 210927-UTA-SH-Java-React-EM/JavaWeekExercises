package com.example.activity.nine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Fillout the PostIO class to be able to read and write Post objects to a file called post.txt
//There may be Exceptions with the test, but as long as you are passing the tests, thats what matters
public class PostIO<Post> {
	
	private String fileName = "post.txt";
	
	//Fillout the writeObjects method to take in an ArrayList of posts to write to the file
	public void writeObjects(ArrayList<Post> postList) {
		try {
			ObjectOutputStream saver = new ObjectOutputStream(new FileOutputStream(fileName));
			saver.writeObject(postList);
			saver.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Excecution ended");
		}
		
	}
	
	//Fillout the readObjects method to get all the posts from the file
	public ArrayList<Post> readObjects() throws IOException{
		
		ObjectInputStream loader = new ObjectInputStream(new FileInputStream(fileName));
		
		ArrayList<Post> postList = new ArrayList<Post>();
		try {
			postList = (ArrayList<Post>) loader.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return postList;
	}
	
}
