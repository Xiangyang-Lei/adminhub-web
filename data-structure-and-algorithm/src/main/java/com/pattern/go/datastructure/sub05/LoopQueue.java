package com.pattern.go.datastructure.sub05;

public class LoopQueue<E> implements Queue<E> {

  private E[] data;
  private int front, tail;
  private int size;

  @SuppressWarnings("unchecked")
  public LoopQueue(int capacity) {

    data = (E[]) new Object[capacity + 1];
    front = 0;
    tail = 0;
    size = 0;
  }

  public LoopQueue() {

    this(10);
  }

  public int getCapacity() {

    return data.length - 1;
  }

  @Override
  public int getSize() {

    return size;
  }

  @Override
  public boolean isEmpty() {

    return front == tail;
  }

  @Override
  public void enqueue(E element) {

  }

  @Override
  public E dequeue() {

    return null;
  }

  @Override
  public E getFront() {

    return null;
  }
}
