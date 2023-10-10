import java.util.Arrays;
import java.util.Scanner;

public class Ascending
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any 5 numbers.");


        int array1 [] = new int[5];

        for (int i = 0; i <array1.length; i++)
        {
            array1[i]= scanner.nextInt();

        }

        Arrays.sort(array1);
        System.out.print("Sorted in ascending order: ");
        for (int j=0;j<array1.length;j++)
        {
            System.out.print(array1[j]+ " ");
        }



    }
}
