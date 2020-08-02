package HomeWork7;

import HomeWork7.dto.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SpisokMain {
    public static void main(String[] args) {

//      4. При помощи рандома генерируем 1_000_000 разных объектов Person. заполняем LinkedList. Поля заполняются рандомом
        int timeBefore = (int) System.currentTimeMillis();
        List<Person> personList = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            personList.add(i, new Person(RandomString.random(RandomString.randomInt(3, 20)),
                    RandomString.random(RandomString.randomInt(5, 10))));
        }
        System.out.println((int) System.currentTimeMillis() - timeBefore); // время в ms на заполнение LinkedList = 3443 ms

//      5. При помощи рандома генерируем 1_000_000 разных объектов Animal. заполняем ArrayList. Поля заполняются рандомом
        timeBefore = (int) System.currentTimeMillis();
        List<Animal> animalList = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            animalList.add(i, new Animal(RandomString.randomInt(1, 15),
                    RandomString.random(RandomString.randomInt(3, 20))));
        }
        System.out.println((int) System.currentTimeMillis() - timeBefore); // время в ms на заполнение ArrayList = 1907 ms

//      10. Отсортировать списки при помощи созданных компараторов 6 и 8.
//        personList.sort(new PersonPasswordComparator()); // сортировать personList по длине поля password
//        animalList.sort(new AnimalAgeComparator()); // сортировать по возрасту поле age

//      11*. Отсортировать списки при помощи созданных компараторов 7 и 9. Особенность данных сортировок в том,
//      что у вас должна получиться сортировка по двум полям, сначала по первому, потом по второму
        personList.sort(new PersonPasswordAndNickComparator());
        animalList.sort(new AnimalAgeAndNickComparator());
//        System.out.println(personList.toString()); // вывод в консоль всего листа
//        System.out.println(animalList.toString()); // вывод в консоль всего листа

//      12. Замерить скорость наполнения LinkedList и ArrayList. Скорость наполнения - это разница между количеством
//      миллисекунд между началом вставки в список первого элемента,
//      и количеством миллесукунд после конца вставки последного элемента

//      13. Удалить все элементы из списка Person при помощи iterator
        timeBefore = (int) System.currentTimeMillis();
        Iterator<Person> personIterator = personList.iterator();
        while (personIterator.hasNext()){
            personList.remove(0);
        }
        System.out.println((int) System.currentTimeMillis() - timeBefore); // время в ms на удаление всех элементов в LinkedList = 67 ms
//        System.out.println(personList.toString()); // вывод в консоль всего листа

//      14. Удалить все элементы из списка Animal при помощи любого из циклов
        timeBefore = (int) System.currentTimeMillis();
        for (int i = animalList.size() - 1; i > -1 ; i--) {
            animalList.remove(i);
        }
        System.out.println((int) System.currentTimeMillis() - timeBefore); // время в ms на удаление всех элементов в ArrayList = 14 ms
//        System.out.println(animalList.toString()); // вывод в консоль всего листа

    }
}
