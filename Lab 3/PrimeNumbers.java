public class PrimeNumbers {
    public static void main(String[] args) {
        double num = 1789;
        double upperLimit = Math.ceil(Math.sqrt(num));
        boolean isPrime = false;

        if (num == 0 || num == 1) {
            isPrime = false;
        } else {
            int count = 0;
            for (int i = 2; i <= upperLimit; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                count += 1;
            }
            if (count == upperLimit - 1 || num == 2) {
                isPrime = true;
            }
        }

        System.out.printf("%.0f is a prime number? %b", num, isPrime);

    }
}
