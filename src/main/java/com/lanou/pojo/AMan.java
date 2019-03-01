package com.lanou.pojo;


public class AMan {

  private long id;
  private String name;
  private long age;
  private AWoman Woman;

  public AWoman getWoman() {
    return Woman;
  }

  public void setWoman(AWoman woman) {
    Woman = woman;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "AMan{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
