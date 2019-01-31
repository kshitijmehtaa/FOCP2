//class for main method
public class StudentDriver
{
	public static void main(String args[])
   {
        int n, i=0,pinCode, startDate, endDate , dateofBirth ;
        String firstName, lastName,eMail,contactNo,line1,line2, city, state,qualName , university , institute,name, role,skills[] ,responsibilities[] ;  
        float cgpa;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of students for entering the data" );
        n = input.nextInt();
        Student[] st = new Student[n];
        while(i<=n)
            {
               Address a = new Address(line1, line2, city, state, pinCode);
               Student s = new Student(firstName,lastName, a,dateofBirth,skills,q,p,eMail,contactNo);
               System.out.println("\n first name :");
               firstName = input.next();
               System.out.println("\n last name is:");   
               lastName = input.next();
               System.out.println("\n email :");          
               eMail = input.next();
               System.out.println("\n contact no :");
               contactNo= input.next(); 
               System.out.println("How many skills you want to enter? ");
               int j=input.nextInt();
               for(int k=0;k<j;k++)
               {
                System.out.println(" \nThe skill of the student : ");
                skills[i]=input.next();
               }
               System.out.println("How many projects you want to enter?");
               int l=input.nextInt();
               Project[] p = new Project[l];
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
                 role = Input.next();
                 System.out.println("How many responsibilities you want to enter? ");
                 int n=input.nextInt();
                 for(int o=0;o<n;o++)
                    {
                     System.out.println("Enter the responsibility");
                     responsibility[o]=input.next();
                    }
                 Project p[m] = new Project(name,  startDate, endDate ,role,responsibilities);
                }                          
        
               System.out.println("\n how many qualification details you want to enter?");
               int qn = input.nextInt();
               Qualification[] q = new Qualification[qn];
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
                  Qualification q[qn] = new Qualification( qualName,  university , institute, cgpa);
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
            }
       
    }
}