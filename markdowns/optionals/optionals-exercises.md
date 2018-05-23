# Exercises

The exercises for optionals will focus around a _PhoneBook_ class. The phone book already has some initial values:
- Jos de Vos
- An de Toekan
- Kris de Vis

### Exercise 1:
Implement _findPhoneNumberByName_ in _PhoneBook_ class that returns an optional.

@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBook.java", "src/test/java/optionals/PhoneBook_FindPhoneNumberByNameTest.java"], 
    "command": "optionals.PhoneBook_FindPhoneNumberByNameTest"
})

### Exercise 2:
Implement _findPhoneNumberByNameAndPunishIfNothingFound_ in _PhoneBookCrawler_ that uses the implementation from exercise 1.
Punish with an _IllegalArgumentException_ and message "No phone number found".

@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBookCrawler.java"], 
    "command": "optionals.PhoneBookCrawlerExercise2Test"
})

### Exercise 3:
Implement _findPhoneNumberByNameAndPrintPhoneBookIfNothingFound_ in _PhoneBookCrawler_ that uses the implementation from exercise 1
@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBookCrawler.java", "src/main/java/optionals/PhoneBook.java"], 
    "command": "optionals.PhoneBookCrawlerExercise3Test"
})

### Exercise 4
Did you receive a Hello message from the _PhoneBook_'s toString method?
If yes, reimplement exercise 3 to avoid it get's printed.
If no, reimplement exercise 3 to have it actually printed.

@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBookCrawler.java", "src/main/java/optionals/PhoneBook.java"], 
    "command": "optionals.PhoneBookCrawlerExercise3Test"
})

### Exercise 5
Can you reimplement exercise 2 using streams instead of using _PhoneBook_'s _findPhoneNumberByName_

@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBookCrawler.java"], 
    "command": "optionals.PhoneBookCrawlerExercise2StreamsTest"
})

### Exercise 6
Can you reimplement exercise 3 using streams instead of using _PhoneBook_'s _findPhoneNumberByName_

@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBookCrawler.java", "src/main/java/optionals/PhoneBook.java"], 
    "command": "optionals.PhoneBookCrawlerExercise3StreamsTest"
})

### Exercise 7
Implement _findNameByPhoneNumber_ in _PhoneBook_ class that returns an optional.
Implement _findPhoneNumberByNameOrNameByPhoneNumber_ in _PhoneBookCrawler_ class. First search the phone book by name. If that returns nothing search the phone book by phone number. If that still returns nothing return the phone number of Jos de Vos.

@[Write the implementation]({
    "stubs": ["src/main/java/optionals/PhoneBook.java", "src/main/java/optionals/PhoneBookCrawler.java"], 
    "command": "optionals.PhoneBookCrawlerExercise7Test"
})