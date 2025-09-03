package ARRAY;

public class SubArray {
      
    public static void printSubArray(int numbers[]) {
        int ts = 0 ;
        int sum = 0;
        int total_sum = 0;
        for(int i=0; i < numbers.length; i++) {
               int start = i;
            for (int j = i ; j<numbers.length; j++) {
                int end = j;
                sum = 0;
              for(int k = start ; k <= end ; k++){
                System.out.print(numbers[k] + " ");
                sum += numbers[k];
                total_sum += numbers[k];
              }
              ts++;
              System.out.println();
              System.out.println("Sum is: " + sum);
              System.out.println();
              
        }
        System.out.println();
       
     }
      System.out.println("Total subarrays: " + ts);
      System.out.println("Total sum of all subarrays: " + total_sum);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArray(numbers);

    }

}
