package Learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) {
		List<String> arr=new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);		
		System.out.println("List length");
		
		int num=scanner.nextInt();
		
		System.out.println("Enter the String values");

		for(int i=1;i<=num;i++) {
			String addValue=scanner.nextLine();
			arr.add(addValue);
			
		}
		
		 // Search for an element
        System.out.print("Enter the name to search for: index ");
        String searchName = scanner.nextLine();
        int index = arr.indexOf(searchName);
        if (index != -1) {
            System.out.println("Found " + searchName + " at index " + index);
        } else {
            System.out.println("Element not found");
        }
        
        // Search for an element
        System.out.print("Enter the index to search for: Name ");
        int index1 = scanner.nextInt();
        String Value = arr.get(index1);
        if (index != -1) {
            System.out.println("Found " + index1 + " at index " + Value);
        } else {
            System.out.println("Element not found");
        }
	}
}
