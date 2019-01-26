import assignment.*;
import java.util.*;

//class for main method
class StudentDriver
{
	public static void main(String args[])
   {
        int n, i,pinCode, startDate, endDate , dateofBirth ;
        String firstName, lastName,eMail,contactNo,line1,line2, city, state,qualName , university , institute,name, role,skills[] ;  
        float cgpa;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of students for entering the data" );
        n = input.nextInt();
        System.out.println("Enter the serial no."); 
        i = input.nextInt();
        System.out.println("The personal details of the student " + i + " is:");
        Address a = new Address(line1, line2, city, state, pinCode);
        Qualification q = new Qualification( qualName,  university , institute, cgpa);
        Project p = new Project(name, role, startDate, endDate ,responsibilities);
        Student s = new Student(firstName,lastName, a,dateofBirth,skills[],q,p,eMail,contactNo);
        System.out.println("\n first name :");
        firstName = input.next();
        s.setFN(firstName);
        System.out.println("\n last name is:");   
        lastName = input.next();
        s.setLN(lastName);
        System.out.println("\n email :");          
        eMail = input.next();
        s.setEmail(eMail);
        System.out.println("\n contact no :");
        contactNo= input.next();
        s.setContactno(contactNo);                          
        System.out.println(" \nThe skill of the student : ");
        skills=input.next();
        s.setSkills(skills); 
        System.out.println("\n The project details of the student  :");
        ystem.out.println("\n The name of the project :");
        pr.setName(name);
        System.out.println("\nThe role of the project  :");
        pr.setRole(role);
        System.out.println("\n The qualification details of the student : "); 
        System.out.println("\n The qualification name of the student  :");
        qualName = input.next();
        qual.setQN(qualName);
        System.out.println("\nThe Institute of the student  :");
        institute = input.next();
        qual.setIn(institute);
        System.out.println("\n The project details of the student  :");
        university = input.next();
        qual.setU(university);
        System.out.println("\n The cgpa of the student  :");
        cgpa= input.nextFloat();
        qual.setCgpa(cgpa);         
        System.out.println("\n The address of the student :  ");
        System.out.println("\n The line 1 of  address of the student : ");
        line1 = input.next();
        addr.setL1(line1); 
        System.out.println("\n The line 2 of  address of the student :  ");
        line2 = input.next();
        addr.setL2(line2);
        System.out.println("\n  city :  ");
        city = input.next();
        addr.setC(city);
        System.out.println("\n The state : ");
        state = input.next();
        addr.setS(state);
        System.out.println("\n The pincode : ");
        pinCode = input.nextInt();
        addr.setPN(pinCode);
    }
}