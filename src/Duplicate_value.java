public class Duplicate_value
{
    public static void main(String[] args)
    {
        int a [] = {20,25,30,35,35,40};//pre assigned array.....


        for(int i=0;i<=a.length-2;i++)//loop to iterate through the length of the array.....
        {
            if(a[i]==a[i+1])// condition to check first element of array to the next(i+1) element if they match...
            {
                System.out.println(a[i] + " is a duplicate value.");//printing the common element....
            }

        }



    }
}
