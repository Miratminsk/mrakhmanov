package ru.job4j.search;

import org.testng.annotations.Test;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;



public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Mirat", "Rakhmanau", "6489002", "Minsk")
        );
        phones.add(
                new Person("Anna", "Rakhmanova", "055099", "Chicago")
        );
        List<Person> persons = phones.find("hicag");
        assertThat(persons.iterator().next().getName(), is("Anna"));
    }
}
