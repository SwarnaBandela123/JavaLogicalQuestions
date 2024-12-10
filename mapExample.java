package Learning;
import java.util.*;

import java.io.*;

public class mapExample {

		public static void main(String[] args){

	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter the length of the map");
	      int n=in.nextInt();

	      in.nextLine();

	       Map<String,Integer> map=new HashMap<String, Integer>();

	      for(int i=0;i<n;i++)

	      {
	    	  System.out.println("Enter the Name");
	         String name=in.nextLine();
	    	  System.out.println("Enter the Phone number");
	         int phone=in.nextInt();

	         in.nextLine();

	          map.put(name,phone);

	      }
	    	 System.out.println("Enter the name to check whether the contact number is available or not");

	      while(in.hasNext())

	      {
	         String s=in.nextLine();

	          if(map.containsKey(s)){

	              System.out.println(s+"="+map.get(s));

	          }else{

	              System.out.println("Not found");

	          }

	      }
	 
	   }
	}



	 