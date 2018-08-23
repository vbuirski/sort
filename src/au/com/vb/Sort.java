package au.com.vb;

import java.util.Arrays;

public class Sort {


  public int sortThree(int a, int b, int c) {

    int[] numbers = {a, b, c};
    Arrays.sort(numbers);
    int length = numbers.length;
    return numbers[length-1];

  }

  public static void main(String[] args) {
    Sort mySorting = new Sort();

    int max = mySorting.sortThree(3, 6, 4);
    System.out.println("Max = " + max);

  }

}
