package com.yourself;

import org.junit.Test;

import static com.yourself.LetterCount.getTotalNumberOfLettersOfNamesLongerThanFive;
import static org.junit.Assert.*;

public class LetterCountTest {

  @Test
  public void test() {
    System.out.println("Testing if [william, jones, aaron, seppe, frank, gilliam] returns 14");
    assertEquals(getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam"), 14);
  }
}