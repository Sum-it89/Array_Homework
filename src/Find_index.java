public class Find_index
{
    public static void main(String[] args) {
        int n [] = {1,2,4,45,5,12};//pre assigned array.....

        int special = 45;//special element to check....


        for(int i=0; i<n.length; i++)//loop to iterate through the length of the array....
        {
            if(n[i] == special)// condition to check if the iteration matched the special value...
            {

                System.out.println(i);//i prints the index of the element.....
            }
        }

    }
}
