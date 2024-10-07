import java.io.FileWriter;
import java.io.IOException;

public class Automobile {
    private String autoMake;
    private String autoModel;
    private String autoColor;
    private int autoYear;
    private double autoMileage;

    // Default constructor
    public Automobile() {
        this.autoMake = "Unknown";
        this.autoModel = "Unknown";
        this.autoColor = "Unknown";
        this.autoYear = 0;
        this.autoMileage = 0.0;
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color, int year, double mileage) {
        try {
            this.autoMake = make;
            this.autoModel = model;
            this.autoColor = color;
            this.autoYear = year;
            this.autoMileage = mileage;
        } catch (Exception e) {
            System.out.println("Error initializing automobile: " + e.getMessage());
        }
    }

    // Add a new vehicle method
    public String addVehicle(String make, String model, String color, int year, double mileage) {
        try {
            this.autoMake = make;
            this.autoModel = model;
            this.autoColor = color;
            this.autoYear = year;
            this.autoMileage = mileage;
            return "Vehicle added successfully";
        } catch (Exception e) {
            return "Error adding vehicle: " + e.getMessage();
        }
    }

    // List vehicle information
    public String[] listVehicleInfo() {
        try {
            return new String[]{
                "Make: " + this.autoMake,
                "Model: " + this.autoModel,
                "Color: " + this.autoColor,
                "Year: " + this.autoYear,
                "Mileage: " + this.autoMileage + " miles"
            };
        } catch (Exception e) {
            return new String[]{"Error retrieving vehicle information: " + e.getMessage()};
        }
    }

    // Remove vehicle method
    public String removeVehicle(String make, String model, String color, int year, double mileage) {
        try {
            if (make.equals(this.autoMake) && model.equals(this.autoModel) &&
                color.equals(this.autoColor) && year == this.autoYear && mileage == this.autoMileage) {
                this.autoMake = "Unknown";
                this.autoModel = "Unknown";
                this.autoColor = "Unknown";
                this.autoYear = 0;
                this.autoMileage = 0.0;
                return "Vehicle removed successfully";
            } else {
                return "Vehicle information mismatch";
            }
        } catch (Exception e) {
            return "Error removing vehicle: " + e.getMessage();
        }
    }

    // Update vehicle attributes method
    public String updateVehicle(String newMake, String newModel, String newColor, int newYear, double newMileage) {
        try {
            this.autoMake = newMake;
            this.autoModel = newModel;
            this.autoColor = newColor;
            this.autoYear = newYear;
            this.autoMileage = newMileage;
            return "Vehicle updated successfully";
        } catch (Exception e) {
            return "Error updating vehicle: " + e.getMessage();
        }
    }

    // Method to print vehicle info to a file
    public String printToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String info : listVehicleInfo()) {
                writer.write(info + "\n");
            }
            return "Vehicle information printed to file successfully";
        } catch (IOException e) {
            return "Error printing to file: " + e.getMessage();
        }
    }
}
