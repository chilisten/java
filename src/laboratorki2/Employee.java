package laboratorki2;

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void calculateSalary(double bonus) {
        this.salary += bonus;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Batman", "Hero", 500000000);
        employee.displayInfo();
        employee.calculateSalary(5000);
        employee.updateSalary(55000);
        employee.displayInfo();
    }
}
