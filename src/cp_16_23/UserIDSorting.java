package cp_16_23;

import java.util.Scanner;
import java.util.ArrayList;

public class UserIDSorting {
   // TODO: Write the partitioning algorithm - pick the middle element as the 
   //       pivot, compare the values using two index variables l and h (low and high), 
   //       initialized to the left and right sides of the current elements being sorted,
   //       and determine if a swap is necessary
   public static int partition(ArrayList<String> userIDs, int i, int k) {
   
   }

   // TODO: Write the quicksort algorithm that recursively sorts the low and 
   //       high partitions
   public static void quicksort(ArrayList<String> userIDs, int i, int k) {
    
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ArrayList<String> userIDList = new ArrayList<String>();
      String userID = scanner.next();
      
      while (!userID.equals("-1")) {
         userIDList.add(userID);
         userID = scanner.next();
      }
      
      // Initial call to quicksort 
      quicksort(userIDList, 0, userIDList.size() - 1);

      for (int i = 0; i < userIDList.size(); ++i) {
         System.out.println(userIDList.get(i));
      }
   }
}

