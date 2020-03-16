package hr.fer.oop.lab2.prob3;

public class PrimeNumbers {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Expected 1 argument.");
            return;
        }

        int end;
        try {
            end = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Expected argument of type int.");
            return;
        }
        if (end <= 0) {
            System.out.println("Argument expected to be > 0");
            return;
        }

        System.out.println(String.format("You requested calculation of first %d prime numbers. Here they are:", end));

        int counter = 0;
        for (int current = 2; counter < end; current++) {
            if (isPrime(current)) {
                counter++;
                System.out.println(String.format("%d. %d", counter, current));
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
