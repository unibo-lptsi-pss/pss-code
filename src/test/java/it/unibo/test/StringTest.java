package it.unibo.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test public void checkContainsWithSubstring() {
      String s = "hello world";
      String substring = "world";
      boolean contained = s.contains(substring);
      Assertions.assertTrue(contained);
    }
  
  @Test public void checkContainsWithNoSubstring() {
      String s = "hello world";
      String notSubstring = "bar";
      boolean contained = s.contains(notSubstring);
      Assertions.assertFalse(contained);
    }
  }