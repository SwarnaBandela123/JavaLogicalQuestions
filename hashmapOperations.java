package Learning;

import java.util.HashMap;
import java.util.Scanner;

public class hashmapOperations {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int Q = scanner.nextInt();
	        scanner.nextLine(); // consume newline character
	        HashMap<String, Integer> map = new HashMap<String, Integer>();

	        for (int i = 0; i < Q; i++) {
	            String[] query = scanner.nextLine().split(" ");
	            char operation = query[0].charAt(0);
	            String key = query[1];

	            switch (operation) {
	                case 'a':
	                    int value = Integer.parseInt(query[2]);
	                    add_Value(map, key, value);
	                    break;
	                case 'b':
	                    System.out.println(find_value(map, key));
	                    break;
	                case 'c':
	                    System.out.println(getSize(map));
	                    break;
	                case 'd':
	                    removeKey(map, key);
	                    break;
	            }
	        }

	        scanner.close();
	    }

	    public static void add_Value(HashMap<String, Integer> map, String key, int value) {
	        map.put(key, value);
	    }

	    public static int find_value(HashMap<String, Integer> map, String key) {
	        if (map.containsKey(key)) {
	            return map.get(key);
	        } else {
	            return -1;
	        }
	    }

	    public static int getSize(HashMap<String, Integer> map) {
	        return map.size();
	    }

	    public static void removeKey(HashMap<String, Integer> map, String key) {
	        if (map.containsKey(key)) {
	            map.remove(key);
	        }
	    }
	}