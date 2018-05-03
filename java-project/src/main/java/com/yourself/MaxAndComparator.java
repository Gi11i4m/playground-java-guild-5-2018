// { autofold
package com.yourself;

import java.util.*;

public class MaxAndComparator {
// }

	public static Person getOldestPerson(List<Person> people) {
		Person oldestPerson = new Person("", 0);
		for (Person person : people) {
			if (person.getAge() > oldestPerson.getAge()) {
				oldestPerson = person;
			}
		}
		return oldestPerson;
	}

// { autofold
}
// }
