package Learning;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> AL= new ArrayList<>();
		ArrayList<Integer> ReAL= new ArrayList<>();

		Scanner SC=new Scanner(System.in);
		int ArrayListLength=SC.nextInt();
		SC.nextLine();
		for(int i=0;i<ArrayListLength;i++)
		{
			int input=SC.nextInt();
			AL.add(input);
		}
		System.out.println("Print AL values: "+AL);
		for(int num:AL)
		{
			if(!ReAL.contains(num))
			{
				ReAL.add(num);
			}
		}
		System.out.println("Print ReAL values without duplicates: "+ReAL);

	}

}
