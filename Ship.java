public class Ship {
    private String name;
    private int yearBuilt;

    public Ship() {
        name = "";
        yearBuilt = 0;
    }

    public Ship(String name, int yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String toString() {
        return "Ship Name: " + name + ", Year Built: " + yearBuilt;
    }
}
