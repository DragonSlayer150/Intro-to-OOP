public class RationalNumber {

    private int numerator;
    private int denominator;

    public static void main(String[] args) {
        RationalNumber num = new RationalNumber(17, 38);
        System.out.println(num);
        System.out.println(num.evaluate());
    }

    public RationalNumber(int numerator, int denominator) {

        this.numerator = numerator;

        this.denominator = denominator;

    }

    public String toString() {

        return numerator + "/" + denominator;

    }

    public float evaluate() {

        return (float) numerator / denominator;

    }

}