package oops.inheritance;

public class inheritanceTest {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.accelerate();
//        Ford ford = new Ford();// reference variable //constructor
//        ford.park();

        Car car = new Ford(); // upcasting

        Ford ford = (Ford) car;// down casting


    }
}
