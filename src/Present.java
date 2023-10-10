import java.util.Scanner;

public class Present
{
    public static void main(String[] args)
    {
        //java in built method to get user input.....
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any number between 1-9 to check.");
        int n = scanner.nextInt();//getting user input and storing in variable..
        int arr [] = {5,9,3,5,2,1};//declaring an array with fixed value....
        boolean present = false;

        for (int i = 0; i < arr.length; i++)//loop to iterate through the array....
        {
            if(arr[i]==n)//condition to compare the user input with the array elements....
            {
                present = true;//boolean result stored in the 'present' variable....
            }

        }
        if (present==false)//condition to print if its false
        {
            System.out.println("The number entered is not present in the array");
        }
        else {//else print the positive.....
            System.out.println("The number entered is present in the array");
        }



    }
}
