package com.yourself;

import org.junit.Test;

import java.util.*;

import static com.yourself.GroupBy.groupByNationality;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class GroupByTest {

  @Test
  public void groupByNationalityTest() {
    Person sara = new Person("Sara", 4, "Norwegian");
    Person viktor = new Person("Viktor", 40, "Serbian");
    Person eva = new Person("Eva", 42, "Norwegian");
    List<Person> collection = asList(sara, eva, viktor);
    Map<String, List<Person>> result = groupByNationality(collection);
    assertThat(result.get("Norwegian")).hasSameElementsAs(asList(sara, eva));
    assertThat(result.get("Serbian")).hasSameElementsAs(asList(viktor));
  }
}