package com.pattern.go.datastructure;

import java.util.Objects;

public class D_01_Student {

  private Integer id;
  private String name;
  private Integer gender;

  public D_01_Student(Integer id, String name, Integer gender) {
    super();
    this.id = id;
    this.name = name;
    this.gender = gender;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, gender);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    D_01_Student other = (D_01_Student) obj;
    return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(gender, other.gender);
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
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

  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }
}
