import java.util.Scanner;

public class BitwiseAnd
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitwise Operation........\n");
        System.out.print("Enetr First Number : ");
        int A = input.nextInt();
        System.out.print("Enetr Second Number : ");
        int B = input.nextInt();
        int Result = A & B;
        System.out.println("Result : " + Result);
    }
}