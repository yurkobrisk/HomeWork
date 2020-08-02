package HomeWork7.dto;

public class Animal {
    private int age; // возраст (от 1 до 15 лет)
    private String nick; // кличка (от 3 до 20 символов)

    /**
     * Создается объект Animal с параметрами
     * @param age возраст животного (от 1 до 15 лет)
     * @param nick кличка животного (от 3 до 20 символов)
     */
    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }
}
