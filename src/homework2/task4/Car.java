package homework2.task4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String colour;

    public Car() {
        this(2014, 165.5, 2000, "Black");
    }

    public Car(String colour) {
        this(2014, 165.5, 2000, colour);
    }

    public Car(int year, String colour) {
        this(year, 165.5, 2000, colour);
    }
  
    public Car(int year, double speed, String colour) {
        this(year, speed, 2000, colour);
    }
  
    public Car(int year, double speed, int weight, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }
}
