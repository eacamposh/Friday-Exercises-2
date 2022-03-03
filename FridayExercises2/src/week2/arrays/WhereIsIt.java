package week2.arrays;

/**
 * @author Eduardo Campos
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Where Is It?: Create an array that can hold ten integers, and fill each slot with a different
 * random value from 1-50. Display those values on the screen, and then prompt the user for an
 * integer. Search through the array, and if the item is present, give the slot number where it is
 * located. If the value is not in the array, display a single message saying so. If the value is
 * present more than once, you may either display the message as many times as necessary, or display
 * a single message giving the last slot number in which it appeared.
 */

public class WhereIsIt {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int[] array = new int[10];
    int numberFind = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(50);
    }
    System.out.print("Array: " + Arrays.toString(array) + "\t");
    System.out.println("\nValue to find: ");
    numberFind = in.nextInt();
    if (!array.equals(numberFind)) {
      System.out.println(numberFind + " is not in the array");
    } else {
      for (int i = 0; i < array.length; i++) {
        if (array[i] == numberFind) {
          System.out.println(numberFind + " is in the slot: " + i);
        }
      }
    }
  }
}


