import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principle;
        double rateOfInterest;
        double timeAccrued;
        double totalMoneyAccrued;
        double interestEarned;

        System.out.println("Interest Calculator ->");
        System.out.print("Input initial Principle:\n>> ");
        principle = input.nextDouble();

        System.out.print("Input Interest Rate (Percent in decimal form):\n>> ");
        rateOfInterest = input.nextDouble();

        System.out.print("Input Time Accrued\n>> ");
        timeAccrued = input.nextDouble();

        totalMoneyAccrued = principle * (1 + rateOfInterest * timeAccrued);
        interestEarned = totalMoneyAccrued - principle;

        System.out.printf("The total amount of money accrued is $%.2f\nInterest Earned: %.2f", totalMoneyAccrued,
                interestEarned);
        input.close();
    }
}
