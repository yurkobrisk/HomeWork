package HomeWork9.dto;

/**
 * Предмет преподавания/изучения в школе
 */
public enum Subject {
    SPORT(1, "физическая культура и здоровье"),
    ARTSKILL(2, "искусство"),
    LABOR(3, "трудовое обучение"),
    HEMISTRY(4, "химия"),
    PHISICS(5, "физика"),
    BIOLOGY(6, "биология"),
    GEOGRAPHICS(7, "география"),
    SOCIUM(8, "обществоведение"),
    HISTORYBEL(9, "история беларуси"),
    HISTORYWORLD(10, "всемирная история"),
    INFORMATICA(11, "информатика"),
    MATEMATICA(12, "математика"),
    ENGLISH(13, "английский язык"),
    RUSLIT(14, "русская литература"),
    RUSMOVA(15, "русский язык"),
    BELLIT(16, "белорусская литература"),
    BELMOVA(17, "белорусский язык");

    private final int id; // порядковый номер предмета
    private final String name; // наименование предмета

    Subject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
