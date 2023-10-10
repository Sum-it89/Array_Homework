import java.util.Arrays;
import java.util.Scanner;

public class Sorting
{
    public static void main(String[] args)
    {
        int Numeric [] = {4 ,8 ,2 ,1 ,3 ,45 ,89 ,90};
        Arrays.sort(Numeric);
        for (int i=0;i<Numeric.length;i++)
        {
            System.out.println(Numeric[i]);
        }


        String Words [] = {"Foxtrot ", "zulu ", "xray ", "Delta ", "tango ", "oscar ","romeo ","juliet "};

        Arrays.sort(Words);
        for (int j=0; j<Words.length; j++)
        {
            System.out.print(Words[j]);
        }






    }

}
