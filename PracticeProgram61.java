package Chapter3Programs;
import java.util.Scanner;
import java.text.DecimalFormat;

public class PracticeProgram61
{
    public static void main(String[] args)
    {
        //Write a program that reads input from the keyboard of shots taken and shots made by a basketball player
        //and get the shooting percentage in percent format

        Scanner input = new Scanner(System.in);
        DecimalFormat percentFormat = new DecimalFormat("0.0#%");

        double shotsTaken = 0;
        double shotsMade = 0;

        System.out.println("Enter number of shots made: ");
        shotsMade = input.nextDouble();

        System.out.println("Enter number of shots taken: ");
        shotsTaken = input.nextDouble();

        double shotPercent = shotsMade / shotsTaken;

        System.out.println("The shooting percentage is: " + percentFormat.format(shotPercent));
    }
}
