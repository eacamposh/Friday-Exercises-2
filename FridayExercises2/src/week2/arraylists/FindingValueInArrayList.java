package week2.arraylists;

/**
 * @author Eduardo Campos
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Finding a Value in an ArrayList: Create an ArrayList that can hold Integers, and fill each slot
 * with a different random value from 1-50. Display those values on the screen, and then prompt the
 * user for an integer. Search through the ArrayList, and if the item is present, say so. It is not
 * necessary to display anything if the value was not found. If the item is in the ArrayList
 * multiple times, it's okay if the program prints the message more than once.
 */
public class FindingValueInArrayList {

  public static void main(String[] args) {

    ArrayList<Integer> myArrayList = new ArrayList<Integer>(10);
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int numberFind = 0;
    for (int i = 0; i < 10; i++) {
      myArrayList.add(random.nextInt(50));
    }
    System.out.println("ArrayList: " + myArrayList);
    System.out.println("Value to find ");
    numberFind = in.nextInt();
    if (myArrayList.contains(numberFind)) {
      System.out.println(numberFind + " is in the ArrayList");
    }

  }

}
