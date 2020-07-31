package HomeWork7.dto;

import java.util.Comparator;

public class PersonPasswordComparator implements Comparator<Person> {

    // сравнивать длину пароля

    @Override
    public int compare(Person passPerson1, Person passPerson2) {

        return passPerson1.getPassword().length()-passPerson2.getPassword().length();
    }
}
