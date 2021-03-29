package homework2.task4;

public class Main {
    public static void main(String[] args) {
        Car carDefault = new Car();

        Car car1Param = new Car("Silver");

        Car car2Params = new Car(2021, "Yellow");
        
        Car car3Params = new Car(2021, 210.5, "Yellow");
        
        Car car4Params = new Car(2021, 210.5, 1500, "Yellow");
    }
}
