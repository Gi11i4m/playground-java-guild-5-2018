# Micro kata's
Here are a few micro kata's for you to solve, let's get to know some more possibilities of Streams! [(source & solutions)](https://technologyconversations.com/2014/11/04/java-8-streams-micro-katas/)

Remember, you can find the documentation on Streams [right here](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html).

@[Flatten this multidimensional collection]({
    "stubs": ["src/main/java/com/yourself/FlatMap.java"], 
    "command": "com.yourself.FlatMapTest#transformShouldFlattenCollection"
})

@[Get the oldest person from the collection]({
    "stubs": ["src/main/java/com/yourself/MaxAndComparator.java"], 
    "command": "com.yourself.MaxAndComparatorTest#getOldestPersonShouldReturnOldestPerson"
})

@[Sum all elements of a collection, but this time, try to use the reduce function with the identity parameter instead of an IntStream]({
    "stubs": ["src/main/java/com/yourself/MaxAndComparator.java"], 
    "command": "com.yourself.SumAndReduceTest#transformShouldConvertCollectionElementsToUpperCase"
})