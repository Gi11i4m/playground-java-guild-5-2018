// { autofold
package streams;

import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

public class ChallengeTest {
// }

  @Test
  public void getStringShouldOutputEvenUnevenString() {
    assertThat(Challenge.getString(asList(3,44))).isEqualTo("o3,e44");
    assertThat(Challenge.getString(singletonList(3))).isEqualTo("o3");
  }

// { autofold
}
// }