package Chapter3Programs;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

//Write a program that calculates monthly mortgage payments for a user

public class PracticeProgram73
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        DecimalFormat percent = new DecimalFormat("0.0#%");
        DecimalFormat dollar = new DecimalFormat("$0.00");
        double ANNUAL_INTEREST_RATE = 0;
        double nOY = 0;
        double AMOUNT_BORROWED = 0;

        System.out.println("Enter the annual interest rate percent in decimal form: ");
        ANNUAL_INTEREST_RATE = input.nextDouble();
        System.out.println("Enter the number of years the mortgage will be held: ");
        nOY = input.nextDouble();
        System.out.println("Enter the amount borrowed from the bank for the mortgage: ");
        AMOUNT_BORROWED = input.nextDouble();

        double mIR = ANNUAL_INTEREST_RATE / 12;
        double monthlyPayment = (mIR * AMOUNT_BORROWED) / (1 - Math.pow((1/(1 + mIR)),(12 * nOY)));
        double totalPayment = monthlyPayment * 12 * nOY;
        double difference = totalPayment - AMOUNT_BORROWED;
        double overpayPercent = totalPayment / AMOUNT_BORROWED;

        System.out.println("Your annual interest rate: " + percent.format(ANNUAL_INTEREST_RATE));
        System.out.println("You borrowed " + dollar.format(AMOUNT_BORROWED) + " for the mortgage payment");
        System.out.println("Your monthly payment is totaled at " + dollar.format(monthlyPayment));
        System.out.println("The overpayment difference is: " + dollar.format(difference));
        System.out.println("The overpayment percent is: " + percent.format(overpayPercent));

    }
}
