package Chapter3Programs;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

//Write a program that takes input from the user for investment and interest rate, using the formula for future value
//output the future value earned in 5, 10, and 20 years

public class PracticeProgram63
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat dollarFormat = new DecimalFormat("$0.00");
        double investment = 0;
        double interestRate = 0;

        System.out.println("Enter the investment value: ");
        investment = input.nextDouble();
        System.out.println("Enter the interest rate: ");
        interestRate = input.nextDouble();

        double futureValue1 = investment * Math.pow((1 + interestRate),5);
        double futureValue2 = investment * Math.pow((1 + interestRate),10);
        double futureValue3 = investment * Math.pow((1 + interestRate),20);



        System.out.println(dollarFormat.format(futureValue1));
        System.out.println(dollarFormat.format(futureValue2));
        System.out.println(dollarFormat.format(futureValue3));
    }
}
