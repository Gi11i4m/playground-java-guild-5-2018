# Exercises

The exercises for optionals will focus around a _PhoneBook_ class. The phone book already has some initial values:
- Jos de Vos
- An de Toekan
- Kris de Vis

### Exercise 1:
Implement _findPhoneNumberByName_ and _findNameByPhoneNumber_ in _PhoneBook_ class that returns an optional. An empty optional must be returned if nothing is found.

@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBook.java", "src/test/java/optionals/PhoneBookTest.java"], 
    "command": "optionals.PhoneBookTest"
})

### Exercise 2:
Implement _findPhoneNumberByNameAndPunishIfNothingFound_ in _PhoneBookCrawler_ that uses an implementation of the PhoneBook class.
Punish with an _IllegalArgumentException_ and message "No phone number found".

@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBookCrawler.java", "src/test/java/optionals/PhoneBookCrawlerExercise2Test.java"], 
    "command": "optionals.PhoneBookCrawlerExercise2Test"
})

### Exercise 3:
Implement _findPhoneNumberByNameAndPrintPhoneBookIfNothingFound_ in _PhoneBookCrawler_ that uses the implementation from exercise 1
@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBookCrawler.java", "src/test/java/optionals/PhoneBookCrawlerTestExercise3Test.java"], 
    "command": "optionals.PhoneBookCrawlerTestExercise3Test"
})

### Exercise 4
Did you receive 1 or 2 Hello messages from the _PhoneBook_'s toString method when you ran the tests?
If you received 2 Hello messages, reimplement it so that you receive only 1 Hello message after running the tests.
If you received just 1 Hello message, reimplement exercise 3 to have it actually printed twice.

@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBookCrawler.java", "src/test/java/optionals/PhoneBookCrawlerTestExercise3Test.java"], 
    "command": "optionals.PhoneBookCrawlerTestExercise3Test"
})

### Exercise 5
After the 2 previous exercises, you should now know the difference between using the orElse and orElseGet methods.
Optionals also work nicely with streams
Can you reimplement exercise 2 using streams instead of using _PhoneBook_'s _findPhoneNumberByName_

@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBookCrawler.java", "src/test/java/optionals/PhoneBookCrawlerExercise2StreamsTest.java"], 
    "command": "optionals.PhoneBookCrawlerExercise2StreamsTest"
})

### Exercise 6
Implement _findPhoneNumberByNameOrNameByPhoneNumber_ in _PhoneBookCrawler_ class. First search the phone book by name. If that returns nothing search the phone book by phone number. If that still returns nothing return the phone number of Jos de Vos.

@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBookCrawler.java", "src/test/java/optionals/PhoneBookCrawlerTestExercise6Test.java"], 
    "command": "optionals.PhoneBookCrawlerTestExercise6Test"
})

The exercises focused on Java 8 Optional features. Java 9 introduced has introduced the _or_ method that should allow an easier implementation for the last exercise.