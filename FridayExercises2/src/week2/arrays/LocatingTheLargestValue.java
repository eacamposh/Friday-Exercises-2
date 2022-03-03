package week2.arrays;

/**
 * @author Eduardo Campos
 */

import java.util.Arrays;
import java.util.Random;

/**
 * Locating the Largest Value in an Array: Write a program that creates an array which can hold ten
 * values. Fill the array with random numbers from 1 to 100. Display the values in the array on the
 * screen. Then use a linear search to find the largest value in the array, and display that value
 * and its slot number.
 */

public class LocatingTheLargestValue {

  public static void main(String[] args) {
    Random random = new Random();
    int[] array = new int[10];
    int largest = 0;
    int slot = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(100);
    }
    System.out.println("Array: " + Arrays.toString(array));
    for (int i = 0; i < array.length; i++) {
      if (array[i] > largest) {
        largest = array[i];
        slot = i;
      }
    }
    System.out.println("The largest value is " + largest);
    System.out.println("It is in slot " + slot);
  }
}


