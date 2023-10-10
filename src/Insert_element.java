import javax.sound.midi.Soundbank;

public class Insert_element
{
    public static void main(String[] args) {
        int n [] = {1,2,4,5,12};
        int element= 45;

        int position = 3;

        System.out.println("Original Array:\n" + " 1, 2, 4, 5, 12 ");

        for(int i=n.length-1; i>position; i--)
        {
            n[i]= (n[i-1]);

        }

        n[position] = element;
        System.out.println("After inserting element in position 3: ");

        for (int j=0;j<n.length;j++)
        {

            System.out.print(n[j]+", ");
        }


    }
}
