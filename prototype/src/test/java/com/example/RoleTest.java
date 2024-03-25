package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RoleTest {

  public static String NAME = "NAME";
  public static String DESCRIPTION = "DESCRIPTION";
  public static String NEW_NAME = "NAME_UPDATED";
  public static String NEW_DESCRIPTION = "NEW_DESCRIPTION";

  public static Role roleInstance;

  @BeforeAll
  public static void init() {
    roleInstance = new Role(NAME, DESCRIPTION);
  }

  @Test
  void testClone() throws CloneNotSupportedException {
    Role roleCloned = roleInstance.clone();
    assertNotSame(roleCloned, roleInstance);
  }

  @Test
  void testGetName() throws CloneNotSupportedException {
    Role roleCloned = roleInstance.clone();
    roleCloned.setName(NEW_NAME);
    assertEquals(roleCloned.getName(), NEW_NAME);
    assertEquals(roleInstance.getName(), NAME);
  }

  @Test
  void testGetDescription() throws CloneNotSupportedException {
    Role roleCloned = roleInstance.clone();
    roleCloned.setDescription(NEW_DESCRIPTION);
    assertEquals(roleCloned.getDescription(), NEW_DESCRIPTION);
    assertEquals(roleInstance.getDescription(), DESCRIPTION);
  }

}
