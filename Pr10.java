class BankAccount {
    String name;
    double balance;
    static double rate = 5;

    BankAccount(String n, double b) {
        name = n;
        balance = b;
    }

    void interest() {
        System.out.println("Interest = " + (balance * rate / 100));
    }

    static void setRate(double r) {
        rate = r;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Meera", 10000);

        System.out.println("Name = " + a.name);
        System.out.println("Balance = " + a.balance);
        a.interest();

        BankAccount.setRate(7);
        a.interest();
    }
}
/*
Name = Meera
Balance = 10000.0
Interest = 500.0
Interest = 700.0
*/
