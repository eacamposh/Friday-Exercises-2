package week2.arrays;

/**
 * @author Eduardo Campos
 */

import java.util.Random;

/**
 * Basic Arrays 2: Create an array that can hold ten integers. Fill up each slot of the array with a
 * random number from 1 to 100. Then display the contents of the array on the screen. You must use a
 * loop. And, like last time, you must use the length field of your array and not a literal number
 * (like 10) in the condition of the loop.
 */

public class BasicArrays2 {

  public static void main(String[] args) {
    Random random = new Random();
    int[] slot = new int[10];
    for (int i = 0; i < slot.length; i++) {
      slot[i] = random.nextInt(100);
      System.out.println("Slot " + i + " contains a " + slot[i]);
    }

  }

}
