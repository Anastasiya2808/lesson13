package bounded;

public class App {
    public static void main(String[] args) {
        Train train = (Train) Vehicle.getVehicle("train");
        System.out.println(train.getCarCount());

        Car car = (Car) Vehicle.getVehicle("car");
        System.out.println(car.getNum());

        Bicycle bike = (Bicycle) Vehicle.getVehicle("bike");
        System.out.println(bike.getType());


        Garage<Car> garage1 = new Garage<>();
        System.out.println(garage1.getVehicle());
        Garage<Bicycle> garage5 = new Garage<>();
        System.out.println(garage5.getVehicle());
        // Garage<Train> garage2 = new Garage<>();
        // Garage<Vehicle> garage3 = new Garage<>();
        // Garage<Object> garage4 = new Garage(); - нельзя
        // Garage<Repair> garage5 = new Garage(); - нельзя
    }
}
