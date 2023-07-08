package Chapter3Programs;
import java.util.Scanner;

//Write a program that decrypts a phrase with the real message being the first 5 characters with an even index
// For example Hieylwlso would output as Hello


public class PracticeProgram67
{
        public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in);
                String codeword = " ";

                System.out.println("Enter an encrypted sentence: ");
                codeword = input.next();


                String first = codeword.substring(0,1);
                String second = codeword.substring(2,3);
                String third = codeword.substring(4,5);
                String fourth = codeword.substring(6,7);
                String fifth = codeword.substring(7+1);

              System.out.println("The decrypted sentence is: " + first + second + third + fourth + fifth);
        }
}
