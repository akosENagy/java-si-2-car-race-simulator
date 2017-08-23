public class Motorcycle extends Vehicle {

    static int nameNumber = 1;

    public Motorcycle() {
        this.name = "Motorcycle " + nameNumber++;
        this.distanceTravelled = 0;
    }

    void moveForAnHour() {
        // speed is 100km/h. If rains, travels with 5-50km/h slower (randomly).
    }
}
