package com.pattern.go.datastructure.sub05;

public interface Queue<E> {

  int getSize();

  boolean isEmpty();

  void enqueue(E element);

  E dequeue();

  E getFront();
}
