package com.yourself.optionals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneBook_FindNameByPhoneNumberTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private PhoneBook phoneBook = new PhoneBook();

    @Test
    public void findNameByPhoneNumber() {
        Optional<String> name = phoneBook.findNameByPhoneNumber("016/161616");

        assertThat(name.get()).isEqualTo("Jos de Vos");
    }

    @Test
    public void findNameByPhoneNumber_NotFound() {
        expectedException.expect(NoSuchElementException.class);

        Optional<String> phoneNumber = phoneBook.findPhoneNumberByName("016/161619");

        phoneNumber.get();
    }
}