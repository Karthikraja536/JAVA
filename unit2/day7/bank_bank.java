abstract class Account {
    double balance;

    Account(double Balance) {
        this.balance =Balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    void display(String accountType) {
        System.out.println(accountType + " Balance: " + balance);
    }
}
class SavingsAccount extends Account {

    SavingsAccount(double Balance) {
        super(Balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
class CurrentAccount extends Account {

    CurrentAccount(double Balance) {
        super(Balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
public class bank_bank {
    public static void main(String[] args) {

        SavingsAccount savings1 = new SavingsAccount(2000);
        savings1.deposit(500);
        savings1.withdraw(1000);
        savings1.display("Savings Account");




    }
}
