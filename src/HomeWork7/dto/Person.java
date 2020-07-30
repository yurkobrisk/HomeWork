package HomeWork7.dto;

public class Person {
    private String nick; // псевдоним пользователя
    private String password; // пароль (от 5 до 10 символов)

    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
