import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        System.out.println("The Number Is Armstrong Or Not.........\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int Num = input.nextInt();
        boolean Result = isArmstrong(Num);
        if(Result)
        {
            System.out.println("The Number Is Armstrong Number");
        }
        else
        {
            System.out.println("The Number Is Not Armstrong Number");
        }
    }

    public static boolean isArmstrong(int Num)
    {
        int noOfdigits = numberOfDigit(Num);
        int NumCopy = Num;
        int finalNumber = 0;
        while(Num > 0)
        {
            int lastDigit = Num % 10;
            Num = Num / 10;
            finalNumber = finalNumber + power(lastDigit , noOfdigits);
        }
        return finalNumber == NumCopy;
    }

    public static int power(int Num1 , int Num2)
    {
        int result = 1;
        int i = 0;
        while(i < Num2)
        {
            result = result * Num1;
            i++;
        }
        return result;
    }

    public static int numberOfDigit(int Num)
    {
        int digit = 0;
        while(Num > 0)
        {
            digit++;
            Num = Num / 10;
        }
        return digit;
    }
}