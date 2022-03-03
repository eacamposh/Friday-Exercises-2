package week2.arraylists;

/**
 * @author Edurdo Campos
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Getting the Largest Value in an ArrayList: Write a program that creates an ArrayList which can
 * hold Integers. Fill the ArrayList with random numbers from 1 to 100. Display the values in the
 * ArrayList on the screen. Then use a linear search to find the largest value in the ArrayList, and
 * display that value
 */
public class GettingTheLargestValue {

  public static void main(String[] args) {
    ArrayList<Integer> myArrayList = new ArrayList<Integer>(10);
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int numberFind = 0;
    int largest = 0;
    for (int i = 0; i < 10; i++) {
      myArrayList.add(random.nextInt(100));
    }
    System.out.println("ArrayList: " + myArrayList);
    for (int i = 0; i < myArrayList.size(); i++) {
      if (myArrayList.get(i) > largest) {
        largest = myArrayList.get(i);
      }
    }
    System.out.println("The largest value is " + largest);
  }
}


