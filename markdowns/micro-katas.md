# Micro kata's
Here are a few micro kata's for you to solve, let's get to know some more possibilities of Streams! [(source & solutions)](https://technologyconversations.com/2014/11/04/java-8-streams-micro-katas/)

The kata's are written in old-style Java code. Re-write them into beautiful one-liners using Streams.

![alt text](http://www.firstmetvictoria.com/df_media/W1siZiIsIjIwMTcvMDMvMjgvMTEvNTgvNTIvZDk4NTliNWUtMDY3NS00MDliLTg0MTItMWEwOTQ1ZDAxNzcyL3N0cmVhbSBzb3VyY2UtMjE0NzUyOV9fMzQwLmpwZyJdLFsicCIsInByb2dyYW0iXV0/stream%20source-2147529__340.jpg?sha=fcc9438679cdf542 "Stream")

Remember, you can find the documentation on Streams [right here](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html).

@[Flatten this multidimensional collection]({
    "stubs": ["src/main/java/com/yourself/FlatMap.java"], 
    "command": "com.yourself.FlatMapTest#transformShouldFlattenCollection"
})

@[Get the oldest person from the collection]({
    "stubs": ["src/main/java/com/yourself/MaxAndComparator.java"], 
    "command": "com.yourself.MaxAndComparatorTest#getOldestPersonShouldReturnOldestPerson"
})

@[Sum all elements of a collection, try to use the reduce operator with identity parameter instead of an IntStream]({
    "stubs": ["src/main/java/com/yourself/SumAndReduce.java"], 
    "command": "com.yourself.SumAndReduceTest#transformShouldConvertCollectionElementsToUpperCase"
})

@[Get the names of all kids under the age of 18]({
    "stubs": ["src/main/java/com/yourself/UnderAge.java"], 
    "command": "com.yourself.UnderAgeTest#getKidNameShouldReturnNamesOfAllKidsUnder18"
})

Not very interesting as an exercise, but check out this [exercise](https://technologyconversations.com/2014/11/04/java-8-streams-micro-katas/#gist15618501) 
about how to easily generate numerical statistics from an IntStream.

@[Partition these people into adults and kids (adult age is higher or equal than 18), you'll need a special collector for this one]({
    "stubs": ["src/main/java/com/yourself/PartitionBy.java"], 
    "command": "com.yourself.PartitionByTest#partitionAdultsShouldSeparateKidsFromAdults"
})

@[Group these people by nationality, same kind as the previous exercise]({
    "stubs": ["src/main/java/com/yourself/GroupBy.java"], 
    "command": "com.yourself.GroupByTest#groupByNationalityTest"
})

@[Return a comma-separated string of all these people's names]({
    "stubs": ["src/main/java/com/yourself/Joining.java"], 
    "command": "com.yourself.JoiningTest#toStringShouldReturnPeopleNamesSeparatedByComma"
})