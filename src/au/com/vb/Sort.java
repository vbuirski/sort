package au.com.vb;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sort {

  // A simple sort of three
  public int sortThree(int a, int b, int c) {

    int[] numbers = {a, b, c};
    Arrays.sort(numbers);
    int length = numbers.length;
    return numbers[length-1];
  }

  public int sortIntsAndArrays(int a, int b, int c, int[] d) {

    int[] numbers = {a, b, c};
    //join 2 primitive type array
    int[] result2 = IntStream.concat(Arrays.stream(numbers), Arrays.stream(d)).toArray();
    Arrays.sort(result2);
    return result2[result2.length-1];
  }

  public static void main(String[] args) {
    Sort mySorting = new Sort();

    int max = mySorting.sortThree(3, 6, 4);
    System.out.println("Max1 = " + max);

    max = mySorting.sortIntsAndArrays(3, 6, 4, new int[]{5, 13, 8});
    System.out.println("Max2 = " + max);

  }

}
