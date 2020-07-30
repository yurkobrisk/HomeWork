package HomeWork7;

import HomeWork7.dto.Person;
import HomeWork7.dto.RandomString;

import java.util.LinkedList;
import java.util.List;

public class SpisokMain {
    public static void main(String[] args) {

        List<Person> personList = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            personList.add(i, new Person(RandomString.random(7),
                    RandomString.random(RandomString.randomInt(5, 10))));
        }

        System.out.println(personList.get(0).getNick());
        System.out.println(personList.get(0).getPassword());
        System.out.println(personList.get(999_999).getNick());
        System.out.println(personList.get(999_999).getPassword());
    }
}
