import java.io.File;
import java.io.IOException;

// Q4. Write a java program to find whether the file is Hidden file or not inside
// the directory.
// Hint : The IO package of java contains a special method named isHidden()
public class Assign10_Q4
{

	public static void main(String[] args) throws IOException 
	{
		String filepath = "demo.txt";
		File ob = new File(filepath);
		ob.createNewFile();
		System.out.println(ob);
		ob.isHidden();
		System.out.println(ob.isHidden());

	}

}
