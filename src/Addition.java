import java.util.Arrays;

public class Addition
{
    public static void main(String[] args)
    {
        int Numeric [] = {1,2,3,2,2};//pre-assigned array.
        int sum = 0;//count variable

        for (int i=0;i<Numeric.length;i++)//iterating through the length of the array
        {
            sum = sum + Numeric[i];//adding and placing each element of the array in the count variable.
        }
        System.out.println(sum);
    }
}
