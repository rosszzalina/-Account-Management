package org.example;
public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "John Doe");

        account.deposit(1000);
        account.withdraw(300);
        account.deposit(500);

        System.out.println("Account Balance: $" + account.getBalance());
        account.printTransactionHistory();
    }
}

