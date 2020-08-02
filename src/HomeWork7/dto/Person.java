package HomeWork7.dto;

public class Person {
    private String nick; // псевдоним пользователя (от 3 до 20 символов)
    private String password; // пароль (от 5 до 10 символов)

    /**
     * Создает объект Person с параметрами
     * @param nick псевдоним пользователя (от 3 до 20 символо
     * @param password пароль (от 5 до 10 символов)
     */
    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
