//class for a student's information
public class Student
{
  String firstName;
  String lastName;
  Address addr;   
  Date dob;      //Date of Birth
  String[]  skills;
  Qualification[] qual; 
  Project[] projects;
  String eMail;
  String contactNo;

  public Student(String a, String b, Address c, Date d, String[] e, Qualification[] f, Project[] g, String h, String i) //constructor with Project
    {
        this.firstName = a;
        this.lastName = b;
        this.addr = c;
        this.dob = d;
        for(int j=0;j<e.length;j++)
          this.skills[j] = e[j];
        for(int k=0;k<f.length;k++)
          this.qual[k] = f[k];
        for(int l=0;l<g.length;l++)
          this.projects[l] = g[l];
        this.eMail = new String(h); 
        this.contactNo = new String(i);
    }
   public Student(String a, String b, Address c, Date d, String[] e, Qualification[] f, String h, String i) //constructor without Project
    {
        this.firstName = a;
        this.lastName = b;
        this.addr = c;
        this.dob = d;
        for(int m=0;m<e.length;m++)
          this.skills[m] = e[m];
        for(int j=0;j<f.length;j++)
          this.qual[j] = f[j];
        this.eMail = new String(h); 
        this.contactNo = new String(i);
    }
   public void Display() //Displaying all the details of student
   {    
	      System.out.print("\n First Name : " + this.firstName);
        System.out.print("\n Last Name : " + this.lastName);
        
        addr.Display();

        dob.Display();
   	    System.out.print("\n Skills are : ");
        for(int i=0;i<skills.length;i++)
          System.out.print("\n\t\t" + skills[i]);
        for(int o=0;o<qual.length;o++)
        qual.Display1();
        for(int h=0;h<projects.length;h++)
        projects.Display2();
        System.out.print("\n Email : " + this.eMail);
        System.out.print("\n Contact No. : " + this.contactNo);
   }
}



