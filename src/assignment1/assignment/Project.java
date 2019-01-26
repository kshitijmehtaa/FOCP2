package assignment;
import assignment.*;
import java.util.*;
//class for project information
public class Project
{
  String name;
  Date endDate;
  String role;
  String responsibilities;

  public Project(Project a)
    {
        this.name = new String(a.name);
        this.endDate = new Date(a.endDate.getTime());
        this.role = new String(a.role);
        this.responsibilities = new String(a.responsibilities);
        
    }

  public Project(String a, Date b, String c, String[] d)
    {
        this.name = new String(a);
        this.endDate = new Date(b.getTime());
        this.role = new String(c);
        this.responsibilities[i] = new String(d[i]);
        
    }
     public void setName(String name) 
   {   
      this.name=name;
   }
   public String getName()
   {
   	return name;
   }
    public void setRole(String role) 
   {   
      this.role=role;
   }
   public String getRole()
   {
   	return role;
   }
     public void setResp(String responsibilities) 
   {   
      this.responsibilities=responsibilities;
   }
   public String get()
   {
   	return responsibilities;
   }
    public void displayProject()
     {
        System.out.println("The project Name of the student is\n"+ "name =" + name +"Role =" + role );
    }

   public void Display()
    {
    	System.out.print("\n Name : " + this.name);
    	System.out.print("\n Date : " + this.endDate);
    	System.out.print("\n Role of the Project : " + this.role);
    	System.out.print("\n Responsibilities of the Project are ");
    	for(int i=0;i<responsibilities.length;i++)
        {
   	      System.out.print("\n\t\t" + responsibilities[i]);
        }

    }
}