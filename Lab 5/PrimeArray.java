public class PrimeArray {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; (i * i) <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] primes = new int[25];

        int primeCount = 0;
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                primes[primeCount] = i;
                primeCount++;
            }
        }

        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
