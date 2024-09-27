import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        // Using Scanner and loop to simplify testing
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Miles: ");
            double inputUnit = input.nextDouble();

            if (inputUnit == -1)
                break;

            double output = (inputUnit * 5280.0) / 3.0;

            System.out.printf("%f in Yards is %f%n", inputUnit, output);
        }
    }
}
