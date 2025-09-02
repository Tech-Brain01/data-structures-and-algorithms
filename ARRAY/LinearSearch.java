import java.util.*;

public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int numbers[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        ;

        System.out.println("The array elements are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        ;

        System.out.println("Enter the key : ");
        int key = sc.nextInt();
        System.out.println("The keys is : " + key);

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("NOT FOUND!!");
        } else {
            System.out.println("key is at index:" + index);
        }
    }
}
