import java.util.ArrayList;
import java.util.List;

class RentalAgency {
    private List<Vehicle> vehicles;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        this.vehicles = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    // Add a vehicle to the agency's fleet
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added: " + vehicle.getModel());
    }

    // Rent a vehicle to a customer
    public void rentVehicle(Customer customer, String vehicleId, int days) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                if (vehicle instanceof Rentable) {
                    Rentable rentableVehicle = (Rentable) vehicle;
                    rentableVehicle.rent(customer, days);
                    RentalTransaction transaction = new RentalTransaction(customer, vehicle, days);
                    transactions.add(transaction);
                    customer.addRentalTransaction(transaction);
                }
                return;
            }
        }
        System.out.println("Vehicle with ID " + vehicleId + " is not available for rental.");
    }

    // Return a vehicle from a customer
    public void returnVehicle(Customer customer, String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && !vehicle.isAvailableForRental()) {
                if (vehicle instanceof Rentable) {
                    Rentable rentableVehicle = (Rentable) vehicle;
                    rentableVehicle.returnVehicle();
                    System.out.println("Vehicle returned by " + customer.getName());
                }
                return;
            }
        }
        System.out.println("Vehicle with ID " + vehicleId + " is not rented or does not exist.");
    }

    // Generate a report of all transactions
    public void generateReport() {
        System.out.println("\n--- Rental Agency Report ---");
        for (RentalTransaction transaction : transactions) {
            System.out.println(transaction);
        }
        System.out.println("----------------------------");
    }
}
