package com.pattern.go.utils;

import com.pattern.go.algorithm.A_01_LinearSearch;
import com.pattern.go.datastructure.D_03_Array;

public class Benchmark {

  private Benchmark() {
  }

  public static void main(String[] args) {

    final String mode = "array";

    switch (mode) {
    case "linearSearch":
      linearSearchTest();
      break;
    case "selectionSort":
      selectionSortTest();
      break;
    case "array":
      arrayTest();
      break;
    default:
      break;
    }
  }

  public static void linearSearchTest() {

    int[] sizes = { 1000 * 1000, 10 * 1000 * 1000 };
    int iteration = 100;

    for (int size : sizes) {
      Integer[] array = ArrayGenerator.generateOrderedArray(size);

      long startTime = System.nanoTime();
      for (int i = 0; i < iteration; i++) {
        A_01_LinearSearch.search(array, size);
      }
      long endTime = System.nanoTime();

      double time = (endTime - startTime) / (1000 * 1000 * 1000 * 1.0);
      System.out.println("size = " + size + ", " + iteration + " runs : " + time + "s");
    }
  }

  public static void selectionSortTest() {

    int[] sizes = { 10000, 100000 };
    int bound = 10000;

    for (int size : sizes) {
      Integer[] array = ArrayGenerator.generateRandomArray(size, bound);
      SortingHelper.sortTest("SelectionSort", array);
    }
  }

  public static void arrayTest() {

    D_03_Array array = new D_03_Array(20);

    for (int i = 0; i < 10; i++) {
      array.addLast(i);
    }
    System.out.println(array);

    array.add(1, 100);
    System.out.println(array);

    array.addFirst(-1);
    System.out.println(array);

    array.remove(2);
    System.out.println(array);

    array.removeElement(4);
    System.out.println(array);

    array.removeFirst();
    System.out.println(array);
  }
}
