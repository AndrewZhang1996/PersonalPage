package my_hobby;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reading extends Hobby {
	
	private String name = null;
	private String description = null;
	private ArrayList<Book> booklist = null;

	public Reading(){
		name = "Reading";
		description = "Books are the food for the hungry of great mind.";
		booklist = new ArrayList<Book>();
	}
	
	public String establish_booklist() throws IOException{
		String file = "my_hobby/reading/booklist.txt";
		BufferedReader in = new BufferedReader(new FileReader(file));
        String line = null;
        String str = "";
        while((line = in.readLine())!=null)
        {
         str+=line;
        }
        in.close();
        return str;
	}
	
	@Override
	public void set_hobby_name(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void set_hobby_description(String description) {
		// TODO Auto-generated method stub
		this.description = description;
	}

	@Override
	public String return_hobby_name() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String return_hobby_description() {
		// TODO Auto-generated method stub
		return description;
	}

}
