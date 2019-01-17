import java.util.*;

class SecondQues
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int i,j,k=0;
		int A[]= new int[5];
		System.out.println("Enter 5 integer nos.");
		for(i=0;i<5;i++)
		{
			A[i]= scan.nextInt();
		}
		System.out.println("Enter the no. to be searched");
		j=scan.nextInt();
		System.out.println("Elements are");
		for(i=0;i<5;i++)
		{
			System.out.println(A[i]);
		}
		System.out.println("Index :");
		for(i=0;i<5;i++)
		{
			if(A[i]==j)
			{
				System.out.println(i);
				k++;
			}
		}
		if(k==0)
			System.out.println("-1");
	}
} 