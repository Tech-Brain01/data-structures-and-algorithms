package FUNCTION;

import java.util.Scanner;

public class avg {
    public static double avg(double a, double b, double c) {
        return (a + b + c) / 3;

    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = sc.nextDouble();
        System.out.println("Input the second number: ");
        double y = sc.nextDouble();
        System.out.println("Input the third number: ");
        double z = sc.nextDouble();
        System.out.println("the average value is " + avg(x, y, z) + "\n");
    };
}
