package laboratorki2;

import java.time.LocalDate;
import java.time.Period;

public class Employee1 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee1(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int calculateYearsOfWork() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public static void main(String[] args) {
        Employee1 worker = new Employee1("Иван", 50000, LocalDate.of(2020, 7, 15));
        System.out.println("Имя: " + worker.getName());
        System.out.println("Зарплата: " + worker.getSalary());
        System.out.println("Дата приема на работу: " + worker.getHireDate());
        System.out.println("Стаж работы (в годах): " + worker.calculateYearsOfWork());
    }
}
