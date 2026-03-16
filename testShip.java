import java.util.Scanner;

public class testShip {

    public static Ship[] fillArray(Ship[] arrShips) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many ships? ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Type (1 Cruise, 2 Cargo): ");
            int type = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Year: ");
            int year = input.nextInt();

            if (type == 1) {
                System.out.print("Passengers: ");
                int p = input.nextInt();
                arrShips[i] = new CruiseShip(name, year, p);
            } else {
                System.out.print("Capacity: ");
                int c = input.nextInt();
                arrShips[i] = new CargoShip(name, year, c);
            }
        }

        return arrShips;
    }

    public static void displayArray(Ship[] arrShips) {
        for (int i = 0; i < arrShips.length; i++) {
            if (arrShips[i] != null) {
                System.out.println(arrShips[i]);
            }
        }
    }

    public static void main(String[] args) {
        Ship[] arrShips = new Ship[10];
        arrShips = fillArray(arrShips);
        displayArray(arrShips);
    }
}
