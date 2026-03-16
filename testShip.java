import java.util.Scanner;

public class testShip {

    public static Ship[] fillArray(Ship[] arrShips) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        while (true) {
            try {
                System.out.print("How many ships (1-10)? ");
                n = input.nextInt();
                if (n >= 1 && n <= 10) break;
                else System.out.println("Invalid range. Enter between 1 and 10.");
            } catch (Exception e) {
                System.out.println("Invalid input. Enter a number.");
                input.nextLine();
            }
        }

        for (int i = 0; i < n; i++) {
            int type = 0;

            while (true) {
                try {
                    System.out.print("\nEnter ship type (1 = Cruise, 2 = Cargo): ");
                    type = input.nextInt();
                    if (type == 1 || type == 2) break;
                    else System.out.println("Invalid choice.");
                } catch (Exception e) {
                    System.out.println("Invalid input.");
                    input.nextLine();
                }
            }

            input.nextLine();

            System.out.print("Enter ship name: ");
            String name = input.nextLine();

            int year = 0;
            while (true) {
                try {
                    System.out.print("Enter year built: ");
                    year = input.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input.");
                    input.nextLine();
                }
            }

            if (type == 1) {
                int passengers = 0;
                while (true) {
                    try {
                        System.out.print("Enter max passengers: ");
                        passengers = input.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid input.");
                        input.nextLine();
                    }
                }
                arrShips[i] = new CruiseShip(name, year, passengers);
            } else {
                int capacity = 0;
                while (true) {
                    try {
                        System.out.print("Enter cargo capacity: ");
                        capacity = input.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid input.");
                        input.nextLine();
                    }
                }
                arrShips[i] = new CargoShip(name, year, capacity);
            }
        }

        return arrShips;
    }

    public static void displayArray(Ship[] arrShips) {
        System.out.println("\n--- Ship List ---");

        for (int i = 0; i < arrShips.length; i++) {
            if (arrShips[i] != null) {
                System.out.println((i + 1) + ". " + arrShips[i].toString());
            }
        }

        System.out.println("Total Cruise Ships: " + CruiseShip.getNumCruiseShips());
        System.out.println("Total Cargo Ships: " + CargoShip.getNumCargoShips());
    }

    public static void checkCapacity(Ship[] arrShips, int load) {
        System.out.println("\nCargo ships that can carry " + load + " tons:");

        for (Ship ship : arrShips) {
            if (ship instanceof CargoShip) {
                CargoShip c = (CargoShip) ship;
                if (c.getCargoCapacity() >= load) {
                    System.out.println(c.toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ship[] arrShips = new Ship[10];

        arrShips = fillArray(arrShips);
        displayArray(arrShips);

        int load = 0;
        while (true) {
            try {
                System.out.print("\nEnter load weight to ship: ");
                load = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input.");
                input.nextLine();
            }
        }

        checkCapacity(arrShips, load);
    }
}
