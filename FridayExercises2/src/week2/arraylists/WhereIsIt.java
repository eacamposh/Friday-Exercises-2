package week2.arraylists;

/**
 * @author Eduardo Campos
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ArrayList - Where Is It?: Create an ArrayList that can hold Integers, and fill each slot with a
 * different random value from 1-50. Display those values on the screen, and then prompt the user
 * for an integer. Search through the ArrayList, and if the item is present, give the slot number
 * where it is located. If the value is not in the ArrayList, display a single message saying so. If
 * the value is present more than once, you may either display the message as many times as
 * necessary, or display a single message giving the last slot number in which it appeared.
 */
public class WhereIsIt {

  public static void main(String[] args) {
    ArrayList<Integer> myArrayList = new ArrayList<Integer>(10);
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int numberFind = 0;
    int slot = 0;
    for (int i = 0; i < 10; i++) {
      myArrayList.add(random.nextInt(50));
    }
    System.out.println("ArrayList: " + myArrayList);
    System.out.println("Value to find ");
    numberFind = in.nextInt();
    for (int i = 0; i < myArrayList.size(); i++) {
      slot = i;
    }
    if (myArrayList.contains(numberFind)) {
      System.out.println(numberFind + " is in slot " + slot);
    }
  }

}
