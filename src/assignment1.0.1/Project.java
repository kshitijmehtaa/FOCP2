import java.util.*;
//class for project information
public class Project
{
  String name;
  Date startDate;
  Date endDate;
  String role;
  String[] responsibilities;

  public Project(Project a)
    {
        this.name = a.name;
        this.startDate = a.startDate;
        this.endDate = a.endDate;
        this.role = a.role;
        for(int i=0;i<responsibilities.length;i++)
          this.responsibilities[i] = a.responsibilities[i];
        
    }

  public void Projectset(String a, Date b, Date c ,String d, String[] e)
    {
        this.name = a;
        this.endDate = b;
        this.startDate = c;
        this.role = d;
        for(int i=0;i<responsibilities.length;i++)
          this.responsibilities[i] = e[i]; 
        
    }

    public Project()
    {
       System.out.println("p constructor called");
    }
   

   public void Display()
    {
    	System.out.print("\n Name : " + this.name);
      System.out.print("\n Start Date : " + this.startDate);
    	System.out.print("\n End Date : " + this.endDate);
    	System.out.print("\n Role of the Project : " + this.role);
    	System.out.print("\n Responsibilities of the Project are : ");
    	for(int i=0;i<responsibilities.length;i++)
        {
   	      System.out.print("\n\t\t" + this.responsibilities[i]);
        }

    }
}