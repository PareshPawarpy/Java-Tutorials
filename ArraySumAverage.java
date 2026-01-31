import java.util.Scanner;

public class ArraySumAverage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Array Sum And Average.........\n");
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
        long SumResult = Sum(NumArr);
        long AvgResult = Avg(NumArr);
        System.out.println("Sum Of The Array Is : " + SumResult);
        System.out.println("Average Of The Array Is : " + AvgResult);
    }

    public static long Sum(int[] NumArr)
    {
        long sum = 0;
        int i = 0;
        while(i < NumArr.length)
        {
            sum = sum + NumArr[i];
            i++;
        }
        return sum;
    }

    public static long Avg(int[] NumArr)
    {
        long avg = Sum(NumArr);
        avg /= NumArr.length;
        return avg ;
    }
}