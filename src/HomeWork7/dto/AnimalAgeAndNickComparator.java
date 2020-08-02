package HomeWork7.dto;

import java.util.Comparator;

public class AnimalAgeAndNickComparator implements Comparator<Animal> {

    // сравнить возраст животных и сравнить клички животных

    @Override
    public int compare(Animal animal1, Animal animal2) {

        int result = animal1.getAge() - animal2.getAge();

        if (result == 0){
            result = animal1.getNick().compareTo(animal2.getNick());
        }

        return result;
    }
}
