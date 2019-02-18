import java.io.*;
import java.util.*;
class FileDemoWrite {
   public static void main(String[] args) {
      File f = null;
      int n=1;
      try {
            f = new File("file"+n+".txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter a String:");
 	     while(sc.hasNext()){
               bout.write(sc.nextLine());
               bout.newLine();
        }
            bout.close();
}         
    catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }    } }
