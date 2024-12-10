package javaLogicalQuestions;

public class removeWord {

	public static void main(String[] args) {
		String str="Swarnalatha is a very very good girl";
		String RemoveWord="very";
		String TempWord=RemoveWord+" ";
		if(str.contains(TempWord)) 
		{
		String Stringafterremovedword=str.replace(TempWord, "");		
		System.out.println("String after removing a specific word from original string: " +Stringafterremovedword);
		}
	}

}
