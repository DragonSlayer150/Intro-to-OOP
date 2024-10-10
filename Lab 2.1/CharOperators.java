import java.util.Scanner;

public class CharOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String operator = " ";
        int output = 0;

        System.out.println("Enter First Number");
        if (input.hasNextInt()) {
            num1 = input.nextInt();
        } else {
            input.next();
            System.out.println("Try Again:");
            if (input.hasNextInt()) {
                num1 = input.nextInt();
            } else {
                System.out.println("Exiting");
                System.exit(1);
            }
        }
        input.nextLine();

        System.out.println("Enter Operator (+,-,*,/)");
        operator = input.nextLine().trim();

        System.out.println("Enter Second Number");
        if (input.hasNextInt()) {
            num2 = input.nextInt();
        } else {
            input.next();
            System.out.println("Try Again:");
            if (input.hasNextInt()) {
                num2 = input.nextInt();
            } else {
                System.out.println("Exiting");
                System.exit(1);
            }
        }

        if (operator.equals("+")) {
            output = num1 + num2;
        } else if (operator.equals("-")) {
            output = num1 - num2;
        } else if (operator.equals("*")) {
            output = num1 * num2;
        } else if (operator.equals("/")) {
            output = num1 / num2;
        } else {
            System.err.println("Please enter a valid operator");
        }

        System.out.printf("%d %s %d = %d", num1, operator, num2, output);
        input.close();
    }
}
