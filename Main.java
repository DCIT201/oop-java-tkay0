public class Main {

    public static void main(String[] args) {

         // My test for the system
         Customer customer = new Customer("C001", "John Doe");
         Car car = new Car("V001", "Toyota Corolla", 50.0, 5);
         Motorcycle motorcycle = new Motorcycle("V002", "Harley Davidson", 30.0, false);
         Truck truck = new Truck("V003", "Ford F-150", 100.0, 1500);
 
         RentalAgency agency = new RentalAgency();
         agency.addVehicle(car);
         agency.addVehicle(motorcycle);
         agency.addVehicle(truck);
 
         agency.rentVehicle(customer, "V001", 3);
         agency.rentVehicle(customer, "V002", 5);
         agency.returnVehicle(customer, "V001");
 
         agency.generateReport();

    }


}