public class Find_index
{
    public static void main(String[] args) {
        int n [] = {1,2,4,45,5,12};

        int special = 45;


        for(int i=0; i<n.length; i++)
        {
            if(n[i] == special)
            {

                System.out.println(i);
            }
        }

    }
}
