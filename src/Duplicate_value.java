public class Duplicate_value
{
    public static void main(String[] args)
    {
        int a [] = {20,25,30,35,35,40};


        for(int i=0;i<=a.length-2;i++)
        {
            if(a[i]==a[i+1])
            {
                System.out.println(a[i] + " is a duplicate value.");
            }

        }



    }
}
