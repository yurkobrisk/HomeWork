package HomeWork9.dto;

public class Person {
    /**
     * Объект - человек
     */

    private String surname; // фамилия человека
    private String name;    // имя человека
    private String secondName; //отчество человека
    private Sex sex = Sex.NULL;     // пол человека
    private int age;        // возраст человека
    private int indexFamily;        // индекс принадледности семье

    /**
     * Реализация - пол человека
     */
    public enum Sex{
        MALE("мужчина"),
        FEMALE("женщина"),
        NULL("пол не указан");

        String sex;

        Sex(String sex) {
            this.sex = sex;
        }

        public String getSex() {
            return sex;
        }
    }

    /**
     * Метод устанавливает фамилию
     * @param surname фамилия человека
     */
    public void setSurname(String surname) {
        if (this.surname == null){
            this.surname = surname;
        }
    }

    /**
     * Метод возвращает фамилию
     * @return фамилию
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Метод устанавливает имя
     * @param name имя человека
     */
    public void setName(String name) {
        if (this.name == null){
            this.name = name;
        }
    }

    /**
     * Метод возвращает имя
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * Метод устанавливает отчество
     * @param secondName отчество человека
     */
    public void setSecondName(String secondName) {
        if (this.secondName == null){
            this.secondName = secondName;
        }
    }

    /**
     * Метод возвращает отчество
     * @return отчество
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Метод устанавливает пол человека
     * @param sex пол человека
     */
    public void setSex(Sex sex) {
        if (this.sex == Sex.NULL){
            this.sex = sex;
        }
    }

    /**
     * Метод возвращает пол
     * @return пол
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Метод устанавливает возраст человека
     * @param age возраст человека
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Метод возвращает возраст
     * @return возраст
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод возвращает индекс принадлежности к семье
     * @return целое число
     */
    public int getIndexFamily() {
        return indexFamily;
    }

    /**
     * Метод устанавливает индекс принадлежности семье
     * @param indexFamily целое число
     */
    public void setIndexFamily(int indexFamily) {
        this.indexFamily = indexFamily;
    }
}
