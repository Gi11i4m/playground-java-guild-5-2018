# Practice
Now that we know how to use Streams, let's try another exercise and get to know some more operators
 * [filter](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#filter-java.util.function.Predicate-)
 * [mapToInt](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#mapToInt-java.util.function.ToIntFunction-) → this will return an IntStream, which has some different operators from the default Stream
 * [sum](https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html#sum--)

@[Now, starting again from a list of names, give me the total number of letters in all the names with more than 5 letters]({
    "stubs": ["src/main/java/streams/LetterCount.java", "src/test/java/streams/LetterCountTest.java"],
    "command": "com.yourself.LetterCountTest#test"
})