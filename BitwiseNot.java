import java.util.Scanner;

public class BitwiseNot
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitwise Operation........\n");
        System.out.print("Enetr First Number : ");
        int A = input.nextInt();
        int Result = ~ A;
        System.out.println("Result : " + Result);
    }
}