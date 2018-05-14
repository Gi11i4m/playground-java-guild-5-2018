# Optionals
Optionals are a language concept that have been introduced in Java 8.

A story of why optionals have been introduced can be found [here](http://www.oracle.com/technetwork/articles/java/java8-optional-2175753.html)

Optionals are represented by the Optional class in the java.util package and it if used to represent is a value is present or absent.
The main advantage of this new construct is that it can avoid too many null checks and it avoids any runtime NullPointerExceptions. 
Optionals also support us in developing clean APIs, as they express intent that a value might be absent.

In today's exercises, the focus will be on:
- Syntax of Optionals
- What to when an API returns an Optional
- Optionals and Streams

Documentation about Optionals can be found [here](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)
 