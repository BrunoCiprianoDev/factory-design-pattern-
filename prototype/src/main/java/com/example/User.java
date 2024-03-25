package com.example;

public class User implements Cloneable {

  private String email;
  private String password;
  private Role role;

  public User(String email, String password, Role role) {
    this.email = email;
    this.password = password;
    this.role = role;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public User clone() throws CloneNotSupportedException {
    User user = (User) super.clone();
    user.role = (Role) user.getRole().clone();
    return user;
  }

}
