import java.util.Scanner;

public class ArithmaticOperations
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Here For Arithatic Operations....\n");
        System.out.print("Enter First Number : ");
        int A = input.nextInt();
        System.out.print("Enter Second Number : ");
        int B = input.nextInt();
        int C = A + B;
        System.out.println("Addition Of Two Number Is : " + C);
        int D = A - B;
        System.out.println("Subtraction Of Two Number Is : " + D);
        int E = A * B;
        System.out.println("Multiplication Of Two Number Is : " + E);
        int F = A / B;
        System.out.println("Division Of Two Number Is : " + F);
    }
}