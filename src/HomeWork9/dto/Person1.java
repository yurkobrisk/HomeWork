package HomeWork9.dto;

public class Person1 {
    /**
     * Объект - человек
     */

    private final String surname; // фамилия человека
    private final String name;    // имя человека
    private final String secondName; //отчество человека
    private final String sex;     // пол человека
    private final int age;        // возраст человека

    public Person1(String surname, String name, String secondName,String sex, int age) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.sex = sex;
        this.age = age;
    }

    public static class PersonBuilder{

        private String nestedSurname; // фамилия человека
        private String nestedName;    // имя человека
        private String nestedSecondName; //отчество человека
        private String nestedSex;     // пол человека
        private int nestedAge;        // возраст человека

        public PersonBuilder(final String nestedSurname,
                             final String nestedName,
                             final String nestedSecondName,
                             final String nestedSex,
                             final int nestedAge) {
            this.nestedSurname = nestedSurname;
            this.nestedName = nestedName;
            this.nestedSecondName = nestedSecondName;
            this.nestedSex = nestedSex;
            this.nestedAge = nestedAge;
        }

        public PersonBuilder surname(String surname) {
            this.nestedSurname = surname;
            return this;
        }

        public PersonBuilder name(String name) {
            this.nestedName = name;
            return this;
        }

        public PersonBuilder secondName(String secondName) {
            this.nestedSecondName = secondName;
            return this;
        }

        public PersonBuilder sex(String sex) {
            this.nestedSex = sex;
            return this;
        }

        public PersonBuilder age(int age) {
            this.nestedAge = age;
            return this;
        }

        public Person1 CreatePerson(){
            return new Person1(nestedSurname, nestedName, nestedSecondName, nestedSex, nestedAge);
        }
    }

    @Override
    public String toString() {
        return "Person1{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
