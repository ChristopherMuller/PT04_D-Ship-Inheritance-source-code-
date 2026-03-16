public class CargoShip extends Ship {
    private int cargoCapacity;
    private static int numCargoShips = 0;

    public CargoShip() {
        super();
        numCargoShips++;
    }

    public CargoShip(String name, int yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        setCargoCapacity(cargoCapacity);
        numCargoShips++;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public static int getNumCargoShips() {
        return numCargoShips;
    }

    public String toString() {
        return "Cargo ship: " + getName() + ", Capacity: " + cargoCapacity + " tons";
    }
}
