import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Q2) Write a Java program to store text file content line by line into an array
public class Assg10_Q2 
{
	public static void main(String[] args) throws IOException 
	{
		List<String> ls = new ArrayList<String>();
		
		//take data from txt file
		BufferedReader bf = new BufferedReader(new FileReader("/home/sunbeam/Downloads/mock test"));
		//read a line 
		String line = bf.readLine();
		//check data into the file upto end
		while(line != null)
		{
			ls.add(line);
			line = bf.readLine();
		}
		bf.close(); // close object bf
		//store line by line into the array
		String[] arr = ls.toArray(new String[0]);
		for(String str : ls) {
			System.out.println(str);
	}// end of main()

}//end of class
}