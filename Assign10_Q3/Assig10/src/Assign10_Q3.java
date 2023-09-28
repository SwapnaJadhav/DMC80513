import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// Q3) Write a Java program to find the longest word in a text file.
public class Assign10_Q3 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		String filepath = "/home/sunbeam/Downloads/mock test";
		 FileReader ob = new FileReader(filepath);
	      Scanner input = new Scanner(ob);
	                 
	       String longestLenght = "";
	       String currentword;
	       
	       //Display the contents of the file
	       while(input.hasNext())
	       {    
	           String nextWord = input.next();
	           System.out.println(nextWord);
	           
	           
	           if (nextWord.length() > longestLenght.length())
	          {
	               longestLenght = nextWord;  // Remember this as the longest.         
	                
	          }
	  System.out.println("The lenght of the longest word found was:" +longestLenght);   
		

	       }//end of while

     }//end of main()
}//end of class
