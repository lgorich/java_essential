package homework2.task3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String colour;

    public Car() {
        this.year = 2014;
        this.speed = 165.5;
        this.weight = 2000;
        this.colour = "Black";
    }

    public Car(String colour) {
        this.year = 2014;
        this.speed = 165.5;
        this.weight = 2000;
        this.colour = colour;
    }

    public Car(int year, String colour) {
        this.year = year;
        this.speed = 165.5;
        this.weight = 2000;
        this.colour = colour;
    }
  
    public Car(int year, double speed, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = 2000;
        this.colour = colour;
    }
  
    public Car(int year, double speed, int weight, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }
}
