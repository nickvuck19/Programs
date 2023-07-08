package Chapter3Programs;
import java.util.Scanner;
import java.lang.Math;

public class PracticeProgram62
{
    public static void main(String[] args)
    {
        //Write a program that reads three double values from keyboard representing a, b, and c of the quadratic formula
        //equation
        Scanner input = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println("Enter a value for a: ");
        a = input.nextDouble();
        System.out.println("Enter a value for b: ");
        b = input.nextDouble();
        System.out.println("Enter a value for c: ");
        c = input.nextDouble();

        double x1 = (-1 * b) + Math.sqrt((b * b) - (4 * a * c)) / (2 * a);
        double x2 = (-1 * b) - Math.sqrt((b * b) - (4 * a * c)) / (2 * a);

        System.out.println("x1 value is: " + x1);
        System.out.println("x2 value is: " + x2);
    }
}
