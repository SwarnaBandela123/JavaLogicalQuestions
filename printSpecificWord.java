package javaLogicalQuestions;

public class printSpecificWord {

	public static void main(String[] args) {
		String sentence="Swarnalatha is a very good girl";
		String PrintWord="is";
		String[] words=sentence.split(" ");
		for(String SpecificWord:words) 
		{
		if(SpecificWord.equals(PrintWord)) 
		{		
		System.out.println("String after removing a specific word from original string: " +SpecificWord);
		}
	}
	}
}
