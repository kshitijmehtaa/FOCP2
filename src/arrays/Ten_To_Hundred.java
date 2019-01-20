import java.util.*;
class Ten_To_Hundred
{
	public static void main(String args[])
	{
	    Scanner s = new Scanner(System.in);
	    int n,flag=0;
	    int A[] = new int[5];
	    System.out.print("enter a number between 10 and 100");
	    for(int i=0;i<5;i++)
	    {
	       System.out.println("enter");
	       n=s.nextInt();
	       if(n<10 || n>100)
	        {
	          for(int j=1;j>0;j++)
	            {
	             System.out.println("ERROR!... \n Enter again" );
	             n=s.nextInt();
	             if(n<=100 && n>=10)
	             break;
	            }
	        }
	       A[i]=n;
           for(int a=0;a<=i;a++)
            { 
              for(int b=0;b<=a;b++)
              {
                if(A[a]==A[b])
                {
                  flag=1;
                }
                if(flag==0)
                {
                 System.out.print(" ");
                 System.out.print(A[b]); //hiiiii
                }
               
              }  
            }

	    }
	}     	
}