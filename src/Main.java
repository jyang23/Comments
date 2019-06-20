/*
 * Justin Yang
 * Comments Assignment
 * June 19, 2019
 */
import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //creates a new object called random
        Random random = new Random();
        int from = 1;
        long to = 100;
        int randomNumber = random.nextInt((int)(to - from + 1)) + from;
        //
        int guessedNumber = 0;

        //prints to the console
        System.out.printf("The number is between %d and %d.\n", from, to);

        //do statement
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
} 