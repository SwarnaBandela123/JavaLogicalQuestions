package patternPrograms;

public class square {

	public static void main(String[] args) {
		int n=4,i,j;
		for(i=0;i<n;i++)//Consider it as a rows
		{
			for(j=0;j<n;j++)//Consider it as a rows
			{
				if(i==0 || j==0 || i==n-1 || j==n-1)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
	}
		
}
}