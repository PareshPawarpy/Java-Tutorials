import java.util.Scanner;

public class ArraySorted
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Check Array Is Sorted Or Not Sorted..........\n");
        System.out.print("Enter The Number Of Element : ");
        int Size = input.nextInt();
        int[] NumArr = new int[Size];
        int i = 0;
        while(i < Size)
        {
            System.out.print("Enter The Element Number " + (i+1) + " : ");
            NumArr[i] = input.nextInt();
            i++;
        }
        boolean ResultIn = isIncreasing(NumArr);
        boolean ResultDe = isDecreasing(NumArr);
        if(ResultIn || ResultDe)
        {
            System.out.println("Your Array Is Sorted");
        }
        else
        {
            System.out.println("Your Array Is Not Sorted");
        }
    }

    public static boolean isIncreasing(int[] NumArr)
    {
        int i = 1;
        while(i < NumArr.length)
        {
            if(NumArr[i] < NumArr[i - 1])
            {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] NumArr)
    {
        int i = 1;
        while(i < NumArr.length)
        {
            if(NumArr[i] > NumArr[i - 1])
            {
                return false;
            }
            i++;
        }
        return true;
    }
}