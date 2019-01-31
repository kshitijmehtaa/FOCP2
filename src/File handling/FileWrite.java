import java.io.*;
import java.util.*;
class FileWrite
{

  public static void main(String args[])
  {
      int serialno,a;
      float cgpa;
      char grade;
      File f=null;
    try
    {
       f = new File("file.txt");
       FileWriter fout = new FileWriter(f);
       BufferedWriter bout = new BufferedWriter(fout);
       Scanner sc = new Scanner(System.in);
       do
       {
          System.out.println("Enter the serial no.");
          serialno = sc.nextInt();
          bout.write(Integer.toString(serialno));
          bout.write(' ');
          System.out.println("enter the First name");
          bout.write(sc.next());
          bout.write(' ');
          System.out.println("Enter the cgpa");
          cgpa = sc.nextFloat();
          bout.write(Float.toString(cgpa));
          bout.write(' ');
          System.out.println("Enter the grade");
          bout.write(sc.next().charAt(0));
          bout.write(' ');
          bout.newLine();
          System.out.println("Enter 0 to exit! or any other number to continue!");
          a = sc.nextInt();
       }while(a!=0);
  bout.close();



    }
   catch(Exception e)
    {
       e.printStackTrace();
    } 

  }    
}    
  


   