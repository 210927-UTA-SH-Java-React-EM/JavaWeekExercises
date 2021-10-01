package com.example.activity.nine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Fillout the PostIO class to be able to read and write Post objects to a file called post.txt
//There may be Exceptions with the test, but as long as you are passing the tests, thats what matters
public class PostIO<T> {
	public final String filename = "post.txt";
	//Fillout the writeObjects method to take in an ArrayList of posts to write to the file
	public void writeObjects(ArrayList<T> postList) {

		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));){
			out.writeObject(postList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Fillout the readObjects method to get all the posts from the file
	public ArrayList<T> readObjects() throws IOException, ClassNotFoundException {
		ArrayList<T> ret;
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
		ret = (ArrayList<T>) in.readObject();
		return ret;
	}
	
}
