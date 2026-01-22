class BankAccount {
    long accountNumber;
    double balance;

    void setAccount(long accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }
}

class SavingAccount extends BankAccount {

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();

        s.setAccount(9876543210L, 5000);
        s.deposit(2000);
        s.withdraw(1500);
        s.display();
    }
}
