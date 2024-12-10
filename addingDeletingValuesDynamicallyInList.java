package Learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class addingDeletingValuesDynamicallyInList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the List length");
		int N = scan.nextInt();

		List<Integer> list1 = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			int value = scan.nextInt();
			list1.add(value);
		}

		// Process queries
		System.out.println("Number of queries need to perform on List");
		int Q = scan.nextInt();
		for (int i = 0; i < Q; i++) {
			System.out.println("Enter Insert to add one value");
			String action1 = scan.next();
			if (action1.equals("Insert")) {
				System.out.println("Add the value at specific index");
				int index = scan.nextInt();
				int value = scan.nextInt();
				list1.add(index, value);
			} else {
				// "Delete"
				System.out.println("Enter Delete to delete one value from List");
				String action2 = scan.next();
				System.out.println("Enter the index to delete the value");
				int index = scan.nextInt();
				list1.remove(index);
			}
		}

		scan.close();

		// Print the updated list
		for (Integer num : list1) {
			System.out.print(num + " ");
		}
	}
}
