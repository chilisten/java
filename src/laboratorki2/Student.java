package laboratorki2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private double grade;
    private List<String> courses;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public static void main(String[] args) {
        Student student = new Student("Максим", 5);
        System.out.println("Имя студента: " + student.getName());
        System.out.println("Оценка: " + student.getGrade());

        student.addCourse("Математика");
        student.addCourse("Физика");
        student.addCourse("Информатика");

        System.out.println("Курсы студента: " + student.getCourses());

        student.removeCourse("Физика");

        System.out.println("Курсы студента после удаления: " + student.getCourses());
    }
}
