//class for qualification information
public class Qualification
{
  String qualName;
  String university;
  String institute;
  float cgpa;

  public Qualification(Qualification a)
    {
     this.qualName = a.qualName;
     this.university = a.university;
     this.institute = a.institute;
     this.cgpa = a.cgpa;
    }

  public Qualification(String a, String b, String c, float d )
    {
     this.qualName = a;
     this.university = b;
     this.institute = c;
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