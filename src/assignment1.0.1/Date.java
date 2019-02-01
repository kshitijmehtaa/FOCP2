public class Date
{
	int day;
	int month;
	int year;

	public Date(int a,int b, int c)
	{
	  this.day=a;
	  this.month=b;
	  this.year=c;
	}

	public Date(Date a)
	{
	  this.day=a.day;
	  this.month=a.month;
	  this.year=a.year;
	}

	public void Display()
	{
	  System.out.print("\n");
	  System.out.print(this.day + "/" + this.month + "/" + this.year);
	}
}