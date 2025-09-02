package ARRAY;

import java.util.Scanner;

public class FindLargestValue {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            ;
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("The Smallest value is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int numbers[] = new int[n];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        ;

        System.out.println("The array elements are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        ;

        int largestValue = getLargest(numbers);
        System.out.println("The Largest value is : " + largestValue);
    };
};
