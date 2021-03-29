package homework2.task2;

public class Car {
    private int year;
    private String colour;

    public Car() {
        this.year = 2014;
        this.colour = "Black";
    }

    public Car(String colour) {
        this.year = 2014;
        this.colour = colour;
    }

    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }
}
