import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        // Using Scanner and loop to simplify testing
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Enter Miles: ");
            double inputUnit = input.nextDouble();

            if (inputUnit == -1)
                break;

            double output = inputUnit * 1.609;

            System.out.printf("%f in Yards is %f%n", inputUnit, output);
        }
        input.close();
    }
}
