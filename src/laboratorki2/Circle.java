package laboratorki2;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        double radius = circle.getRadius();
        System.out.println("Радиус круга: " + radius);

        circle.setRadius(7.0);
        radius = circle.getRadius();
        System.out.println("Измененный радиус круга: " + radius);

        double area = circle.calculateArea();
        System.out.println("Площадь круга: " + area);

        double circumference = circle.calculateCircumference();
        System.out.println("Окружность круга: " + circumference);
    }
}
