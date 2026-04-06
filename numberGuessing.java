import java.util.Scanner;

public class numberGuessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secretNum = 7;
        int guess;

        System.out.println("Welcome to Number Guessing Game!");

        while (true) {
            System.out.print("Enter your guess (between 1 and 10): ");
            guess = sc.nextInt();

            if (guess == secretNum) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } 
            else if (guess < secretNum) {
                System.out.println("Too low! Try again.");
            } 
            else {
                System.out.println("Too high! Try again.");
            }
        }

        sc.close();
    }
}