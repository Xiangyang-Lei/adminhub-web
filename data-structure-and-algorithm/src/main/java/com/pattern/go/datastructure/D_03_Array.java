package com.pattern.go.datastructure;

public class D_03_Array {

  private int[] data;
  private int size;

  /**
   * 构造函数，传入数组的容量capacity构造Array
   * 
   * @param capacity
   */
  public D_03_Array(int capacity) {

    data = new int[capacity];
    size = 0;
  }

  /**
   * 无参数的构造函数，默认数组的容量capacity=10
   */
  public D_03_Array() {

    this(10);
  }

  /**
   * 获取数组的容量
   * 
   * @return
   */
  public int getCapacity() {

    return data.length;
  }

  /**
   * 获取数组中的元素个数
   * 
   * @return
   */
  public int getSize() {

    return size;
  }

  /**
   * 返回数组是否为空
   * 
   * @return
   */
  public boolean isEmpty() {

    return size == 0;
  }

  /**
   * 在所有元素前添加一个新元素
   * 
   * @param element
   */
  public void addFirst(int element) {

    add(0, element);
  }

  /**
   * 向所有元素后添加一个新元素
   * 
   * @param element
   */
  public void addLast(int element) {

    add(size, element);
  }

  /**
   * 在index索引的位置插入一个新元素element
   * 
   * @param index
   * @param element
   */
  public void add(int index, int element) {

    if (size == data.length) {
      throw new IllegalArgumentException("Add failed. Array is full.");
    }

    if (index < 0 || index > size) {
      throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
    }

    for (int i = size - 1; i >= index; i--) {
      data[i + 1] = data[i];
    }

    data[index] = element;
  }
}
