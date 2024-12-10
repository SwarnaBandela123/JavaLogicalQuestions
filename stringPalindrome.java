package javaLogicalQuestions;

public class stringPalindrome {

	public static void main(String[] args) {
		String str="madam";
		String revers="";
		for(int i=str.length()-1; i>=0;i--)
		{
			revers+=str.charAt(i);
		}
		System.out.println("Original string: "+str);
		System.out.println("Reversed string: "+revers);
		
		//Check the string is palindrome or not
		if(str.equals(revers)) 
		{
			System.out.println("The given "+str+" string is palindrome");
		}else {
			System.out.println("The given "+str+" string is not palindrome");
		}
	}

}

/*
madam
racecar
level
civic
radar
noon
deified
minim
rotator
repaper
*/
