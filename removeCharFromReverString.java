package javaLogicalQuestions;

public class removeCharFromReverString {

	  public static void main(String[] args) {
	        String str = "Swarnalatha";
	        String reversed = "";
	        String removeChar = "";
	        char character = 'a'; 

	        // Reverse the string
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }
	        
	        System.out.println("Original String: " + str);
	        System.out.println("Reversed String: " + reversed);

	        // Remove the specified character from the reversed string
	        for (int j = 0; j < reversed.length(); j++) {
	            if (reversed.charAt(j) != character) { 
	                removeChar += reversed.charAt(j);
	            }
	        }
	        
	        System.out.println("Removed char from String: " + removeChar);
	    }
	}
