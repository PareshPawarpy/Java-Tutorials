import java.util.Scanner;

public class AreaTriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Area OF Triangle.....\n");
        System.out.print("Enetr Bridth Of Triangle : ");
        int Bridth = input.nextInt();
        System.out.print("Enetr Height Of Triangle : ");
        int Height = input.nextInt();
        double Result = 0.5 * Bridth * Height;
        System.out.println("Area Of Triangle Is : " + Result);
    }
}