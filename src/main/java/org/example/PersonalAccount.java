package org.example;
import java.util.ArrayList;

public class PersonalAccount<Amount> {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        Amount deposit;
        deposit = new Amount(amount, TransactionType.DEPOSIT);
        transactions.add(deposit);
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            Amount withdrawal = new Amount(amount, TransactionType.WITHDRAWAL);
            transactions.add(withdrawal);
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public void printTransactionHistory() {
        for (Amount transaction : transactions) {
            System.out.println(transaction.equals() + ": $" + transaction.getClass());
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

