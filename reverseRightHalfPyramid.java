package patternPrograms;

import java.util.Scanner;

public class reverseRightHalfPyramid {

	public static void main(String[] args) {
	Scanner SC=new Scanner(System.in);
	System.out.println("Enter number");
	int n=SC.nextInt();
	
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
		System.out.print("*");
	}
		System.out.println(" ");

	}
	}
}
