package Unit1;

public class Bank {
    private int balance=10000;
    public void withdraw(int amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Cannot withdraw amount greater than balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawl Successful,Remaining Balance: " + balance);
        }
    }
}
