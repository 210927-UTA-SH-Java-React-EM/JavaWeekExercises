package src.main.java.com.example.activity.nine;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Fillout the PostIO class to be able to read and write Post objects to a file called post.txt
//There may be Exceptions with the test, but as long as you are passing the tests, thats what matters
public class PostIO<Post> {
	
	protected String fileName;
	
	//Fillout the writeObjects method to take in an ArrayList of posts to write to the file
	public void writeObjects(ArrayList<Post> postList) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("post.txt"));){
			out.writeObject(postList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	//Fillout the readObjects method to get all the posts from the file
	public ArrayList<Post> readObjects() throws IOException, ClassNotFoundException{
		ArrayList<Post> list;
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("post.txt"));
		list = (ArrayList<Post>) in.readObject();
		return list;
	}
	
}
