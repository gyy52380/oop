package hr.fer.oop.lab2.exam;

public class Main {
    public static Character firstRepeatingChar(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                char c2 = str.charAt(j);
                if (Character.toUpperCase(c1) == Character.toUpperCase(c2))
                    return c1;
            }
        }
        return null;
    }

    static boolean isArmstrong(int number) {
        int count = 0;
        for (int n = number; n > 0; n /= 10)
            count++;

        int accumulated = 0;
        for (int n = number; n > 0; n /= 10) {
            int digit = n % 10;
            accumulated += Math.pow(digit, count);
        }

        return accumulated == number;
    }

    public static int[] frequency(int[] numbers) {
        int uniqueCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean alreadySeen = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    alreadySeen = true;
                    break;
                }
            }
            if (!alreadySeen) uniqueCount++;
        }

        int[] result = new int[uniqueCount * 2];
        int cursor = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean alreadySeen = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    alreadySeen = true;
                    break;
                }
            }
            if (alreadySeen) continue;

            int n = numbers[i];
            int count = 0;

            for (int other : numbers)
                if (other == n) count++;

            result[cursor++] = n;
            result[cursor++] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        int someArray[] = new int[] {1,2,6,9,4,2,6,8,3,6,2,6};
        int resultArray[] = frequency(someArray);
        for(int num: resultArray) {
            System.out.print(num);
            System.out.print(",");
        }
        System.out.println();
    }
}
