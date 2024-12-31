class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int days;

    public RentalTransaction(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
    }

    public Customer getCustomer() { return customer; }
    public Vehicle getVehicle() { return vehicle; }
    public int getDays() { return days; }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "customer=" + customer.getName() +
                ", vehicle=" + vehicle.getModel() +
                ", days=" + days +
                ", cost=" + vehicle.calculateRentalCost(days) +
                '}';
    }
}