                                                                    // BRUTE FORCE  

                                                                                                                               // T.C = O(N^3)
                                 // WORST 



// package ARRAY;

// public class MaxSumSubArray {
      
//      public static void SumSubArray(int numbers []){
//         int sum = 0;
//         int max_sum = Integer.MIN_VALUE;
//         for(int i = 0 ; i < numbers.length ; i++){
//               int start = i;
//             for(int j = i ; j < numbers.length ; j++){
//                   int end = j;
//                   sum = 0;
//                 for(int k = start ; k <= end ; k++){
//                     System.out.print(numbers[k] + "");
//                     sum += numbers[k];
//                 }
//                 System.out.println();
//                 System.out.print("sum: " + sum);
//                 System.out.println();
//                 if (max_sum <= sum) {
//                      max_sum = sum;
//                 }
//             }
           
//         }
//         System.out.println("max sum is: " + max_sum);
//      }

//     public static void main(String args[]) {
//         int numbers[] = {2,4,6,8,10};
//         SumSubArray(numbers);
//     }
// }






                                                             //  PRE-FIX SUM   

                                                                                               // T.C = o(n^2)  
            // optimized and faster then Brute Force 

  
// package ARRAY;

//  public class MaxSumSubArray {
    
//   public static void SumSubArray(int numbers[]){
//       int curr_sum = 0;
//       int max_sum = Integer.MIN_VALUE;
//       int prefix[] = new int[numbers.length];

//       prefix[0] = numbers[0];
//     //   calaculate the prefix array
//     for (int p = 1 ; p < prefix.length; p++) {
//          prefix[p] = prefix[p-1] + numbers[p];
//     }

//       for(int i = 0 ; i < numbers.length; i++){
//          int start = i;
//          for (int j = i ; j < numbers.length; j++) {
//             int end = j;
//             curr_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

//             if (max_sum < curr_sum) {
//                 max_sum = curr_sum;
//             }

//          }
//       }
//       System.out.print("Max Sum is :" + max_sum);
//   }

//   public static void main(String args[]) {
//     int numbers[] = {2, 4, 6, 8, 10};
//     SumSubArray(numbers);
//   }
//  }