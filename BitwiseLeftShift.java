import java.util.Scanner;

public class BitwiseLeftShift
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitwise Operation........\n");
        System.out.print("Enetr First Number : ");
        int A = input.nextInt();
        int Result = A << 1;
        System.out.println("Result : " + Result);
    }
}