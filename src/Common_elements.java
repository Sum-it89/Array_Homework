public class Common_elements
{
    public static void main(String[] args)
    {
        String array []= {"alpha","beta", "omega", "sigma"};//pre assigned first array...
        String names [] = {"delta", "tango", "sierra", "omega"};//pre assigned second array...

        String common = " ";

        for (int i = 0; i <array.length; i++)
        {
            //first loop to check the elements inside the first array.........

            for(int j=0;j<names.length;j++)
            {
               // Second loop to check the elements inside the second array.......

                if(array[i] == names[j])// comparing with a condition to check if there are any common values between two arrays.
                {
                    System.out.println("Common value between the first and second array: " + array[i]);//if found print that element
                }
            }
        }

    }
}
