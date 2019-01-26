package assignment;
import assignment.*;
//class for qualification information
public class Qualification
{
  String qualName;
  String university;
  String institute;
  float cgpa;

  public Qualification(Qualification a)
    {
     this.qualName = new String(a.qualName);
     this.university = new String(a.university);
     this.institute = new String(a.institute);
     this.cgpa = a.cgpa;
    }

  public Qualification(String a, String b, String c, float d )
    {
     this.qualName = new String(a);
     this.university = new String(b);
     this.institute = new String(c);
     this.cgpa = d;
    }

   public void Display()
    {
    	System.out.print("\n Name of the Degree : " + this.qualName);
    	System.out.print("\n Name of the University : " + this.university);
    	System.out.print("\n Name of the Institute : " + this.institute);
    	System.out.print("\n CGPA Score : " + this.cgpa);
    }
}