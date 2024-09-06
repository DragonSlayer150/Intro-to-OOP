//Question 3 Example code 

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        final int MAX_NUM_TRIES = 2;
        int numberOfTries;
        int inputInteger;
        int sum;
        int i;

        // Explain the purpose of the program to the user
        System.out.println(
                "This program computes the sum of integers from 0 to an entered number, but only if that entered number is between 1 and 15! If the entered number is not between 1 and 15 the program will prompt the user for an appropriate input ONLY a TOTAL of TWICE and NO MORE. If no valid input is given (a number between 1 and 15) the program will exit.");
        System.out.println("=====================================");
        System.out.println();

        // Get Input
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please input the number between 1 and 15:  ");
            inputInteger = scanner.nextInt();

            numberOfTries = 0;
            while ((numberOfTries < MAX_NUM_TRIES) && ((inputInteger > 15) || (inputInteger < 1))) {
                System.out.println();
                System.out.println("The number should be between 1 and 15!");
                System.out.print("Please input the number between 1 and 15:  ");
                inputInteger = scanner.nextInt();
                numberOfTries++;
            }
            System.out.println();

            // Verify if the user entered a proper integer after MAX_NUM_TRIES
            if ((inputInteger > 15) || (inputInteger < 1)) {
                System.out.println("Sorry, but I cannot compute the sum for provided integer!");
                System.out.println("Exiting...");
                return;
            }

            // Compute the sum
            sum = 0;
            for (i = 0; i < inputInteger; i++) {
                sum = sum + (i + 1);
            }
            // Output the results
            System.out.println("Sum of integers from 1 to " + inputInteger + " is " + sum);
            System.out.println("=====================================");
            System.out.println("Exiting...");
        }
    }
}
