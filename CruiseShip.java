public class CruiseShip extends Ship {
    private int maxPassengers;
    private static int numCruiseShips = 0;

    public CruiseShip() {
        super();
        numCruiseShips++;
    }

    public CruiseShip(String name, int yearBuilt, int passengers) {
        super(name, yearBuilt);
        setPassengers(passengers);
        numCruiseShips++;
    }

    public int getPassengers() {
        return maxPassengers;
    }

    public void setPassengers(int passengers) {
        this.maxPassengers = passengers;
    }

    public static int getNumCruiseShips() {
        return numCruiseShips;
    }

    public String toString() {
        return "Cruise ship: " + getName() + ", Passengers: " + maxPassengers;
    }
}
