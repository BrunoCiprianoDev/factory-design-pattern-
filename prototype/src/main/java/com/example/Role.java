package com.example;

public class Role implements Cloneable {

  private String name;
  private String description;

  public Role(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public Role clone() throws CloneNotSupportedException {
    return (Role) super.clone();
  }

}
