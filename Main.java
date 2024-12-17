public class Main {
    public static void main(String[] args) {
        // Create an account with a balance of 100.0
        Account myAccount = new Account("My account", 100.0);

        // Deposit 20.0 into the account
        myAccount.deposit(20.0);

        // Print the final balance
        System.out.println("The balance of the account is now: " + myAccount.balance());
    }
}