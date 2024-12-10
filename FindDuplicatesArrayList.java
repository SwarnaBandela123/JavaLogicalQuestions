package Learning;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDuplicatesArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> AL= new ArrayList<>();
		ArrayList<Integer> FindDuplicates= new ArrayList<>();

		Scanner SC=new Scanner(System.in);
		System.out.println("Enter ArrayList length");
		int ArrayListLength=SC.nextInt();
		SC.nextLine();
		System.out.println("Enter ArrayList values");
		for(int i=0;i<ArrayListLength;i++)
		{
			int input=SC.nextInt();
			AL.add(input);
		}
		System.out.println("Print AL values: "+AL);
		for(int i=0;i<AL.size();i++)
		{
			for(int j=i+1;j<AL.size();j++)
			{
				if(AL.get(i).equals(AL.get(j))&&!FindDuplicates.contains(AL.get(i)))
				{
					FindDuplicates.add(AL.get(i));
				}
			}
	}
		System.out.println("Print FindDuplicates values: "+FindDuplicates);

}
}