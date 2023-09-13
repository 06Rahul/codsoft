/*import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        int guess;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(20) + 1;
        int attempts = 0;
        int maxAttempts = 3;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 20.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");

            try {
                guess = scanner.nextInt();

                if (guess < 1 || guess > 20) {
                    System.out.println("Please guess a number between 1 and 20.");
                    continue; // Skip the rest of the loop iteration
                }

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }

                attempts++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've used all your attempts. The correct number was: " + targetNumber);
        }

        scanner.close();
    }
}*/
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int maxRounds = 3;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You can play " + maxRounds + " rounds.");

        for (int round = 1; round <= maxRounds; round++) {
            int targetNumber = random.nextInt(20) + 1;
            int attempts = 0;
            int maxAttempts = 3;

            System.out.println("\nRound " + round);
            System.out.println("Guess a number between 1 and 20.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");

                try {
                    int guess = scanner.nextInt();

                    if (guess < 1 || guess > 20) {
                        System.out.println("Please guess a number between 1 and 20.");
                        continue; // Skip the rest of the loop iteration
                    }

                    if (guess == targetNumber) {
                        System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                        totalScore++;
                        break;
                    } else if (guess < targetNumber) {
                        System.out.println("Try a higher number.");
                    } else {
                        System.out.println("Try a lower number.");
                    }

                    attempts++;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.nextLine();
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + targetNumber);
            }
        }

        System.out.println("\nGame over! Your total score is: " + totalScore + " out of " + maxRounds);
        scanner.close();
    }
}

