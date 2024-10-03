import java.util.Scanner;

public class ScannerAdder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter Second Number: ");
        double num2 = input.nextDouble();

        double output = num1 * num2;
        System.out.println("The product is " + output);

        input.close();
    }
}
