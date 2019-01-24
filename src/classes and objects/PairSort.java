import java.util.*;
class Pair 
{
  private int x;
  private int y;
  public int getpx()
      { return x; }
  public int getpy()
     { return y; }
  public void set(Pair[] A)
       { 
            Scanner s= new Scanner(System.in);
             for(int i=0;i<A.length;i++)
              {  
                 System.out.println("enter the x");
                 A[i].x=s.nextInt();
                 System.out.println("enter the y");
                 A[i].y=s.nextInt(); 
          
               }
       }
       public static void sort( Pair[] A)
     { 
         Pair temp = new Pair(); 
        for(int i=0;i<A.length;i++)
           {  
              for(int j=0;j<A.length-i-1; j++)
                { 
                    if( A[j].getpy()>A[j+1].getpy())
                       {
                           temp=A[j];
                           A[j]=A[j+1];
                           A[j+1]=A[j];
                        }
                  }
              }
          }
          
    }
 
 class PairSort
 { 
 public static void main(String args[])
 { 
    Pair[] A= new Pair[4];
    for(int i=0;i<A.length;i++)
      A[i]= new Pair();
    Pair a = new Pair();
     a.set(A);
     System.out.println("AFTER SORTING....");
      a.sort(A);
       System.out.print("\n");
       System.out.print("[");
      for(int i=0;i<4;i++)
        {  
            System.out.print("(");
            System.out.print(A[i].getpx());
            System.out.print(",");
            System.out.print(A[i].getpy());
            System.out.print(")");
         }
      System.out.print("]");
     }
}