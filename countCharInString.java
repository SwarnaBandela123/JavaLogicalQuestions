package javaLogicalQuestions;

import java.util.Scanner;

public class countCharInString {

	public static void main(String[] args) {
		String str="Swarnalatha";
	Scanner scanner=new Scanner(System.in);
	  System.out.print("Enter a character: ");
      char character = scanner.nextLine().charAt(0);
		int count=0;
		for(int i=0; i<str.length();i++)
		{
		if(str.charAt(i)==character)
		{
			count++;
		}
	}
		System.out.println("The count of the character  " + character+ "  occurance in a string: " +count);

}
}