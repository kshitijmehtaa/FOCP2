import java.util.*;
//class for main method
public class StudentDriver
{
	public static void main(String args[])
   {
        int n, i=0,pinCode,z,u,y;
        String firstName, lastName,eMail,contactNo,line1,line2, city, state,qualName , university , institute,name, role ; 
        String[] skills = new String[10];
        for(int sa=0;sa<10;sa++)
          skills[sa] = new String(); 
        String[] responsibilities = new String[10];
        for(int ra=0;ra<10;ra++)
            responsibilities[ra] = new String();
        float cgpa;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of students for entering the data" );
        n = input.nextInt();
        Address a;
        Qualification[] q = new Qualification[10];
        Project[] p = new Project[10];
        Student[] st = new Student[10];
        for(int v=0;v<n;v++)
             st[v] = new Student(); 
        while(i<=n)
            {
               System.out.println("\n first name :");
               firstName = input.next();
               System.out.println("\n last name is:");   
               lastName = input.next();
               System.out.println("\n email :");          
               eMail = input.next();
               System.out.println("\n contact no :");
               contactNo= input.next();
               System.out.println("Enter the date : ");
               System.out.println("enter day");
               z = input.nextInt();
               System.out.println("enter month");
               u = input.nextInt();
               System.out.println("enter year");
               y = input.nextInt();
               Date dateofBirth = new Date(z,u,y);
               System.out.println("How many skills you want to enter? ");
               int j=input.nextInt();
               for(int k=0;k<j;k++)
               {
                System.out.println(" \nThe skill of the student : ");
                skills[i]=input.next();
               }
               System.out.println("How many projects you want to enter?");
               int l=input.nextInt();
               for(int m=0;m<l;m++)
               {
                 System.out.println("\n The project details of the student ");
                 System.out.println("\n The name of the project :");
                 name = input.next();
                 System.out.println("\nThe role of the project  :");
                 role = input.next();
                 System.out.println("\nEnter the start date ");
                 System.out.println("Enter day : ");
                 int sd1 = input.nextInt();
                 System.out.println("Enter month : ");
                 int sd2 = input.nextInt();
                 System.out.println("Enter year : ");
                 int sd3 = input.nextInt();
                 Date sd = new Date(sd1,sd2,sd3);
                 System.out.println("\nEnter the end date ");
                 System.out.println("Enter day : ");
                 int ed1 = input.nextInt();
                 System.out.println("Enter month : ");
                 int ed2 = input.nextInt();
                 System.out.println("Enter year : ");
                 int ed3 = input.nextInt();
                 Date ed = new Date(ed1,ed2,ed3);
                 System.out.println("Enter the role of the project : ");
                 role = input.next();
                 System.out.println("How many responsibilities you want to enter? ");
                 int f=input.nextInt();
                 for(int o=0;o<f;o++)
                    {
                     System.out.println("Enter the responsibility");
                     responsibilities[o]=input.next();
                    }
                  p[m].Projectset(name,  sd, ed ,role,responsibilities);
                 for(int za=0;za<p.length;za++)
                     p[za] = new Project();
                }                          
        
               System.out.println("\n how many qualification details you want to enter?");
               int qn = input.nextInt();
               for(int w=0;w<qn;w++)
                 q[w] = new Qualification();
               for(int qi=0;qi<qn;qi++)
               {
                  System.out.println("\n The qualification name of the student  :");
                  qualName = input.next();
                  System.out.println("\nThe Institute of the student  :");
                  institute = input.next();
                  System.out.println("university : ");
                  university = input.next();
                  System.out.println("\n The cgpa of the student  :");
                  cgpa= input.nextFloat();
                  q[qn].Qualificationset( qualName,  university , institute, cgpa);
               } 
          
               System.out.println("\n The address of the student :  ");
               System.out.println("\n The line 1 of  address of the student : ");
               line1 = input.next();
               System.out.println("\n The line 2 of  address of the student :  ");
               line2 = input.next();
               System.out.println("\n  city :  ");
               city = input.next();
               System.out.println("\n The state : ");
               state = input.next();
               System.out.println("\n The pincode : ");
               pinCode = input.nextInt();
               a = new Address(line1, line2, city, state, pinCode);
               Student s = new Student(firstName,lastName, a,dateofBirth,skills,q,p,eMail,contactNo); 

            }
       
    }
}