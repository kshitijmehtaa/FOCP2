import java.util.*;
class IndNo
{
	public static void main(String args[] )
	{
	  int n,no,a=0,b,c;
	  Scanner s = new Scanner(System.in);
      for(int i=1;i>0;i++)
      {
         System.out.println("enter a five digit number");
         n=s.nextInt();
             if(n>9999 && n<100000)
               {
                  System.out.println(" ");
                   while(n>0)
                    {
                       a=a*10+n%10;
                       n=n/10;
                    }
                   do
                    {
          	           b=a%10;
          	           System.out.print("   ");
                       System.out.print(b);
                       a=a/10;
                    }while(a>0);
                  System.out.println("enter 1 to enter a new value \n enter 0 to exit");
                  c=s.nextInt();
                    if(c==0)
                      break;

          }
              else 
                 System.out.println("error:your number entered is not a five digit number");
         
      }
	}
}