package Learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class updateList {
	 public static void update(List<Integer> list, int index, int newValue) {
	        if (index >= 0 && index < list.size()) {
	            list.set(index, newValue);
	        }
	    }

	    public static void print(List<Integer> list) {
	        for (int num:list) {
	        	System.out.println(num);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read initial number of elements
	        int n = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        List<Integer> list = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            list.add(scanner.nextInt());
	        }
	        scanner.nextLine(); // Consume newline

	        // Read number of queries
	        int q = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        // Process each query
	        for (int i = 0; i < q; i++) {
	            String queryType = scanner.nextLine();
	            switch (queryType) {
	                case "Update":
	                    int index = scanner.nextInt();
	                    int newValue = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    update(list, index, newValue);
	                    break;
	                case "Print":
	                    print(list);
	                    break;
	                default:
	                    System.out.println("Invalid query type");
	                    break;
	            }
	        }

	        scanner.close();
	    }
	}