package Week2.Day6.Bank;

import java.util.UUID;

public class BankMain {
    public static void main(String[] args) {
        Customer obj_c1 = new Customer();
        obj_c1.setCustomerName("Ashraf");
        obj_c1.setCustomerBalance(50000);
        obj_c1.setAccountNumber(new UUID(11,9));
        obj_c1.setCustomerAddress("Pune");

        Bank obj_b1 = new Bank();
        obj_b1.setBankId(101);
        obj_b1.setBankName("ICICI");
        obj_b1.setBankAddress("Pune");
        System.out.println(obj_b1);

        obj_b1.deposit(obj_c1,10000);
        System.out.println("After adding amount");
        System.out.println(obj_c1);

        obj_b1.withdraw(obj_c1,5000);
        System.out.println("After withdrawing amount");
        System.out.println(obj_c1);

    }
}

/*

Bank{bankName=ICICI, bankId=101, bank_Address=Pune}

After adding amount
Customer{accountNumber=00000000-0000-000b-0000-000000000009, customerName='Ashraf', customerAddress='Pune', customerBalance=60000.0}

After withdrawing amount
Customer{accountNumber=00000000-0000-000b-0000-000000000009, customerName='Ashraf', customerAddress='Pune', customerBalance=55000.0}


* */