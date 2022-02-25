package com.pattern.go.datastructure;

public class D_04_ArrayStack<E> implements D_04_Stack<E> {

  private D_03_Array<E> array;

  public D_04_ArrayStack(int capacity) {

    array = new D_03_Array<E>(capacity);
  }

  public D_04_ArrayStack() {

    array = new D_03_Array<E>();
  }

  public int getCapacity() {

    return array.getCapacity();
  }

  @Override
  public int getSize() {

    return array.getSize();
  }

  @Override
  public boolean isEmpty() {

    return array.isEmpty();
  }

  @Override
  public void push(E element) {

    array.addLast(element);
  }

  @Override
  public E pop() {

    return array.removeLast();
  }

  @Override
  public E peek() {

    return array.getLast();
  }

  @Override
  public String toString() {

    StringBuilder result = new StringBuilder();

    result.append("Stack: ");
    result.append('[');
    for (int i = 0; i < array.getSize(); i++) {
      result.append(array.get(i));
      if (i != array.getSize() - 1) {
        result.append(", ");
      }
    }
    result.append("] top");

    return result.toString();
  }
}
