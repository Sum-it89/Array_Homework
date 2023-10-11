import java.sql.SQLOutput;

public class Specific_Value
{
    public static void main(String[] args)
    {
        int Number [] = {1,2,9,33,3,2};// pre assigned array.....
        int special= 33;//special element to check......
        boolean n = false;


        for (int i = 0; i < Number.length; i++)// loop iteration to check through the length of the array....
        {
            if(Number[i] == special)//condition to check if the new value matches with each element....
            {
                n = true;//if true the value will be stored in boolean variable....
            }

        }

        if (n==true)//then if else condition to print if the array contains the new value....
        {
            System.out.println("Contains Specific value");
        }
        else
        {
        System.out.println("Doesn't contain specific value");

        }
    }




}
