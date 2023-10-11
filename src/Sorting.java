import java.util.Arrays;
import java.util.Scanner;

public class Sorting
{
    public static void main(String[] args)
    {
        int Numeric [] = {4 ,8 ,2 ,1 ,3 ,45 ,89 ,90};//preassigned array with int....
        Arrays.sort(Numeric);//in built method to sort an array into ascending order....
        for (int i=0;i<Numeric.length;i++)//iterating through the length of the array....
        {
            System.out.println(Numeric[i]);//printing the sorted array into ascending order....
        }


        String Words [] = {"Foxtrot ", "zulu ", "xray ", "Delta ", "tango ", "oscar ","romeo ","juliet "};//preassigned array with int....

        Arrays.sort(Words);//in built method to sort an array into ascending order....
        for (int j=0; j<Words.length; j++)//iterating through the length of the array....
        {
            System.out.print(Words[j]);//printing the sorted array into ascending order....
        }






    }

}
