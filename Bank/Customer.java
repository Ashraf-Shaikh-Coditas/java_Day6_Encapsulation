package Week2.Day6.Bank;

import java.util.UUID;

public class Customer {
    private UUID accountNumber;
    private String customerName;
    private String customerAddress;
    private double customerBalance;

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(UUID accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accountNumber=" + accountNumber +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerBalance=" + customerBalance +
                '}';
    }

    public void addMoney(double amount) {
        double balance  = this.getCustomerBalance() + amount;
        this.setCustomerBalance(balance);
    }

    public void withdrawMoney(double amount) {
        double balance  = this.getCustomerBalance() - amount;
        this.setCustomerBalance(balance);
    }

}
