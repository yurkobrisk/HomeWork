package HomeWork7.dto;

import java.util.Comparator;

public class PersonPasswordAndNickComparator implements Comparator<Person> {

    // сравнивать длину пароля пользователей и сравнивать псевдонимы пользователей

    @Override
    public int compare(Person person1, Person person2) {

        int result = person1.getPassword().length()-person2.getPassword().length(); // сравниние по длине пароля

        if (result == 0){
            result = person1.getNick().compareTo(person2.getNick()); // сравнение по имени
        }

        return result;
    }
}
