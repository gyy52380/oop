package hr.fer.oop.lab2.prob2;

import java.util.Scanner;
import java.math.*;

public class Roots {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("3 arguments required: `real_part` `imaginary_part` `nth_root`");
        }

        double real, imaginary;
        int root;

        try {
            real = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Expected value of type double for argument `real_part`");
            return;
        }

        try {
            imaginary = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Expected value of type double for argument `imaginary_part`");
            return;
        }

        try {
            root = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Expected value of type double for argument `real_part`");
            return;
        }
        if (root < 1) {
            System.out.println("Expected value >= 1 for argument `nth_root`");
            return;
        }

        double angle = Math.atan(imaginary / real);
        double radius = Math.sqrt(real * real + imaginary * imaginary);
        double rootRadius = Math.pow(radius, 1 / (double)root);

        System.out.println(String.format("You requested calculation of %d. roots. Solutions are:", root));

        for (int k = 0; k < root; k++) {
            double a = (angle + 2 * Math.PI * k) / root;
            double r = rootRadius * Math.cos(a);
            double i = rootRadius * Math.sin(a);

            char sign = i < 0 ? '-' : '+';
            System.out.println(String.format("%d) %.0f %c %.0fi", k + 1, r, sign, Math.abs(i)));
        }
    }
}
