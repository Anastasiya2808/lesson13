package bounded;

// <T extends Vehicle> - Т может быть Vehicle и его наследники
// у vehicle можно вызвать методы Vehicle
// Т extends Vehicle & Repair
// в классе у  vehicle можно вызвать методы  Vehicle и Repair
public class Garage <T extends Vehicle & Repair>{
    private T vehicle;


    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }
}
