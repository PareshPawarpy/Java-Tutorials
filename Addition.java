import java.util.Scanner;

public class Addition
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First number :");
        int firstNumber = input.nextInt();
        System.out.print("Enetr Second Number :");
        int secondNumber = input.nextInt();
        int Sum = firstNumber + secondNumber;
        System.out.println("Addition Of Two Number Is : " + Sum);
    }
}