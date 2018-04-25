// { autofold
package com.yourself;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.*;

public class LetterCount {
// }

public static Collection<String> mapToUppercase(String... names) {
	Collection<String> uppercaseNames = new ArrayList<>();
	for(String name : names) {
		uppercaseNames.add(name.toUpperCase());
	} 
	return uppercaseNames;
}

//{ autofold
}
//}