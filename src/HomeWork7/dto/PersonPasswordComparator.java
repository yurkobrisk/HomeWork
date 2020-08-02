package HomeWork7.dto;

import java.util.Comparator;

public class PersonPasswordComparator implements Comparator<Person> {

    // сравнивать длину пароля пользователей

    @Override
    public int compare(Person person1, Person person2) {

        return person1.getPassword().length()-person2.getPassword().length();
    }
}
