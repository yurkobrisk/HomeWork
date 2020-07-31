package HomeWork7;

import HomeWork7.dto.Animal;
import HomeWork7.dto.Person;
import HomeWork7.dto.PersonPasswordComparator;
import HomeWork7.dto.RandomString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SpisokMain {
    public static void main(String[] args) {

        List<Person> personList = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            personList.add(i, new Person(RandomString.random(RandomString.randomInt(3, 20)),
                    RandomString.random(RandomString.randomInt(5, 10))));
        }

        personList.sort(new PersonPasswordComparator()); // сортировать personList по длине поля password
        System.out.println(personList.toString()); // вывод в консоль всего листа

        List<Animal> animalList = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            animalList.add(i, new Animal(RandomString.randomInt(1, 15),
                    RandomString.random(RandomString.randomInt(3, 20))));
        }

//        System.out.println(animalList.toString());
        System.out.println("Возраст животного: " + animalList.get(0).getAge() + " кличка: " + animalList.get(0).getNick());
        System.out.println("Возраст животного: " + animalList.get(500_000).getAge() + " кличка: " + animalList.get(500_000).getNick());
        System.out.println("Возраст животного: " + animalList.get(999_999).getAge() + " кличка: " + animalList.get(999_999).getNick());

    }
}
