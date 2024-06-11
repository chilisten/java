package laboratorki2;


public class Svetofor {
    public enum Color {
        RED,
        YELLOW,
        GREEN
    }

    private Color color;
    private int duration;

    public Svetofor(Color initialColor, int duration) {
        this.color = initialColor;
        this.duration = duration;
    }

    public void changeColor() {
        switch (color) {
            case RED:
                color = Color.GREEN;
                break;
            case YELLOW:
                color = Color.RED;
                break;
            case GREEN:
                color = Color.YELLOW;
                break;
        }
    }

    public boolean isRed() {
        return color == Color.RED;
    }

    public boolean isGreen() {
        return color == Color.GREEN;
    }

    public Color getColor() {
        return color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        Svetofor trafficLight = new Svetofor(Color.RED, 10);
        System.out.println("Initial color: " + trafficLight.getColor());

        trafficLight.changeColor();
        System.out.println("New color: " + trafficLight.getColor());

        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());
    }
}

