// Q3. write a java program to count number of words in a String.
public class Assig5_Q3 {

	public static void main(String[] args) {
	String str = "Swapna Jadhav DMC Course in Sunbeam pune";
	System.out.println("Given string is : "+str);
	String arraystr[] = str.split("\s+");
	int countno = arraystr.length;
	System.out.println("Number of words:"+countno);
	}

}
