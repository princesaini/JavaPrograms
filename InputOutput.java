import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Creating Instance of Scanner class to take input
        Scanner input = new Scanner(System.in);

        // Taking integer input and printing
        System.out.print("Enter Number: ");
        int number = input.nextInt();
        System.out.println("You Entered: " + number);

        // Taking Single word input and printing
        System.out.print("Enter your First Name: ");
        String name = input.next();
        System.out.println("You Entered: " + name);

        input.nextLine(); // input.next() used above will not take the last return so to take that we have to write this line otherwise input.nextLine() that is used below will not work

        // Taking Sentence input and printing
        System.out.print("Enter a Sentence: ");
        String sentence = input.nextLine();
        System.out.println("You Entered: " + sentence);

        input.close();
    }
}
