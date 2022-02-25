package com.pattern.go.datastructure;

public interface D_04_Stack<E> {

  int getSize();

  boolean isEmpty();

  void push(E element);

  E pop();

  E peek();
}
