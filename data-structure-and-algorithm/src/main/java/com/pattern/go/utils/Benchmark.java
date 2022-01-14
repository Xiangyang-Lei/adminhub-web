package com.pattern.go.utils;

import com.pattern.go.algorithm.A_01_LinearSearch;

public class Benchmark {

  private Benchmark() {
  }

  public static void main(String[] args) {

    // linearSearchTest();
    selectionSortTest();
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
}
