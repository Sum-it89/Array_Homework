public class Contains_value
{
    public static void main(String[] args)
    {
        int n [] = {1,2,4,45,5,12};//pre assigned array......

        int special = 45;//special value to check....
        boolean result= false;//.taking boolean variable to return true or false...

        for (int i=0; i<n.length; i++)//loop to iterate the length of the array ....
        {
            if(n[i] == special )//condition to check whether the array contains the value or not.....
            {
                result = true;//place the result of the iteration in the result variable as true....

            }

        }
        if(result == true)//another condition to see if the result would be true or false.....
        {
            System.out.println("Yes");
        }
        else
        {        System.out.println("No");
        }

    }
}
