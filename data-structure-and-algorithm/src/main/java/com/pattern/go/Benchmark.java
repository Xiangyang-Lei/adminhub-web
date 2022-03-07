package com.pattern.go;

import com.pattern.go.datastructure.sub02.ComparableStudent;
import com.pattern.go.datastructure.sub03.Array;
import com.pattern.go.datastructure.sub04.ArrayStack;
import com.pattern.go.algorithm.sub01.LinearSearch;
import com.pattern.go.utils.ArrayGenerator;
import com.pattern.go.utils.SortingHelper;

public class Benchmark {

  private Benchmark() {
  }

  public static void main(String[] args) {

    String mode = "Stack";

    switch (mode) {
    /**
     * Data Structure Test
     */
    case "Array":
      arrayTest();
      break;
    case "Stack":
      stackTest();
      break;
    /**
     * Algorithm Test
     */
    case "LinearSearch":
      linearSearchTest();
      break;
    case "SelectionSort":
      selectionSortTest();
      break;
    default:
      break;
    }
  }

  public static void arrayTest() {

    Array<Integer> array = new Array<Integer>();

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

    Array<ComparableStudent> studentArray = new Array<ComparableStudent>();

    studentArray.addLast(new ComparableStudent(1, "Alice", 100));
    studentArray.addLast(new ComparableStudent(2, "Bob", 66));
    studentArray.addLast(new ComparableStudent(3, "Charlie", 88));
    System.out.println(studentArray);
  }

  public static void stackTest() {

    ArrayStack<Integer> stack = new ArrayStack<>();

    for (int i = 0; i < 5; i++) {
      stack.push(i);
      System.out.println(stack);
    }

    stack.pop();
    System.out.println(stack);
  }

  public static void linearSearchTest() {

    int[] sizes = { 1000 * 1000, 10 * 1000 * 1000 };
    int iteration = 100;

    for (int size : sizes) {
      Integer[] array = ArrayGenerator.generateOrderedArray(size);

      long startTime = System.nanoTime();
      for (int i = 0; i < iteration; i++) {
        LinearSearch.search(array, size);
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
