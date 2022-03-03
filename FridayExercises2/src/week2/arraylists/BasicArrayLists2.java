package week2.arraylists;

/**
 * @autor Eduardo Campos
 */

import java.util.ArrayList;
import java.util.Random;

/**
 * Basic ArrayLists 2: Create an ArrayList of Integers. Fill up the list with ten random numbers,
 * each from 1 to 100. Then display the contents of the ArrayList on the screen. You must use a loop
 * to fill up the list. However, you may display it the easy way (no loop needed) like so:
 */
public class BasicArrayLists2 {

  public static void main(String[] args) {

    ArrayList<Integer> myArrayList = new ArrayList<Integer>(10);
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      myArrayList.add(random.nextInt(100));
    }
    System.out.println("ArrayList: " + myArrayList);


  }

}
