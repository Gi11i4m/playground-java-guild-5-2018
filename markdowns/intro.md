# Streams
Kids, today we're going to learn about streams. 

The code below doesn't use them.
It transforms a list of names into a list of the same names but capitalized. 
See how much effort you have to put in to understand what the function actually does (well, imagining I didn't just tell you).
That's thanks to all the boilerplate and non-declarative code. 
There's a garbage list with an annoying name that actually changes meaning since it's mutable,
an ugly old for-loop, you have return your garbage list at the end and **EVERYTHING IS AWFUL**.

However there's a silver lining. You can easily make this code beautiful using Streams and its map operator.
Operators mostly take [lambda functions](https://image.slidesharecdn.com/javafp-forpdf-130313133408-phpapp01/95/fp-in-java-project-lambda-and-beyond-5-638.jpg?cb=1363255367) or function references. 
Check [this page](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html) for docs. 
To start a Stream from an array of values, use the static [of](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#of-T...-) method. 
Don't forget to .collect() the results at the end!

> P.S. If you want to use your own IDE, you can clone the project for this playground by clicking the GitHub button on the right.
> The inline editor from tech.io does have IntelliSense (Ctrl+space) but it's not foolproof. 
> You can run your solution locally or copy-paste it to the inline editor (or use the inline editor, of course). 

@[Rewrite this garbage using Streams and make sure the test still runs!]({"stubs": ["src/main/java/com/yourself/UpperCase.java"], "command": "com.yourself.UpperCaseTest#test"})