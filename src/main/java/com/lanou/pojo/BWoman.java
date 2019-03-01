package com.lanou.pojo;


public class BWoman {

  private long id;
  private String name;
  private long age;
  private BMan bMan;


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


  public BMan getbMan() {
    return bMan;
  }

  public void setbMan(BMan bMan) {
    this.bMan = bMan;
  }

  @Override
  public String toString() {
    return "BWoman{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", bMan=" + bMan +
            '}';
  }
}
