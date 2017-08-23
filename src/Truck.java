import java.util.Random;

public class Truck extends Vehicle {

    int breakdownTurnsLeft;

    public Truck() {
        Random rnd = new Random();
        this.name = String.valueOf(rnd.nextInt(1000));
        this.breakdownTurnsLeft = 0;
    }

    void moveForAnHour() {
        // speed: 100km/h. 5% chance of breaking down for 2 hours.
    }
}
