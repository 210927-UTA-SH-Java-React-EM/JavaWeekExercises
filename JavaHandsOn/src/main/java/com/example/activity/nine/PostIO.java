package com.example.activity.nine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// Fill out the PostIO class to be able to read and write Post objects to a file called post.txt
// There may be Exceptions with the test, but as long as you are passing the tests, thats what matters
public class PostIO<T> {
	
	private final static String fileName = "post.txt";
	
	public PostIO()
	{
		
	}
	
	// Fill out the writeObjects method to take in an ArrayList of posts to write to the file.
	public void writeObjects(ArrayList<T> objList) {
		//try with resources
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));){
			out.writeObject(objList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Fill out the readObjects method to get all the posts from the file
	@SuppressWarnings("unchecked")
	public ArrayList<T> readObjects() {

		ArrayList<T> result = null;
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));){
			result = (ArrayList<T>) in.readObject();
		}
		catch(Exception ex)
		{
			System.out.println("Exception Thrown: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		return result;
	}
	
}
