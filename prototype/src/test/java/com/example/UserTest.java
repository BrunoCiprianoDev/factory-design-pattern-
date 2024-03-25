package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.example.RoleTest.NAME;
import static com.example.RoleTest.DESCRIPTION;
import static com.example.RoleTest.NEW_NAME;
import static com.example.RoleTest.NEW_DESCRIPTION;

public class UserTest {

  public static String EMAIL = "email@email.com";
  public static String PASSWORD = "p@ssw0rd";
  public static String EMAIL_UPDATED = "emailUPDATED@email.com";
  public static String PASSWORD_UPDATED = "UPDATED_PASS";

  public static User userInstance;

  @BeforeAll
  public static void init() {
    userInstance = new User(EMAIL, PASSWORD, new Role(NAME, DESCRIPTION));
  }

  @Test
  void testClone() throws CloneNotSupportedException {
    User userCloned = userInstance.clone();
    assertNotSame(userCloned, userInstance);
  }

  @Test
  void testGetEmail() throws CloneNotSupportedException {
    User userCloned = userInstance.clone();
    userCloned.setEmail(EMAIL_UPDATED);
    assertEquals(userCloned.getEmail(), EMAIL_UPDATED);
    assertEquals(userInstance.getEmail(), EMAIL);
  }

  @Test
  void testGetPassword() throws CloneNotSupportedException {
    User userCloned = userInstance.clone();
    userCloned.setPassword(PASSWORD_UPDATED);
    assertEquals(userCloned.getPassword(), PASSWORD_UPDATED);
    assertEquals(userInstance.getPassword(), PASSWORD);
  }

  @Test
  void testGetRole() throws CloneNotSupportedException {
    User userCloned = userInstance.clone();
    Role role = new Role(NEW_NAME, NEW_DESCRIPTION);
    userCloned.setRole(role);
    assertNotSame(userCloned.getRole(), userInstance.getRole());
    assertEquals(userCloned.getRole(), role);
  }

}
