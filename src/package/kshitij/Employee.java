package kshitij;
import java.util.*;
public class Employee 
{
  public String fname;
  public String lname;
  public double sal;
  public void Eget()
    {
     double a =-1;
     Scanner s = new Scanner(System.in);
     System.out.print("\nFirst name : ");
     this.fname= s.nextLine();
     System.out.print("\nLast name : ");
     this.lname= s.nextLine();
     while(a<0)
        {
         System.out.print("\nmonthly Salary (enter a positive value) : ");
         a=s.nextDouble();
         this.sal= a;
        }
      
    }
  public double getsal()
  {
    return this.sal;
  }

}


   
 