package com.yourself;

import org.junit.Test;

import static com.yourself.UpperCase.mapToUppercase;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertTrue;

public class UpperCaseTest {

	@Test
	public void test() {
		System.out.println("Testing if [aaron, frank, william, gilliam] returns [AARON, FRANK, WILLIAM, GILLIAM]");
    assertTrue(mapToUppercase("aaron", "frank", "william", "gilliam")
      .containsAll(asList("AARON", "FRANK", "WILLIAM", "GILLIAM")));

		System.out.println("Testing if [cegeka] returns [CEGEKA]");
		assertTrue(mapToUppercase("cegeka")
      .containsAll(singletonList("CEGEKA")));
	}
}