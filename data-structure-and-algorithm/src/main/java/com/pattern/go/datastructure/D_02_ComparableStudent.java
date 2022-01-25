package com.pattern.go.datastructure;

import java.util.Objects;

public class D_02_ComparableStudent implements Comparable<D_02_ComparableStudent> {

  private Integer id;
  private String name;
  private Integer score;

  public D_02_ComparableStudent(Integer id, String name, Integer score) {

    this.id = id;
    this.name = name;
    this.score = score;
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, name, score);
  }

  @Override
  public boolean equals(Object object) {

    if (this == object) {
      return true;
    } else if (object == null || getClass() != object.getClass()) {
      return false;
    }

    D_02_ComparableStudent another = (D_02_ComparableStudent) object;

    return Objects.equals(id, another.id) && Objects.equals(name, another.name) && Objects.equals(score, another.score);
  }

  @Override
  public String toString() {

    return String.format("Student(id: %d, name: %s, score: %d)", id, name, score);
  }

  @Override
  public int compareTo(D_02_ComparableStudent another) {

    return this.score - another.score;
  }

  public Integer getId() {

    return id;
  }

  public void setId(Integer id) {

    this.id = id;
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public Integer getScore() {

    return score;
  }

  public void setScore(Integer score) {

    this.score = score;
  }
}
