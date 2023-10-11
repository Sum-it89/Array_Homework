import java.util.Arrays;
import java.util.Scanner;

public class Ascending
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//inbuilt method to get user input.....

        System.out.println("Please enter any 5 numbers.");//user input request....


        int array1 [] = new int[5]; //declaring empty array with size of 5....

        for (int i = 0; i <array1.length; i++)//loop iteration through the length of the array
        {
            array1[i]= scanner.nextInt(); //placing the user input inside the empty array inside the loop...

        }

        Arrays.sort(array1);//in built sorting method in java....
        System.out.print("Sorted in ascending order: ");
        for (int j=0;j<array1.length;j++)//second loop to iterate through now filled array....
        {
            System.out.print(array1[j]+ " ");//printing the sorted array.........
        }



    }
}
