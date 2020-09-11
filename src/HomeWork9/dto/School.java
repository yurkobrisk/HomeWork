package HomeWork9.dto;

import java.util.ArrayList;
import java.util.List;

public final class School {

    private static School instance;
    private ArrayList<Teacher> teacherList;
    private ArrayList<Family> familyList;
    private ArrayList<Student> studentList;

    private School() {
        teacherList = new ArrayList<>();
        familyList = new ArrayList<>();
        studentList = new ArrayList<>();
    }

    public synchronized static School getInstance() {
        if (instance == null){
            instance = new School();
        }
        return instance;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Family> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(ArrayList<Family> familyList) {
        this.familyList = familyList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
