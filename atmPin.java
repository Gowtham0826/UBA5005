import java.util.Scanner;

public class atmPin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;   // stored ATM PIN
        int pin;

        System.out.print("Enter your ATM PIN: ");
        pin = sc.nextInt();

        if(pin == correctPin) {
            System.out.println("Access Granted! Welcome to ATM.");
        } 
        else {
            System.out.println("Incorrect PIN. Access Denied.");
        }

        sc.close();
    }
}