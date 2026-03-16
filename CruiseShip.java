public class CruiseShip extends Ship {
    private int maxPassengers;
    private static int numCruiseShips;

    public CruiseShip() {
    }

    public CruiseShip(String name, int yearBuilt, int passengers) {
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
        return "";
    }
}
