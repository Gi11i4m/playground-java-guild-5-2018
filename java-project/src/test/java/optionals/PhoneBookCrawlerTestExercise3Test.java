package optionals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneBookCrawlerTestExercise3Test {

    private PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());

    @Test
    public void findPhoneNumberByNameAndReturnEntirePhoneBookIfNothingFound() {
        String phoneBook = phoneBookCrawler.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Raf de Giraf");

        assertThat(phoneBook).isEqualTo(phoneBookCrawler.getPhoneBook().toString());
    }

}