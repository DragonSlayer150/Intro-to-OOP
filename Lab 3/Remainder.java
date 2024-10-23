public class Remainder {
    public static void main(String[] args) {
        int a = 510;
        int b = -20;

        double dividend = (double) a / b;
        double remainder = (dividend - Math.floor(dividend)) * b;
        System.out.printf("%d %% %d is %.0f", a, b, remainder);
    }
}
