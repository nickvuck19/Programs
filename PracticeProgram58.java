package Chapter3Programs;
import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class PracticeProgram58
{
    public static void main(String[] args)
    {
        //Write a program that reads input radius from the keyboard to find the area and circumference of a circle

        Scanner input = new Scanner(System.in);
        DecimalFormat round = new DecimalFormat("0.00");
        double pi = Math.PI;
        double radius = 0;


        System.out.println("Enter a value for the radius:   ");
        radius = input.nextDouble();

        double area = pi * (radius * radius);
        double circumference = 2 * pi * radius;

        System.out.println("The area of the circle is: " + round.format(area));
        System.out.println("The circumference of the circle is: " + round.format(circumference));

    }
}
