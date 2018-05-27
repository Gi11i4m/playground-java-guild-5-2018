package optionals;

import java.util.Optional;
import java.util.stream.Stream;

public class PhoneBookCrawler {

    private PhoneBookSolved phoneBook;

    public PhoneBookCrawler(PhoneBookSolved phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return null;
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        return null;
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
        return null;
    }

    public PhoneBookSolved getPhoneBook(){
        return phoneBook;
    }

}
