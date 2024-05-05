package cp_16_21
//Reference: https://stackoverflow.com/questions/2920315/permutation-of-array

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhotoLineups {

   // TODO: Write method to create and output all permutations of the list of names.
   public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
   
   }

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        String name;

        do {
            name = scanner.next();
            if (!name.equals("-1")) {
                nameList.add(name);
            } else {
                name = null;
            }
        } while (!(name == null));

        allPermutations(nameList, 0);
   }
}
