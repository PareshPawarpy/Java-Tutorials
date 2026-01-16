import java.util.Scanner;

public class Arithmatics
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Addition Of Two Numbers....\n");
        System.out.print("Enetr First Number : ");
        int A = input.nextInt();
        System.out.print("Enter Second Number : ");
        int B = input.nextInt();
        int C = A + B ;
        System.out.println("Addition Of Two Number Is :" + C);
        System.out.println("Welcome Subtraction Of Two Numbers....\n");
        int D = A - B;
        System.out.println("Subtraction Of Two Number Is :" + D);
        System.out.println("Welcome Multiplication Of Two Numbers....\n");
        int E = A * B;
        System.out.println("Multiplication Of Two Number Is :" + E);
        System.out.println("Welcome Division Of Two Numbers....\n");
        int F = A / B;
        System.out.println("Division Of Two Number Is :" + F);
    }
}