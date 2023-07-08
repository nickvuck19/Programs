package Chapter3Programs;
import java.util.Random;
import java.text.DecimalFormat;


public class PracticeProgram60
{
    public static void main(String[] args)
    {
        //Write a program that generates three random integers between 0-50, finds the average, and rounds to one
        // decimal place

        DecimalFormat round = new DecimalFormat("0.0");
        Random random = new Random();
        int start = 0;
        int end = 50;
        int r1 = random.nextInt(end - start + 1) + start;
        int r2 = random.nextInt(end - start + 1) + start;
        int r3 = random.nextInt(end - start + 1) + start;

        System.out.println(r1 + " " + r2 + " " + r3);

        double average = (double)(r1 + r2 + r3) / 3;

        System.out.println(round.format(average));

    }
}
