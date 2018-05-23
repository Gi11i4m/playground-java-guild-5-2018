package streams;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.*;

import static streams.GroupBy.groupByNationality;
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
    Assertions.assertThat(result.get("Norwegian")).hasSameElementsAs(asList(sara, eva));
    Assertions.assertThat(result.get("Serbian")).hasSameElementsAs(asList(viktor));
  }
}