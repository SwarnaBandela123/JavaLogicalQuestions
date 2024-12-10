package patternPrograms;

public class numIncreaseReversPyramid {
public static void main(String[] args)
{
	int n=7,i,j;
	for(i=n;i>=1;i--)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j + " ");
		}
		System.out.println();
	}
}
}

/*
 * int n=7,i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n-i;j++)
		{
			System.out.print(j + " ");
		}
		System.out.println();
	}
	*/
