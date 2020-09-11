package HomeWork9;

import HomeWork9.dto.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SchoolMain {

    // чтение содержимого файла с фамилиями, именами, отчествами и запись в строку
    public static String fioString = new SchoolMain().fileReader("FIO.txt");

    public static ArrayList<String> surnamesArray = new SchoolMain().surnameFromFile(fioString); // запись фамилий в массив
    public static ArrayList<String> namesMaleArray = new SchoolMain().namesMaleFromFile(fioString); // запись мужских имен в массив
    public static ArrayList<String> namesFemaleArray = new SchoolMain().namesFemaleFromFile(fioString); // запись женских имен в массив
    // запись мужских имен с отчествами мужскими и женскими в двумерный массив
    public static List<ArrayList<String>> secondNamesArray = new SchoolMain().secondNamesFromFile(fioString);
    public static Random rnd = new Random();
    // генерировать запись мужского имени и соответствующего отчества мужского\женского для формирования семьи из двумерного массива
    public static ArrayList<String> nameMaleAndSecondName = secondNamesArray.get(rnd.nextInt(secondNamesArray.size()));

    /**
     * Метод чтения содержимого файла в строку
     * @param fileIn имя текстового файла
     * @return строка с содержимым файла
     */
    private String fileReader(String fileIn){
        String stringOut = null;
        try {
            stringOut = new String(Files.readAllBytes(Paths.get(fileIn))); // читать и записать содержимое файла в строку
        } catch (IOException e) {
            System.out.println("Файл не был найден. Возможно не корректный путь к файлу!");
        }
        return stringOut;
    }

    /**
     * Метод преобразования строки с фамилиями, именами и отчествами в массив с фамилиями
     * @param fioString строка с фамилиями, именами и отчествами
     * @return массив строк с фамилиями
     */
    private ArrayList<String> surnameFromFile(String fioString){

        int indexStart = fioString.indexOf("{Фамилии:"); // индекс начала строки с фамилиями
        int indexEnd = fioString.indexOf("}", indexStart); // индекс конца строки с фамилиями
        String surnames = fioString.substring(indexStart + 10, indexEnd); // строка с фамилиями

        ArrayList<String> arrayList = new ArrayList<>();

        for (String s : surnames.split(" ")) {
            arrayList.add(s);
        }
        return arrayList;
    }

    /**
     * Метод преобразования строки с фамилиями, именами и отчествами в массив с мужскими именами
     * @param fioString строка с фамилиями, именами и отчествами
     * @return массив строк с мужскими именами
     */
    private ArrayList<String> namesMaleFromFile(String fioString){

        int indexStart = fioString.indexOf("{Мужские имена");  // индекс начала строки с именами мужскими
        int indexEnd = fioString.indexOf("}", indexStart); // индекс конца строки с именами мужскими
        String namesMale = fioString.substring(indexStart + 22, indexEnd); // строка с мужскими именами

        ArrayList<String> arrayList = new ArrayList<>();

        for (String s : namesMale.split(" ")) {
            arrayList.add(s);
        }
        return arrayList;
    }

    /**
     * Метод преобразования строки с фамилиями, именами и отчествами в массив с женскими именами
     * @param fioString строка с фамилиями, именами и отчествами
     * @return массив строк с женскими именами
     */
    private ArrayList<String> namesFemaleFromFile(String fioString){

        int indexStart = fioString.indexOf("{Женские имена");  // индекс начала строки с именами женскими
        int indexEnd = fioString.indexOf("}", indexStart); // индекс конца строки с именами женскими
        String namesFemale = fioString.substring(indexStart + 22, indexEnd); // строка с женскими именами

        ArrayList<String> arrayList = new ArrayList<>();

        for (String s : namesFemale.split(" ")) {
            arrayList.add(s);
        }
        return arrayList;
    }

    /**
     * Метод преобразует строку с мужским именем и отчествами для мужского и женского пола в массив с тремя значениями.
     * Мужское имя, мужское отчество, женское отчество. Для примера: ...[Дмитрий, Дмитриевич, Дмитриевна]...
     * @param fioString строка с фамилиями, именами и отчествами
     * @return двумерный массив строк с мужским именем и отчествами для мужского и женского пола
     */
    private List<ArrayList<String>> secondNamesFromFile(String fioString){

        int indexStart = fioString.indexOf("{Отчества");  // индекс начала строки с мужским именем и отчествами
        int indexEnd = fioString.indexOf("}", indexStart); // индекс конца строки с мужским именем и отчествами
        String secondNames = fioString.substring(indexStart +29, indexEnd); // строка с мужским именем и отчествами для мужского и женского пола

        List<ArrayList<String>> arrayList = new ArrayList<>();

        for (String s : secondNames.split(" ")) {
            arrayList.add(new ArrayList<>());                   // пустой массив внутри двумерного массива
            String tempString = s.replaceAll(":+", " ");
            for (String t : tempString.split(" ")) {
                arrayList.get(arrayList.size()-1).add(t);       // заполнение пустого массива именем и отчествами
            }
        }
        return arrayList;
    }

    /**
     * Метод генерирует псевдослучайное число в указанном диапазоне включительно
     * @param min минимальное число
     * @param max максимальное число
     * @return псевдослучайное число
     */
    public static int randomInt(int min, int max){
        Random random = new Random();
        int result = random.nextInt((max+1-min)); // максимальное значение нужно увеличивать на 1, иначе не попадает в диапазон
        return result += min;
    }

    /**
     * Метод генерирует псевдослучайный предмер из класса enum Subject
     * @param min минимальный id из класса предметов
     * @param max максимальный id из класса предметов
     * @return случайный предмет
     */
    public static Subject randomSubject(int min, int max){
        Random random = new Random();
        switch (min + random.nextInt((max+1-min))){
            case 1 : return Subject.SPORT;
            case 2 : return Subject.ARTSKILL;
            case 3 : return Subject.LABOR;
            case 4 : return Subject.HEMISTRY;
            case 5 : return Subject.PHISICS;
            case 6 : return Subject.BIOLOGY;
            case 7 : return Subject.GEOGRAPHICS;
            case 8 : return Subject.SOCIUM;
            case 9 : return Subject.HISTORYBEL;
            case 10 : return Subject.HISTORYWORLD;
            case 11 : return Subject.INFORMATICA;
            case 12 : return Subject.MATEMATICA;
            case 13 : return Subject.ENGLISH;
            case 14 : return Subject.RUSLIT;
            case 15 : return Subject.RUSMOVA;
            case 16 : return Subject.BELLIT;
            case 17 : return Subject.BELMOVA;
        }
        return null;
    }

    /**
     * Метод генерирует случайную семью со случайными параметрами у объектов
     * @param numberChild количество детей которые учатся в школе
     * @return объект семья
     */
    public static Family generateFamily(int numberChild){
        Parent parentMale = new Parent(); // отец
        Parent parentFemale = new Parent(); // мать
        Student[] student = new Student[numberChild]; // ребенок/дети
        Family family = new Family(parentMale, parentFemale, student); // семья

        parentMale.setSurname(surnamesArray.get(rnd.nextInt(surnamesArray.size()))); // генерировать фамилию мужчины родителя
        parentMale.setName(nameMaleAndSecondName.get(0));
        parentMale.setSecondName(secondNamesArray.get(rnd.nextInt(secondNamesArray.size())).get(1)); // генерировать отчество мужчины
        parentMale.setSex(Person.Sex.MALE);
        parentMale.setAge(randomInt(33, 50)); // генерировать возраст
        parentMale.setProfitDay(randomInt(50, 200));

        parentFemale.setSurname(parentMale.getSurname() + "а"); // фамилия женщины родителя
        parentFemale.setName(namesFemaleArray.get(rnd.nextInt(namesFemaleArray.size()))); // генерировать имя женщины родителя
        parentFemale.setSecondName(secondNamesArray.get(rnd.nextInt(secondNamesArray.size())).get(2)); // генерировать отчество женщины
        parentFemale.setSex(Person.Sex.FEMALE);
        parentFemale.setAge(randomInt(parentMale.getAge() - 7, parentMale.getAge())); // генерировать возраст
        parentFemale.setProfitDay(randomInt(50, 200));

        // генерировать ребенка\детей
        for (int i = 0; i < numberChild; i++) {
            student[i] = new Student();
            student[i].setAge(randomInt(11, 12));
            student[i].setProfitDay(randomInt(2, 10));
            student[i].setRateIQ(randomInt(50, 100));
            if (rnd.nextInt() % 2 == 0){
                student[i].setSex(Person.Sex.MALE); // генерировать пол ребенка
                student[i].setSurname(parentMale.getSurname());         // фамилия мальчика
                student[i].setName(namesMaleArray.get(rnd.nextInt(namesMaleArray.size()))); // имя мальчика
                student[i].setSecondName(nameMaleAndSecondName.get(1)); // отчество мальчика
            } else {
                student[i].setSex(Person.Sex.FEMALE); // генерировать пол ребенка
                student[i].setSurname(parentFemale.getSurname());       // фамилия девочки
                student[i].setName(namesFemaleArray.get(rnd.nextInt(namesFemaleArray.size()))); // имя девочки
                student[i].setSecondName(nameMaleAndSecondName.get(2)); // отчество девочки
            }
        }

        family.setBudget(parentMale.getProfitDay() * 21 + parentFemale.getProfitDay() * 21);

        return family;
    }

    /**
     * Метод генерирует случайного учителя с пустым полем предмет
     * @return объект учитель
     */
    public static Teacher generateTeacher(){
        Teacher teacher = new Teacher(); // учитель

        teacher.setAge(randomInt(25, 60)); // возраст
        teacher.setGrade(randomInt(5, 10)); // балл в аттестате
        switch (randomInt(1, 4)){   // категория
            case 1 : teacher.setCategory(Teacher.Category.NOVICE);
                     teacher.setQuality(0.7); // коэффициент качества
                     teacher.setProfit(randomInt(30, 40)); // доход
                     break;
            case 2 : teacher.setCategory(Teacher.Category.TEACHER1);
                     teacher.setQuality(1.0);
                     teacher.setProfit(randomInt(40, 55));
                     break;
            case 3 : teacher.setCategory(Teacher.Category.TEACHER2);
                     teacher.setQuality(1.2);
                     teacher.setProfit(randomInt(55, 70));
                     break;
            case 4 : teacher.setCategory(Teacher.Category.MASTER);
                     teacher.setQuality(1.5);
                     teacher.setProfit(randomInt(70, 90));
                     break;
        }
        if (rnd.nextInt() % 2 == 0){
            teacher.setSex(Person.Sex.MALE); // генерировать пол учителя
            teacher.setSurname(surnamesArray.get(rnd.nextInt(surnamesArray.size()))); // фамилия мучжская
            teacher.setName(namesMaleArray.get(rnd.nextInt(namesMaleArray.size()))); // имя мужское
            teacher.setSecondName(nameMaleAndSecondName.get(1)); // отчество
        } else {
            teacher.setSex(Person.Sex.FEMALE); // генерировать пол учителя
            teacher.setSurname(surnamesArray.get(rnd.nextInt(surnamesArray.size())) + "а"); // фамилия женская
            teacher.setName(namesFemaleArray.get(rnd.nextInt(namesFemaleArray.size()))); // имя женское
            teacher.setSecondName(nameMaleAndSecondName.get(2)); // отчество
        }
        teacher.setSubjectPrimary(randomSubject(Subject.SPORT.getId(), Subject.BELMOVA.getId()));
        do {
            teacher.setSubjectSecondary(randomSubject(Subject.SPORT.getId(), Subject.BELMOVA.getId()));
        } while (teacher.getSubjectPrimary().equals(teacher.getSubjectSecondary()));


        return teacher;
    }

    /**
     * Метод возвращает список семей с суммарным количеством учащихся
     * @param counterStudent количество учащихся на одном курсе
     * @return список семей
     */
    public static ArrayList<Family> listFamilies(int counterStudent){
        ArrayList<Family> listFamylies = new ArrayList<>(); // список семей
        int indexFamily = 0;

        if (counterStudent < 1){
                System.out.println("Количество введенных студентов меньше или равно 0!" + " Студентов: " + counterStudent);
                return null;
        }
        do {
            listFamylies.add(generateFamily(randomInt(1, 2))); // случайная семья со случайным количеством детей
            counterStudent -= listFamylies.get(listFamylies.size() - 1).getStudent().length;
            listFamylies.get(indexFamily).getFather().setIndexFamily(indexFamily); // добавление индекса семьи
            listFamylies.get(indexFamily).getMother().setIndexFamily(indexFamily); // добавление индекса семьи
                for (Student student : listFamylies.get(indexFamily).getStudent()) {
                    student.setIndexFamily(indexFamily);                           // добавление индекса семьи
                }
            indexFamily++;
        } while (counterStudent > 0);
        return listFamylies;
    }

    /**
     * Метод возвращает список учителей указанной длины
     * @param counterTeacher количество учителей
     * @return список случайных учителей
     */
    public static ArrayList<Teacher> listTeachers(int counterTeacher){
        ArrayList<Teacher> listTeachers = new ArrayList<>();

        if (counterTeacher < 1){
            System.out.println("Количество введенных учителей меньше или равно 0!" + " Учителей: " + counterTeacher);
            return null;
        }
        do {
            listTeachers.add(generateTeacher()); // случайный учитель
            counterTeacher --;
        } while (counterTeacher > 0);
        return listTeachers;
    }


    public static void main(String[] args) {

        // выбор уровня сложности
        int level = 0;
        boolean flag = false; // ошибка присутствует или нет
        System.out.println("Симулятор школы.");
        do {
            try {
                do {
                    System.out.println("Выберите уровень сложности: Легко - [1] Средне - [2] Сложно - [3]");
                    Scanner scanner = new Scanner(System.in);
                    level = Integer.parseInt(scanner.nextLine());
                    if(level < 1 || level > 3){
                        flag = true;
                        System.out.println("Введенное число находится вне диапазона. Повторите выбор.\n");
                    } else{
                        flag = false;
                    }
                } while(flag);
            } catch (NumberFormatException e){
                flag = true;
                System.out.println("Вы ввели не верное число. Повторите выбор.\n");
            }
        } while (flag);

        // количество учителей доступных для использования
        int numberTeachers = 0;
        if (level == 1){
            numberTeachers = 25; // количество учителей на уровне сложности 1
        } else if (level == 2){
            numberTeachers = 17; // количество учителей на уровне сложности 2
        } else {
            numberTeachers = 10; // количество учителей на уровне сложности 3
        }

        // количество учащихся
        int numberStudents = 100;

        School school = School.getInstance(); // создание школы

        school.setFamilyList(listFamilies(numberStudents));  // создание семей учащихся исходя из количества учащихся
        school.setTeacherList(listTeachers(30));  // создание списка учителей из которых можно будет выбирать

        // распределить учащихся по группам
        int minimum = 1;
        for (Family listFamily : school.getFamilyList()) {
            for (Student student : listFamily.getStudent()) {
                if (minimum < 21){
                    student.setNumberGroup(Group.A9);
                } else if (minimum < 41){
                    student.setNumberGroup(Group.B9);
                } else if (minimum < 61){
                    student.setNumberGroup(Group.C9);
                } else if (minimum < 81){
                    student.setNumberGroup(Group.D9);
                }else if (minimum < 101){
                    student.setNumberGroup(Group.E9);
                }
                minimum++;
            }
        }

        for (Family listFamily : school.getFamilyList()) {    // скопировал учащихся в отдельный лист
            for (Student student : listFamily.getStudent()) {
                school.getStudentList().add(student);
            }
        }
        // Выбор учителей из списка
        do {
            System.out.println("\nСписок учителей для выбора. Кого хотите исключить из списка? Сделайте выбор: \n");
            int index = 1;
            for (Teacher teacher : school.getTeacherList()) {
                System.out.println("[" + index + "] " + teacher);
                index++;
            }
            System.out.println("Выберите: [0] - вывести список доступных для выбора учителей, ");
            System.out.println("          [1...30] - исключить учителя из списка.");
            System.out.println("Всего можно выбрать: " + numberTeachers + " учителей");
            Scanner scanner = new Scanner(System.in);
            try {
                int indexRemove = Integer.parseInt(scanner.nextLine());
                if (indexRemove > 0){
                    if (indexRemove - 1 < school.getTeacherList().size()){
                        school.getTeacherList().remove(indexRemove - 1);
                    }else {
                        System.out.println("Введенное число находится вне диапазона. Повторите выбор.");
                    }
                } else {
                    System.out.println("Введенное число находится вне диапазона. Повторите выбор.");
                }
            } catch (NumberFormatException e){
                System.out.println("Вы ввели не верное число. Повторите выбор.");
            }
        } while (school.getTeacherList().size() != numberTeachers);

        System.out.println("\nСписок учителей:\n");
        int index = 1;
        for (Teacher teacher : school.getTeacherList()) {
            System.out.println("[" + index + "] " + teacher);
            index++;
        }

        int dayCounter = 1;
        do {
            System.out.println("День " + dayCounter);
            System.out.println("Рабочее время с 8.00 до 14.00");
            // рандомные методы
            System.out.println("Время для отдыха, но директор не отдыхает. \nМожно заменить преподавателя для повышения качества обучения:");
            Scanner scanner = new Scanner(System.in);

            dayCounter++;
        } while (dayCounter < 30);

    }
}
