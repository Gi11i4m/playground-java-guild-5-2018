// { autofold
package streams;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FlatMapTest {
// }

  @Test
  public void transformShouldFlattenCollection() {
    List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
    List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
    assertThat(FlatMap.transform(collection)).hasSameElementsAs(expected);
  }

// { autofold
}
// }