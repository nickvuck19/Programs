package Chapter3Programs;
import java.util.Random;
import java.lang.Math;

public class PracticeProgram59
{
    public static void main(String[] args)
    {
        //Write a program that generates 5 random integers from 60 to 100 and finds the smallest value of the 5

        Random random = new Random();

        int start = 60;
        int end = 100;

        int r1 = random.nextInt(end - start + 1) + start;
        int r2 = random.nextInt(end - start + 1) + start;
        int r3 = random.nextInt(end - start + 1) + start;
        int r4 = random.nextInt(end - start + 1) + start;
        int r5 = random.nextInt(end - start + 1) + start;

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

        int temp1 = Math.min(r1,r2);
        int temp2 = Math.min(temp1, r3);
        int temp3 = Math.min(temp2, r4);
        int temp4 = Math.min(temp3, r5);

        System.out.println(temp4);

    }
}
