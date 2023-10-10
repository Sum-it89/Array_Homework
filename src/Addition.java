import java.util.Arrays;

public class Addition
{
    public static void main(String[] args)
    {
        int Numeric [] = {1,2,3,2,2};
        int sum = 0;

        for (int i=0;i<Numeric.length;i++)
        {
            sum = sum + Numeric[i];
        }
        System.out.println(sum);
    }
}
