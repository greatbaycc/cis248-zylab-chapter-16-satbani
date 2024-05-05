package cp_16_22;

import java.util.Scanner;

public class SortAnArray {

   /* Define your method here */

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int[] userNums = new int[scanner.nextInt()];


      for (int i = 0; i < userNums.length; ++i) {
         userNums[i] = scanner.nextInt();
      }
   
      sortArray(userNums);
   
      for (int i = 0; i < userNums.length; ++i) {
         System.out.print(userNums[i] + " ");
      }
   }
}
