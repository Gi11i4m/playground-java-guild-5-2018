# What's so good about Streams?
If you haven't noticed how much more readable and declarative they are, you might have bonked the exercises.
Still, there's another great advantage in using Streams: abstract parallelism.
An article from [DZone](https://dzone.com/articles/understanding-java-8-streams-1) explains a bit more. 
Here's a summary.

# Understanding the Java 8 Streams API
Since past few versions, Java has started giving importance to concurrency. 
Java 8 goes one step further with the Streams API which abstracts parallelism and lets us leverage new hardware capabilities.
Parallel processing is about dividing a larger task into smaller sub tasks (forking), processing the sub tasks in parallel and combining the results together to get the final output (joining). The Streams concept is based on converting Collections to a Stream, processing the elements in parallel and then gathering the resulting elements into a Collection.

## Collections vs Streams
Collections are in-memory data structures which hold elements within it. 
Each element in the collection is computed before it actually becomes a part of that collection. 
On the other hand Streams are fixed **data structures which computes the elements on-demand basis**.

The Java 8 Streams can be seen as **lazily constructed Collections**, where the values are computed when user demands for it. 
Actual Collections behave absolutely opposite to it and they are set of eagerly computed values (no matter if the user demands for a particular value or not).

## Deeper Look at Streams
The Stream interface is defined in *java.util.stream* package.
Starting from Java 8, the java collections will start having methods that return Stream.
Stream keeps the order of the data as it is in the source.
Just like functional programming languages, Streams support Aggregate Operations. 
The common aggregate operations are filter, map, reduce, find, match, sort. 
These operations can be executed in series or in parallel.

The Streams also support Pipelining and Internal Iterations. 
The Java 8 Streams are designed in such a way that most of its stream operations returns Streams only. 
This help us creating chain of various stream operations. 
This is known as **pipelining**, which looks a bit similar to a SQL query.

In Java, we traditionally use for loops or iterators to iterate through the collections. 
These external iterations are clearly visible in the code.
Java 8 Stream operations has methods like foreach, map, filter, etc. which internally iterates through the elements,
the code is completely unaware of the iteration logic in the background.

````java
List<String> names = newArrayList<>();
for(Student student : students){
    if(student.getName().startsWith("A")){
      names.add(student.getName());
    }
}
````

There is nothing special about this code. This is a traditional Java external iterations example. 
Now, have a look at the below code. This line is doing exactly the same thing but we can't see any iteration logic.

````java
List<string> names = students.stream()
  .map(Student::getName)
  .filter(name -> name.startsWith("A"))
  .collect(toList());
````