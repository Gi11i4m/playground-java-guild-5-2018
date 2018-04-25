package com.yourself;

import org.junit.Test;

import java.util.List;

import static com.yourself.FlatMap.transform;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FlatMapTest {

  @Test
  public void transformShouldFlattenCollection() {
    List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
    List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
    assertThat(transform(collection)).hasSameElementsAs(expected);
  }
}