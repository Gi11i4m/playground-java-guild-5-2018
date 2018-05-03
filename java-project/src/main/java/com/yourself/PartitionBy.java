// { autofold
package com.yourself;

import java.util.*;

import static java.util.stream.Collectors.*;

public class PartitionBy {
// }

	public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
		Map<Boolean, List<Person>> map = new HashMap<>();
		map.put(true, new ArrayList<>());
		map.put(false, new ArrayList<>());
		for (Person person : people) {
			map.get(person.getAge() >= 18).add(person);
		}
		return map;
	}

// { autofold
}
// }
