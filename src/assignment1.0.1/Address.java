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
     this.line1 = a.line1;
     this.line2 = a.line2;
     this.city = a.city;
     this.state = a.state;
     this.pinCode = a.pinCode;
    }

  public Address(String a, String b, String c ,String d, int e)
    {
     this.line1 = a;
     this.line2 = b;
     this.city = c;
     this.state = d;
     this.pinCode = e;
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