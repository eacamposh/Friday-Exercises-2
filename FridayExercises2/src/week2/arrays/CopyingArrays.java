package week2.arrays;

/**
 * @author Eduardo Campos
 */

import java.util.Arrays;
import java.util.Random;

/**
 * Copying Arrays: Write a program that creates an array of ten integers. It should put ten random
 * numbers from 1 to 100 in the array. It should copy all the elements of that array into another
 * array of the same size. Then display the contents of both arrays. To get the output to look like
 * mine, you'll need a several for loops.
 */

public class CopyingArrays {

  public static void main(String[] args) {
    Random random = new Random();
    int[] array1 = new int[10];
    int[] array2 = new int[10];
    for (int i = 0; i < array1.length; i++) {
      array1[i] = random.nextInt(100);
      array2[i] = array1[i];
    }
    array1[9] = -7;
    System.out.println("Array 1: " + Arrays.toString(array1));
    System.out.println("Array 2: " + Arrays.toString(array2));
  }
}
