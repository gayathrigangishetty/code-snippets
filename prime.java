import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Handle edge cases
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true;

            // Check divisibility from 2 to sqrt(number)
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        scanner.close();
    }
}
