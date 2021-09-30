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
	public void writeObjects(ArrayList<Post> postList) {
		try(ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("post.txt",true));)
		{
			for(Post p: postList)
			{
				objectOutput.writeObject(p);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Fillout the readObjects method to get all the posts from the file
	public ArrayList<Post> readObjects() throws IOException{

		
		ArrayList<Post> arrlist = new ArrayList<Post>();
		try(ObjectInputStream objectinput = new ObjectInputStream(new FileInputStream("post.txt"));)
		{
			Post p;
			while((boolean) (p=(Post) objectinput.readObject()))
			{
				arrlist.add(p);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		return arrlist;
	}	
}
