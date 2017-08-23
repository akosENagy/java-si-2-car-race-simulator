public class Main {

    static boolean isRaining;

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car();
        vehicles[1] = new Motorcycle();
        vehicles[2] = new Car();
        vehicles[3] = new Motorcycle();
        vehicles[4] = new Truck();


        for (Vehicle v : vehicles) {
            System.out.println(v.name + " " + v.distanceTravelled + " ");
        }
    }
}
