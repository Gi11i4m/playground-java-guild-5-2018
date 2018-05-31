package optionals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneBookCrawlerTestExercise3Test {

    private PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook2());

    @Test
    public void findPhoneNumberByNameAndReturnEntirePhoneBookIfNothingFound() {
        String phoneBook = phoneBookCrawler.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Raf de Giraf");

        assertThat(phoneBook).isEqualTo("PhoneBook{phoneBookEntries={An de Toekan=016/161617, Jos de Vos=016/161616, Kris de Vis=016/161618}}");
    }

}