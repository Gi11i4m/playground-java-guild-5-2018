// { autofold
package com.yourself;

import java.util.*;

import static java.util.stream.Collectors.*;

public class Joining {
// }

	public static String namesToString(List<Person> people) {
		String label = "Names: ";
		StringBuilder sb = new StringBuilder(label);
		for (Person person : people) {
			if (sb.length() > label.length()) {
				sb.append(", ");
			}
			sb.append(person.getName());
		}
		sb.append(".");
		return sb.toString();
	}

// { autofold
}
// }
