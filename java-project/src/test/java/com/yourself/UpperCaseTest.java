package com.yourself;

import org.junit.Assert;
import org.junit.Test;

import static java.util.Arrays.asList;

public class UpperCaseTest {

	@Test
	public void test() {
	  Assert.assertTrue("Testing if [jones, aaron, seppe, frank, gilliam] returns [JONES, AARON, SEPPE, FRANK, GILLIAM]",
      UpperCase.mapToUppercase("jones", "aaron", "seppe", "frank", "gilliam")
          .containsAll(asList("JONES", "AARON", "SEPPE", "FRANK", "GILLIAM")));
	}
}