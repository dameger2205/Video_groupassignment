import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;
    private String name;
    private String address;
    private String phone;
    private int numRentals;
    private String accountType;
    private String username;
    private String password;
    private List<String> rentedItemIds;

    public Customer(String id, String name, String address, String phone, int numRentals, String accountType,
                    String username, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.numRentals = numRentals;
        this.accountType = accountType;
        this.username = username;
        this.password = password;
        this.rentedItemIds = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumRentals() {
        return numRentals;
    }

    public void setNumRentals(int numRentals) {
        this.numRentals = numRentals;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRentedItemIds() {
        return rentedItemIds;
    }

    public void setRentedItemIds(List<String> rentedItemIds) {
        this.rentedItemIds = rentedItemIds;
    }

    public void rentItem(String itemId) {
        rentedItemIds.add(itemId);
        numRentals++;
    }

    public void returnItem(String itemId) {
        rentedItemIds.remove(itemId);
        numRentals--;
    }

    public void promoteCustomer() {
        if (accountType.equals("Guest")) {
            if (numRentals > 3) {
                accountType = "Regular";
            }
        } else if (accountType.equals("Regular")) {
            if (numRentals > 5) {
                accountType = "VIP";
            }
        }
    }

    // Other methods as needed

    @Override
    public String toString() {
        return "Customer ID: " + id +
                "\nName: " + name +
                "\nAddress: " + address +
                "\nPhone: " + phone +
                "\nNumber of Rentals: " + numRentals +
                "\nAccount Type: " + accountType +
                "\nUsername: " + username +
                "\nPassword: " + password +
                "\nRented Item IDs: " + rentedItemIds;
    }
}
