public class SavingsAccount extends Account implements TransactionHistory {
    SavingsAccount(int accountId, String accountHolderName, double balance){
        setAccountId(accountId);
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount){
        if(this.balance >= amount){
            this.balance = this.balance - amount;
        } else {
            System.out.println("Insufficient balance in savings account");
        }
    }

    @Override
    public void viewTransactionHistory(){
        System.out.println(balance);
    }
}