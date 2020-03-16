package hr.fer.oop.lab2.prob1;

import java.util.Locale;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Float width;
        Float height;

        if (args.length == 2) {
            width = parse(args[0]);
            if (width == null) return;

            height = parse(args[1]);
            if (height == null) return;
        }
        else if (args.length == 0) {
            try (Scanner scanner = new Scanner(System.in)) {
                width = read(scanner, "width");
                if (width == null) return;

                height = read(scanner, "height");
                if (height == null) return;
            }
        }
        else {
            System.out.println("Invalid number of arguments was provided.");
            return;
        }

        System.out.println(String.format("You have specified a rectangle of width %.1f and height %.1f. Its area is %.1f", width, height, width * height));
    }

    private static Float read(Scanner scanner, String name) {
        float value;

        System.out.print(String.format("Please provide %s: ", name));

        if (!scanner.hasNext()) {
            System.out.println("The input must not be blank.");
            return null;
        }
        if (!scanner.hasNextFloat()) {
            System.out.println("The input must be a valid float.");
            return null;
        }

        value = scanner.nextFloat();
        if (value < 0) {
            System.out.println("The width must not be negative.");
            return null;
        }

        return value;
    }

    private static Float parse(String string) {
        float value;

        try {
            value = Float.parseFloat(string);
        } catch (NumberFormatException e) {
            System.out.println("The input must be a valid float");
            return null;
        }

        if (value < 0) {
            System.out.println("The width must not be negative.");
            return null;
        }

        return value;
    }
}
