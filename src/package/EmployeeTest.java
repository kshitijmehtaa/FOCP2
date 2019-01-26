import kshitij.*;
class EmployeeTest
{  
public static void main(String args[])
  {  
     System.out.print("\nenter the info for employee 1 ");
     Employee e1 = new Employee();
     e1.Eget();
     System.out.print("\nenter the info for employee 2 ");
     Employee e2 = new Employee();
     e2.Eget();
     System.out.print("\nThe yearly salary of employee 1 is : ");
     System.out.print(12*e1.getsal());
     System.out.print("\nThe yearly salary of employee 2 is : ");
     System.out.print(12*e2.getsal());
     System.out.print("\nAFTER A RISE OF 10% IN THEIR SALARY.... \n");
     System.out.print("\nThe yearly salary of employee 1 is : ");
     System.out.print((12*e1.getsal()/10)+(12*e1.getsal()));
     System.out.print("\nThe yearly salary of employee 2 is : ");
     System.out.print((12*e2.getsal()/10)+(12*e2.getsal()));
}    }