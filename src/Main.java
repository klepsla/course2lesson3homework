public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada",4);
        Truck truck = new Truck("Volvo",8);
        Bicycle bicycle = new Bicycle("Кама", 2) {
        };

        ServiceStation station = new ServiceStation();
        station.check(bicycle);
        System.out.println();
        station.check(car);
        System.out.println();
        station.check(truck);
    }
}