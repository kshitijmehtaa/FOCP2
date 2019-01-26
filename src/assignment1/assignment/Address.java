package assignment;
import assignment.*;
//class for address information
public class Address
{
  String line1;
  String line2;
  String city;
  String state;
  int pinCode;

  public Address(Address a)
    {
     this.line1 = new String(a.line1);
     this.line2 = new String(a.line2);
     this.city = new String(a.city);
     this.state = new String(a.state);
     this.pinCode = a.pinCode;
    }

  public Address(String a, String b, String c ,String d, int e)
    {
     this.line1 = new String(a);
     this.line2 = new String(b);
     this.city = new String(c);
     this.state = new String(d);
     this.pinCode = e;
    }
    public void setL1(String line1) 
   {   
      this.line1= line1;
   }
   public String getL1()
   {
   	return line1;
   }
    public void setL2(String line2) 
   {   
      this.line2= line2;
   }
   public String getL2()
   {
   	return line2;
   }
    public void setC(String city) 
   {   
      this.city= city;
   }
   public String getC()
   {
   	return city;
   }
    public void setS(String state) 
   {   
      this.state=state;
   }
   public String getS()
   {
   	return state;
   }
    public void setPN(int pinCode) 
   {   
      this.pinCode=pinCode;
   }
   public int getPN()
   {
   	return pinCode;
   }
    public void displayAddress ()
     {
        System.out.println("The address of the student is \n" + "Address line 1 = \n"+ line1 + "Address line 2 =\n"+ line2 + " City is =\n"+
           city + " State is = \n" + state + " Pin Code = \n"+ pinCode); 
    }

   public void Display()
    {
      System.out.print("\n Address : " + this.line1);
      System.out.print("\n Alternate Address : " + this.line2);
      System.out.print("\n City : " + this.city);
      System.out.print("\n State : " + this.state);
      System.out.print("\n Pin Code : " + this.pinCode);
    }
}