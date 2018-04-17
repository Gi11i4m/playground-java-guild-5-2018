# Streams
Kids, today we're going to learn about streams. The code below doesn't use them. As you can see it's utter crap. There's a garbage list with an annoying name and an ugly old for-loop. The list isn't immutable so you return your garbage list at the end and EVERYTHING SUCKS.

You can easily fix this using the Streams map operator. Check [this page](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html) for docs. Don't forget to .collect() the results at the end!

@[Rewrite this garbage using Streams and make sure the test still runs!]({"stubs": ["src/main/java/com/yourself/UpperCase.java"], "command": "com.yourself.UpperCaseTest#test"})