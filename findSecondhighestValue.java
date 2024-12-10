package javaLogicalQuestions;

public class findSecondhighestValue {

	public static void main(String[] args) {
		int[] array= {10,50,60,20,70,60};
		int highest=Integer.MIN_VALUE;
		int secondHighest=Integer.MIN_VALUE;
		for(int num:array) {
			if(num>highest) {
				secondHighest=highest;
				highest=num;
			}else if(num>secondHighest) {
				secondHighest=num;
			}
		}
		System.out.println("The sencond highest value in an array is:" +secondHighest);
	}

}
