import java.io.File;
import java.io.IOException;

// Q1) Write a Java program to check if a file or directory specified 
// by pathname exists or no.
public class Assign10_Q1 
{

	public static void main(String[] args) throws IOException 
	{
		String pathname = "file.dat";
		File ob = new File(pathname);
		ob.createNewFile();
		System.out.println(ob);
		System.out.println(ob.isFile());
		System.out.println(ob.exists());
		

	}

}
