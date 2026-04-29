class Pr14 {
    int accNo;
    String name;
    double balance;

    void openAccount(int a, String n, double b) {
        accNo = a;
        name = n;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient Balance");
    }

    void checkBalance() {
        System.out.println("Balance = " + balance);
    }
}

class SavingAccount extends BankAccount {
    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Saving Interest = " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    void maturityAmount(int years) {
        double amt = balance * Math.pow(1.06, years);
        System.out.println("Maturity Amount = " + amt);
    }
}

public class Main {
    public static void main(String[] args) {

        SavingAccount s = new SavingAccount();
        s.openAccount(101, "Meera", 10000);
        s.deposit(2000);
        s.withdraw(1000);
        s.checkBalance();
        s.calculateInterest();

        System.out.println();

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount(102, "Riya", 15000);
        f.checkBalance();
        f.maturityAmount(2);
    
}
/*
Balance = 11000.0
Saving Interest = 440.0

Balance = 15000.0
Maturity Amount = 16854.0
*/
