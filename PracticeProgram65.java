package Chapter3Programs;
import java.util.Scanner;


//Write a program that reads an email address. Assuming the email address contains an @ sign, extract the username
// and domain name from the email and output it


public class PracticeProgram65
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String email = " ";

        System.out.println("Enter your email address: ");
        email = input.next();

        int atSign = email.indexOf("@");
        String userName = email.substring(0,atSign);
        System.out.println("The username is: " + userName);

        String domain = email.substring(atSign + 1);
        System.out.println("The domain is: " + domain);
    }
}
