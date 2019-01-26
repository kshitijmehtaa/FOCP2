import java.util.*;
import assignment.*;
//class for a student's information
public class Student
{
  String firstName;
  String lastName;
  Address addr;   
  Date dob;      //Date of Birth
  String  skills;
  Qualification qual; 
  Project projects;
  String eMail;
  String contactNo;

  public Student(String a, String b, Address c, Date d, String e, Qualification f, Project g, String h, String i) //constructor with Project
    {
        this.firstName = new String(a);
        this.lastName = new String(b);
        this.addr = new Address(c);
        this.dob = new Date(d.getTime());
        this.skills[j] = new String(e);
        this.qual[k] = new Qualification(f);
        this.projects[l] = new Project(g);
        this.eMail = new String(h); 
        this.contactNo = new String(i);
    }
   public Student(String a, String b, Address c, Date d, String e, Qualification f, String h, String i) //constructor without Project
    {
        this.firstName = new String(a);
        this.lastName = new String(b);
        this.addr = new Address(c);
        this.dob = new Date(d.getTime());
        this.skills = new String(e);
        this.qual = new Qualification(f);
        this.eMail = new String(h); 
        this.contactNo = new String(i);
    }
   public void Display() //Displaying all the details of student
   {
	    System.out.print("\n First Name : " + this.firstName);
        System.out.print("\n Last Name : " + this.lastName);
        this.addr.Display();
        System.out.print("\n Date : " + this.dob);
   	    System.out.print("\n Skills are : ");
        System.out.print("\n\t\t" + skills);
        qual.Display();
        projects.Display();
        System.out.print("\n Email : " + this.eMail);
        System.out.print("\n Contact No. : " + this.contactNo);
   }
}



