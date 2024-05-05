package cp_16_22;

import java.util.Scanner;

public class SortAnArray {

   /* Define your method here */
   public static void sortArray(int[] myArr) {
      for (int i = 0; i < myArr.length; i++) {
         for (int j = 0; j < myArr.length - 1; j++) {
            if (myArr[j] > myArr[j + 1]) {
               int temp = myArr[j];
               myArr[j] = myArr[j + 1];
               myArr[j + 1] = temp;
            }
         }
      }
   }

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
