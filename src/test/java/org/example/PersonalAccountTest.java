package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonalAccountTest {

    @Test
    public void testDeposit() {
        PersonalAccount account = new PersonalAccount(12345, "John Doe");
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        PersonalAccount account = new PersonalAccount(12345, "John Doe");
        account.deposit(200);
        account.withdraw(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    public void testInsufficientBalance() {
        PersonalAccount account = new PersonalAccount(12345, "John Doe");
        account.deposit(100);
        account.withdraw(200);
        assertEquals(100, account.getBalance());  // Balance should remain the same
    }
}

