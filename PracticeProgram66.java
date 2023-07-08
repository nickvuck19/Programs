package Chapter3Programs;
import java.util.Scanner;
import java.text.DecimalFormat;

//Write a program that reads a 10 digit String phone number and outputs it in phone number form
// (nnn)-nnn-nnnn


public class PracticeProgram66
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        String phoneNumber = " ";

        System.out.println("Enter a 10 digit phone number");
        phoneNumber = input.next();

        String format = String.format("(%s) %s-%s",phoneNumber.substring(0,3),phoneNumber.substring(3,6),
                phoneNumber.substring(6,10));

        System.out.println(format);





    }
}
