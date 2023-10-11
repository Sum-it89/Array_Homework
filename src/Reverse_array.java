public class Reverse_array
{
    public static void main(String[] args)
    {
        int array [] = {20, 25, 30, 35};//pre assigned array.....
        int result [] = new int[4];//new empty array.....

        for (int i = array.length-1; i >=0; i--)//reverse iteration through the loop.....
        {
            System.out.println(array[i]);//printing the result as reversed array....


        }
    }
}
