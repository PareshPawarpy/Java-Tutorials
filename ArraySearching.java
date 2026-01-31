import java.util.Scanner;

public class ArraySearching
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Array Searching Code........\n");
        int[] Arr = {64 , 84 ,83 , 45 , 67 , 98 , 76 , 34 , 65 , 96 , 54 , 26 , 86};
        System.out.print("Enter The NUmber You Want To Search : ");
        int Num = input.nextInt();
        boolean Result = isFound(Arr,Num);
        if (Result)
        {
            System.out.println("Number Is Found In Array");
        }
        else
        {
            System.out.println("Number Is Not Found In Array");
        }
    }

    public static boolean isFound(int[] Arr, int Num)
    {
        int index = 0;
        while(index < Arr.length)
        {
            if (Arr[index] == Num)
            {
                return true;
            }
            index++;
        }
        return false;
    }
}