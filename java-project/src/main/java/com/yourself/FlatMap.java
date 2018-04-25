// { autofold
package com.yourself;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatMap {
// }

public static List<String> transform(List<List<String>> collection) {
	List<String> newCollection = new ArrayList<>();
	for (List<String> subCollection : collection) {
		for (String value : subCollection) {
			newCollection.add(value);
		}
	}
	return newCollection;
}

//{ autofold
}
//}