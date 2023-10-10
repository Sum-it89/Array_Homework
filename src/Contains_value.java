public class Contains_value
{
    public static void main(String[] args)
    {
        int n [] = {1,2,4,45,5,12};

        int special = 45;
        boolean result= false;

        for (int i=0; i<n.length; i++)
        {
            if(n[i] == special )
            {
                result = true;

            }

        }
        if(result == true)
        {
            System.out.println("Yes");
        }
        else
        {        System.out.println("No");
        }

    }
}
