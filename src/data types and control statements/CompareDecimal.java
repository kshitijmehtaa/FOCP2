import java.util.Scanner;
public class CompareDecimal
{
public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating-pt. No.: ");
        double x = in.nextDouble();
        System.out.print("Input floating-pt. another no.: ");
        double y = in.nextDouble();

        a = Math.round(a * 1000);
        a = a / 1000;

        b = Math.round(b * 1000);
        b = b / 1000;

        if (a == b)
        {
            System.out.println("They are same up to 3 decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}     