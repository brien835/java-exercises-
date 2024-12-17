public class urfirstbankstransfer {
    public static void main(String[] args) {
        // Creates an account named "Matthews account" with the balance 1000
        Account matthewacc = new Account("Matthew's account", 1000.0);
        Account myacc = new Account(" My account",0.0);

        // Withdraws 1000.0 from Matthew's account
        matthewacc.withdraw(1000.0);

        // Deposits 1000.0 to "my account"
        myacc.deposit(1000.0);
        //Print both accounts
        System.out.println(" Matthew's account balance : " + matthewacc.balance());
        System.out.println(" My account balance : " + myacc.balance());
    }
}