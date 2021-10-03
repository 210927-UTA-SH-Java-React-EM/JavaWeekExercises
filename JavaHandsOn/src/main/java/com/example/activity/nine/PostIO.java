package com.example.activity.nine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Fillout the PostIO class to be able to read and write Post objects to a file called post.txt
//There may be Exceptions with the test, but as long as you are passing the tests, thats what matters
public class PostIO<Post> {
	
	//Fillout the writeObjects method to take in an ArrayList of posts to write to the file
	public void writeObjects(ArrayList<Post> postList, String filename) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));){
			out.writeObject(postList);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	//Fillout the readObjects method to get all the posts from the file
	public ArrayList<Post> readObjects(String filename) throws IOException, FileNotFoundException, ClassNotFoundException {
		ArrayList<Post> res;
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
		res = (ArrayList<Post>) in.readObject();
		return res;
	}
	
}
