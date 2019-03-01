package com.lanou.pojo;


import java.util.List;

public class BMan {

  private long id;
  private String name;
  private long age;
  private List<BWoman> womenlist;


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

  public List<BWoman> getWomenlist() {
    return womenlist;
  }

  public void setWomenlist(List<BWoman> womenlist) {
    this.womenlist = womenlist;
  }

  @Override
  public String toString() {
    return "BMan{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", womenlist=" + womenlist +
            '}';
  }
}
