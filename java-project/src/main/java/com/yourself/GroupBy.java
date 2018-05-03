// { autofold
package com.yourself;

import java.util.*;

import static java.util.stream.Collectors.*;

public class GroupBy {
// }

	public static Map<String, List<Person>> groupByNationality(List<Person> people) {
		Map<String, List<Person>> map = new HashMap<>();
		for (Person person : people) {
			if (!map.containsKey(person.getNationality())) {
				map.put(person.getNationality(), new ArrayList<>());
			}
			map.get(person.getNationality()).add(person);
		}
		return map;
	}

// { autofold
}
// }
