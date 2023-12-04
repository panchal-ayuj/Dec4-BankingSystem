public class Account {
    private int accountId;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    String accountHolderName;
    double balance;

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
    public void deposit(double amount1, double amount2){
        this.balance = this.balance + amount1 + amount2;
    }

    public void withdraw(double amount){
        if(this.balance >= amount){
            this.balance = this.balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}