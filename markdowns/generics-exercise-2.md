# Generifying existing code.

For the second exercise, you start with a method that does not yet use generics. The method returns a copy of an array with two elements swapped.

There are a few directions in which you could take this method. Try out the following exercises. Don't forget to write tests!
You can reuse the class hierarchy from the previous exercise to write tests and experiment.

1. The method for swapping elements in an array does not use generics, please change the method so it uses generics and returns an array of the same type as provided.
2. Rewrite the code using Lists instead of arrays
3. As an extra, allow the results from (1) and (2) to return an array/list of a supertype of the type in the original array/list.

@[Generify the implementation]({
    "stubs": ["src/main/java/generics/util/SwapUtil.java", "src/test/java/generics/util/SwapUtilTest.java"], 
    "command": "generics.util.SwapUtilTest"
})