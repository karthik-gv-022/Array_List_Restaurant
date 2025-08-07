import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hotel> hotels = new ArrayList<>();

        while (true) {
            System.out.println("Enter the number to choose your choice");
            System.out.println("1. Initialise value\n2. Display all dishes \n3. Search by Shop Name\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                // Input values for a Hotel
                System.out.print("Enter the Shop Name: ");
                String shopName = sc.nextLine();

                System.out.print("Enter the Owner Name: ");
                String ownerName = sc.nextLine();

                System.out.print("Enter the Total Number of Servants: ");
                int noOfServant = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.print("Enter the 1st Famous Dish: ");
                String famousDish1 = sc.nextLine();

                System.out.print("Enter the 2nd Famous Dish: ");
                String famousDish2 = sc.nextLine();

                Hotel hotel = new Hotel(shopName, ownerName, noOfServant, famousDish1, famousDish2);
                hotels.add(hotel);
            }
            else if (choice == 2) {
                if (hotels.isEmpty()) {
                    System.out.println("No records to display.");
                } else {
                    for (Hotel h : hotels) {
                        System.out.println(h);
                    }
                }
            }
            else if (choice == 3) {
                System.out.print("Enter the Shop Name to search: ");
                String searchName = sc.nextLine();
                boolean found = false;
                for (Hotel h : hotels) {
                    if (h.getShopName().equalsIgnoreCase(searchName)) {
                        System.out.println(h);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Shop Name not found");
                }
            }
            else if (choice == 4) {
                System.out.println("Exit successfully");
                break;
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }
}
