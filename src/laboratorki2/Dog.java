package laboratorki2;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Сабак", "Бультерьер");
        Dog dog2 = new Dog("Собок", "Питбуль");

        System.out.println("Начальные значения:");
        System.out.println("Собака 1:");
        System.out.println("Имя: " + dog1.getName());
        System.out.println("Порода: " + dog1.getBreed());
        System.out.println("Собака 2:");
        System.out.println("Имя: " + dog2.getName());
        System.out.println("Порода: " + dog2.getBreed());

        dog1.setName("Сабок");
        dog2.setBreed("Чихуахуа");

        System.out.println("\nОбновленные значения:");
        System.out.println("Собака 1:");
        System.out.println("Имя: " + dog1.getName());
        System.out.println("Порода: " + dog1.getBreed());
        System.out.println("Собака 2:");
        System.out.println("Имя: " + dog2.getName());
        System.out.println("Порода: " + dog2.getBreed());
    }
}