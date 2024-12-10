package Learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findingValueDynamicallyInList {
	 public static void main(String[] args) {
		   
		        Scanner scanner = new Scanner(System.in);
		        List<String> stringList = new ArrayList<String>();
		        System.out.print("How many strings do you want to add? ");
		        int numStrings = scanner.nextInt();
		        scanner.nextLine(); // Consume the newline character

		        // Add the strings to the list
		        System.out.println("Enter the strings:");
		        for (int i = 0; i < numStrings; i++) {
		            String input = scanner.nextLine();
		            stringList.add(input);
		        }

		        // Print the contents of the list
		        System.out.println("List contents:");
		        for (String item : stringList) {
		            System.out.println(item);
		        }


	        // Search for an element
	        System.out.print("Enter the name to search for: ");
	        String searchName = scanner.nextLine();
	        int index = stringList.indexOf(searchName);
	        if (index != -1) {
	            System.out.println("Found " + searchName + " at index " + index);
	        } else {
	            System.out.println("Element not found");
	        }
	        
	     // Search for an index
	        System.out.print("Enter the name to search for: ");
	        int searchindex = scanner.nextInt();
	        String Name = stringList.get(searchindex);
	        if (Name != searchName) {
	            System.out.println("Found " + searchindex + " at index " + Name);
	        } else {
	            System.out.println("Element not found");
	        }

	        // Close the Scanner
	        scanner.close();
	    }
	}