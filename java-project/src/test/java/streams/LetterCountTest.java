// { autofold
package streams;

import org.junit.Test;

import static streams.LetterCount.getTotalNumberOfLettersOfNamesLongerThanFive;
import static org.junit.Assert.*;

public class LetterCountTest {
// }

  @Test
  public void test() {
    System.out.println("Testing if [william, jones, aaron, seppe, frank, gilliam] returns 14");
    assertEquals(getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam"), 14);

    System.out.println("Testing if [aaron] returns 0");
    assertEquals(getTotalNumberOfLettersOfNamesLongerThanFive("aaron"), 0);
  }

// { autofold
}
// }