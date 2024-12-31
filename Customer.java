import java.util.ArrayList;
import java.util.List;

class Customer {
    private String customerId;
    private String name;
    private List<RentalTransaction> rentalHistory;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public List<RentalTransaction> getRentalHistory() { return rentalHistory; }

    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", rentalHistory=" + rentalHistory +
                '}';
    }
}