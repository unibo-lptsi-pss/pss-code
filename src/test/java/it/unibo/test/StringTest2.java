package it.unibo.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringTest2 {
    @BeforeAll public static void beforeAll(){ System.out.println("Before all."); }
    @AfterAll public static void afterAll(){ System.out.println("After all."); }
    @BeforeEach public void beforeEach(){ System.out.println("Before each."); }
    @AfterEach public void afterEach(){ System.out.println("After each."); }

    @Test public void checkContains(){
      System.out.println("checkContains");
      String s = "hello world";
      Assertions.assertTrue(s.contains("hello") && !s.contains("bar"));
    } // questo metodo di test copre due test case

    @ParameterizedTest @ValueSource(strings = {"hello", "world", " ", ""})
    public void checkContainsParameterized(String substr){
        System.out.println("checkContainsParameterized");
        String s = "hello world";
        Assertions.assertTrue(s.contains(substr));
    }
}