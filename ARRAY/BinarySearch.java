package ARRAY;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int numbers[] = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        ;

        System.out.println("The array elements are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        ;

        System.out.println("Enter the value to be found: ");
        int key = sc.nextInt();

        int result = binarySearch(numbers, key);
        System.out.println("Key is at index: " + result);
    };
};|
 
