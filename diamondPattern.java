package patternPrograms;

public class diamondPattern {

	public static void main(String[] args) {
		int n=4,i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}				
		    System.out.println(" ");
		}	
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
			System.out.print(" ");
			}
			for(j=1;j<=n-i;j++)
			{
			System.out.print("*"+" ");
			}
		    System.out.println(" ");
		}
	}
}