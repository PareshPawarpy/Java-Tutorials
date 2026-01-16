import java.util.Scanner;

public class addNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int firstNumber = input.nextInt();
        Scanner secondInput = new Scanner(System.in);
        System.out.print("Enter Second Number : ");
        int secondNumber = secondInput.nextInt();
        int sum = firstNumber + secondNumber ;
        System.out.println("Addition Of Two Number Is : " + sum);
    }
}