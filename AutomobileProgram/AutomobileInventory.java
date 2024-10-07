import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        try {
            // Create an Automobile object using parameterized constructor
            Automobile auto = new Automobile("Toyota", "Camry", "Blue", 2020, 15000.5);

            // List and print vehicle information
            System.out.println("Listing vehicle information:");
            for (String info : auto.listVehicleInfo()) {
                System.out.println(info);
            }

            // Remove the vehicle and print return value
            String removeResult = auto.removeVehicle("Toyota", "Camry", "Blue", 2020, 15000.5);
            System.out.println("\nRemove vehicle result: " + removeResult);

            // Add a new vehicle and print return value
            String addResult = auto.addVehicle("Honda", "Civic", "Red", 2021, 12000.2);
            System.out.println("\nAdd vehicle result: " + addResult);

            // List and print new vehicle information
            System.out.println("\nListing new vehicle information:");
            for (String info : auto.listVehicleInfo()) {
                System.out.println(info);
            }

            // Update the vehicle and print return value
            String updateResult = auto.updateVehicle("Honda", "Accord", "Black", 2022, 18000.8);
            System.out.println("\nUpdate vehicle result: " + updateResult);

            // List and print updated vehicle information
            System.out.println("\nListing updated vehicle information:");
            for (String info : auto.listVehicleInfo()) {
                System.out.println(info);
            }

            // Ask user if they want to print the information to a file
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nDo you want to print the information to a file? (Y/N)");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                String filePath = "C:\\Temp\\Autos.txt"; // Change the file path as needed
                String fileResult = auto.printToFile(filePath);
                System.out.println(fileResult);
            } else {
                System.out.println("File will not be printed.");
            }

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
