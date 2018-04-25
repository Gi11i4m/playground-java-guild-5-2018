package com.yourself;

import org.junit.Test;

import static com.yourself.UpperCase.mapToUppercase;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

public class UpperCaseTest {

	@Test
	public void test() {
		System.out.println("Testing if [jones, aaron, seppe, frank, gilliam] returns [JONES, AARON, SEPPE, FRANK, GILLIAM]");
	  assertTrue(mapToUppercase("jones", "aaron", "seppe", "frank", "gilliam")
          .containsAll(asList("JONES", "AARON", "SEPPE", "FRANK", "GILLIAM")));
	}
}