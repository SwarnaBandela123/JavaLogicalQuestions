package javaLogicalQuestions;

public class findHighestValue {

	public static void main(String[] args) {
		int[] array= {10,50,60,20,70};
		int highest=Integer.MIN_VALUE;
		for(int num:array) {
			if(num>highest) {
				highest=num;
			}
		}
		System.out.println("The first highest value in an array is:" +highest);
	}

}


