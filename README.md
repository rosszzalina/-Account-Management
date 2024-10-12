# Personal Account Management

This Java project is designed to manage personal bank accounts, allowing users to deposit, withdraw, and track their transactions. The project demonstrates basic object-oriented principles and includes tests for ensuring correct functionality.

## Features
- **Deposit**: Add money to the account balance.
- **Withdraw**: Subtract money from the account balance, ensuring sufficient funds.
- **Transaction History**: View a record of all deposit and withdrawal transactions.
- **Check Balance**: Retrieve the current account balance.
- **Account Information**: Retrieve account number and account holder name.

## Project Structure


## How to Use

### 1. Clone the Repository
   Clone the project to your local machine:
   ```bash
   git clone https://github.com/your-username/personal-account-management.git
   cd personal-account-management

 ```
Use Maven to compile the project:
mvn clean compile


Execute the test cases using Maven:
mvn test

## In the main method of the PersonalAccount class, you can perform the following actions:

PersonalAccount account = new PersonalAccount(12345, "John Doe");

// Deposit $100
account.deposit(100);

// Withdraw $50
account.withdraw(50);

// Check balance
System.out.println("Current Balance: " + account.getBalance());

// Print transaction history
account.printTransactionHistory();
