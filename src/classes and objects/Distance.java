import java.lang.*;
import java.util.*;
class Point
{
	private double x;
	private double y;
	Point()
	{
     this.x=0;
     this.y=0; 
	}
	Point(double x1)
	{
     this.x=x1;
	}
	Point(double x1,double y1)
	{
	  this.x=x1;
	  this.y=y1;
	}
	public void setvaluey(double y1)
	    {
	    this.y=y1;
	    }
    public double cal(Point a)
	{
      double dist= (double) Math.sqrt(Math.pow(this.x-a.x,2)+Math.pow(this.y-a.y,2)); 
      return dist;
	}
}   

 class Distance
 {
  public static void main(String args[])
  {
   double x1,y1,x2,y2;
   double dist;
   Scanner s= new Scanner(System.in);
   System.out.println("Enter the value of x1:");
   x1=s.nextDouble();
   System.out.println("Enter the values of y1:");
   y1=s.nextDouble();
   System.out.println("Enter the value of x2:");
   x2=s.nextDouble();
   System.out.println("Enter the values of y2:");
   y2=s.nextDouble();
   Point p1 = new Point(x1,y1);
   Point p2 = new Point(x2);
   p2.setvaluey(y2);
   System.out.print(dist= p1.cal(p2));
  }
 }