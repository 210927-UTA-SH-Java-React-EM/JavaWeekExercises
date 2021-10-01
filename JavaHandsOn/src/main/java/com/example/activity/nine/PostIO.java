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
	
	//Fillout the writeObjects method to take in an ArrayList of posts to write to the file
	public void writeObjects(ArrayList<Post> postList) {

		try (ObjectOutputStream printer = new ObjectOutputStream(new FileOutputStream("post.txt", false));)
		{
			printer.writeObject(postList);
			printer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//Fillout the readObjects method to get all the posts from the file
	public ArrayList<Post> readObjects() throws IOException{

		try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream("post.txt"));)
		{
			ArrayList<Post> postList = (ArrayList<Post>)reader.readObject();
			return postList;
		} catch (Exception e) {}
		return new ArrayList<Post>();
	}
	
}
