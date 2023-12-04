public class CheckingAccount extends Account implements TransactionHistory, OverdraftProtection {
    CheckingAccount(int accountId, String accountHolderName, double balance){
        setAccountId(accountId);
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount){
        if(applyOverdraftProtection(amount)){
            this.balance = this.balance - amount;
        } else {
            System.out.println("Insufficient balance in checking account");
        }
    }

    public void depositCheck(String amount){
        this.balance = this.balance + Double.parseDouble(amount);
    }

    public void viewTransactionHistory(){
        System.out.println(balance);
    }

    public boolean applyOverdraftProtection(double amount){
        return this.balance >= amount;
    }
}