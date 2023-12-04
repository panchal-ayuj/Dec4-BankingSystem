public class Main {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(1, "Ayuj", 10000);
        CheckingAccount c1 = new CheckingAccount(2, "Panchal", 20000);

        s1.viewTransactionHistory();
        s1.deposit(1000);
        s1.withdraw(200);
        s1.withdraw(200000);
        s1.viewTransactionHistory();
        c1.viewTransactionHistory();
        c1.deposit(1000);
        c1.withdraw(200);
        c1.withdraw(200000);
        c1.viewTransactionHistory();
    }
}