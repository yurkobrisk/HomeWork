package HomeWork9.dto;

import java.util.Arrays;

public class Family {
    /**
     * Объект - семья
     */

    Parent father; // отец
    Parent mother; // мать
    Student[] student; // ребенок
    double budget; // семейный бюджет

    public Family(Parent father, Parent mother, Student... student) {
        this.father = father;
        this.mother = mother;
        this.student = student;
    }

    public Parent getFather() {
        return father;
    }

    public void setFather(Parent father) {
        this.father = father;
    }

    public Parent getMother() {
        return mother;
    }

    public void setMother(Parent mother) {
        this.mother = mother;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Семья: " + father.getSurname() + "ых [" +
                "\nотец:      " + father +
                ", \nмать:      " + mother +
                ", \nучащиеся: " + Arrays.toString(student) +
                ", \nдоход семьи: " + budget +
                ']';
    }
}
