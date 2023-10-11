import javax.sound.midi.Soundbank;

public class Insert_element
{
    public static void main(String[] args) {
        int n [] = {1,2,4,5,12};// pre assigned array....
        int element= 45;//element to insert.....

        int position = 3;//index position to place the new element....

        System.out.println("Original Array:\n" + " 1, 2, 4, 5, 12 ");

        for(int i=n.length-1; i>position; i--)//loop reverse iteration to check through the length of array...
        {
            n[i]= (n[i-1]);

        }

        n[position] = element;// placing the element into the new position...
        System.out.println("After inserting element in position 3: ");

        for (int j=0;j<n.length;j++)
        {

            System.out.print(n[j]+", ");
        }


    }
}
