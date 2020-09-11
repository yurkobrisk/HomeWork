package HomeWork9.dto;

/**
 * Объект - класс
 */
public enum Group{
    A9(1, "9А"),
    B9(2, "9Б"),
    C9(3, "9В"),
    D9(4, "9Г"),
    E9(5, "9Д");

    private final int id; // id класса
    private final String numberGroup; // имя класса

    Group(int id, String numberGroup){
        this.id = id;
        this.numberGroup = numberGroup;
    }

    public int getId() {
        return id;
    }

    public String getNameGroup() {
        return numberGroup;
    }

    //    String nameGroup; // Название класса
//    Teacher teacher;  // Классный руководитель (ссылка на преподавателя)
//    ArrayList<Student> studentsGroup;  // Список класса (ссылки на учащихся)
//    Subject subjectGroup; // Список предметов в этом классе (ссылки на предметы)
//    double grade; // Список оценок по предметам у учащихся (ссылки на предметы, учащихся)
}
