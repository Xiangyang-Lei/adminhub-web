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

    size++;
  }

  /**
   * 获取index索引位置的元素
   * 
   * @param index
   * @return
   */
  public int get(int index) {

    if (index < 0 || index >= size) {
      throw new IllegalArgumentException("Get failed. Index is illegal.");
    }

    return data[index];
  }

  /**
   * 修改index索引位置的元素为element
   * 
   * @param index
   * @param element
   */
  public void set(int index, int element) {

    if (index < 0 || index >= size) {
      throw new IllegalArgumentException("Set failed. Index is illegal.");
    }

    data[index] = element;
  }

  /**
   * 查找数组中是否有元素element
   * 
   * @param element
   * @return
   */
  public boolean contains(int element) {

    for (int i = 0; i < size; i++) {
      if (data[i] == element) {
        return true;
      }
    }

    return false;
  }

  /**
   * 查找数组中元素element所在的索引，如果不存在元素element，则返回-1
   * 
   * @param element
   * @return
   */
  public int find(int element) {

    for (int i = 0; i < size; i++) {
      if (data[i] == element) {
        return i;
      }
    }

    return -1;
  }

  /**
   * 从数组中删除第一个元素, 返回删除的元素
   * 
   * @return
   */
  public int removeFirst() {

    return remove(0);
  }

  /**
   * 从数组中删除最后一个元素, 返回删除的元素
   * 
   * @return
   */
  public int removeLast() {

    return remove(size - 1);
  }

  /**
   * 从数组中删除index位置的元素，返回删除的元素
   * 
   * @param index
   * @return
   */
  public int remove(int index) {

    if (index < 0 || index >= size) {
      throw new IllegalArgumentException("Remove failed. Index is illegal.");
    }

    int result = data[index];
    for (int i = index; i < size - 1; i++) {
      data[i] = data[i + 1];
    }

    size--;

    return result;
  }

  /**
   * 从数组中删除元素element
   * 
   * @param element
   */
  public void removeElement(int element) {

    int index = find(element);

    if (index != -1) {
      remove(index);
    }
  }

  @Override
  public String toString() {

    StringBuilder result = new StringBuilder();

    result.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
    result.append('[');
    for (int i = 0; i < size; i++) {
      result.append(data[i]);
      if (i != size - 1)
        result.append(", ");
    }
    result.append(']');

    return result.toString();
  }
}
