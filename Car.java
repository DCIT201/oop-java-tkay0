class Car extends Vehicle implements Rentable {
    private int numberOfSeats;

    public Car(String vehicleId, String model, double baseRentalRate, int numberOfSeats) {
        super(vehicleId, model, baseRentalRate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println("Car rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Car is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Car returned.");
    }

    public int getNumberOfSeats() { return numberOfSeats; }
}