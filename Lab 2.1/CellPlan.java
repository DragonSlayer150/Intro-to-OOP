public class CellPlan {
    public static void main(String[] args) {
        int numTexts = 160;
        double planCost = 100.0;

        if (numTexts > 100) {
            planCost += (numTexts - 100) * 0.60;
            if (planCost > 130.00) {
                planCost = 130.00;
            }
        }
        if (numTexts > 150) {
            planCost += (numTexts - 150) * 0.50;
            if (planCost > 155.00) {
                planCost = 155.00;
            }
        }
        if (numTexts > 200) {
            planCost += (numTexts - 200) * 0.40;
        }

        System.out.printf("The cost plan for %d texts is $%.2f", numTexts, planCost);
    }
}
