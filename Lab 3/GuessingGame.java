import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 43;
        int guess = 0;

        System.out.println("Make a guess:");
        guess = input.nextInt();
        int previousGuess = guess;

        do {
            System.out.println("Make a guess:");
            guess = input.nextInt();

            if (guess == answer) {
                System.out.println("You Got It Right!");
            } else if (Math.abs(previousGuess - answer) > Math.abs(guess - answer)) {
                System.out.println("Warmer");
            } else if (Math.abs(previousGuess - answer) < Math.abs(guess - answer)) {
                System.out.println("Colder");
            }
            previousGuess = guess;
        } while (guess != 43);

        input.close();
    }
}
