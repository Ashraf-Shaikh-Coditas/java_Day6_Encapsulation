package Week2.Day6.Bank;

public class Bank {
    private String bankName;
    private int bankId;
    private String bankAddress;

    private Customer customer;


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName=" + bankName +
                ", bankId=" + bankId +
                ", bank_Address=" + bankAddress +
                '}';
    }

    public void deposit(Customer customer,double amount) {
        customer.addMoney(amount);
    }

    public void withdraw(Customer customer,double amount) {
        customer.withdrawMoney(amount);
    }

}
