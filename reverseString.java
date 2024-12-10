package javaLogicalQuestions;

public class reverseString {
	public static void main(String[] args) {
		String str="Swarnalatha";
		String revers="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revers+=str.charAt(i);
		}
	System.out.println("Original String: " +str);
	System.out.println("Reversed String: " +revers);
	}
}
