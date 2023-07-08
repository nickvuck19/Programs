package Chapter3Programs;
import java.util.Scanner;
import java.text.NumberFormat;
//Write a Java program that reads three integer values from the keyboard representing a number of
// quarters, nickels, and dimes. Convert the total coin amount to dollars and output in dollar notation


public class PracticeProgram57
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        NumberFormat dFormat = NumberFormat.getCurrencyInstance();
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

        System.out.println("Enter a number of quarters: ");
        quarters = input.nextInt();

        System.out.println("Enter a number of dimes: ");
        dimes = input.nextInt();

        System.out.println("Enter a number of nickels:  ");
        nickels = input.nextInt();


        double totalCents = (quarters * .25) + (dimes * .10) + (nickels * .05);

        System.out.println(dFormat.format(totalCents));
    }
}
