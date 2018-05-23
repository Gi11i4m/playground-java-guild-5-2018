// { autofold
package streams;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.*;

import static java.util.Collections.singletonList;
import static streams.PartitionBy.partitionAdults;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class PartitionByTest {
// }

  @Test
  public void partitionAdultsShouldSeparateKidsFromAdults() {
    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    List<Person> collection = asList(sara, eva, viktor);
    Map<Boolean, List<Person>> result = partitionAdults(collection);
    assertThat(result.get(true)).hasSameElementsAs(asList(viktor, eva));
    assertThat(result.get(false)).hasSameElementsAs(singletonList(sara));
  }

// { autofold
}
// }