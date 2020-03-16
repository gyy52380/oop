package hr.fer.oop.lab2.prob4;

public class PrimeFactorization {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Expected 1 argument.");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Expected argument of type int.");
            return;
        }
        if (n <= 1) {
            System.out.println("Argument expected to be > 1");
            return;
        }

        int counter = 0;
        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (isPrime(i) && (n % i == 0)) {
                    n /= i;
                    counter++;
                    System.out.println(String.format("%d. %d", counter, i));
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
