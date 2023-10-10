import java.sql.SQLOutput;

public class Specific_Value
{
    public static void main(String[] args)
    {
        int Number [] = {1,2,9,33,3,2};
        int special= 33;
        boolean n = false;


        for (int i = 0; i < Number.length; i++)
        {
            if(!(Number[i] == special))



                System.out.println(Number[i]);




        }



    }
}
