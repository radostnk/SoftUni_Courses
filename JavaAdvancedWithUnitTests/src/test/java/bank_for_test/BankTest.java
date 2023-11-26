package bank_for_test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {

    private Bank bank;
    private Bank fullBank;

    @Before
    public void setUp() {
        bank = new Bank("MyBank", 5);
        fullBank = new Bank("MyBank", 3);

        bank.addClient(new Client("Tom"));
        bank.addClient(new Client("Sarah"));
        bank.addClient(new Client("John"));

        fullBank.addClient(new Client("Tom"));
        fullBank.addClient(new Client("Sarah"));
        fullBank.addClient(new Client("John"));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateBank_Throws_IfNameIsNull() {
        Bank bank = new Bank(null, 2);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateBank_Throws_IfNameIsEmpty() {
        Bank bank = new Bank(" ", 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateBank_Throws_IfCapacityIsNegative() {
        Bank bank = new Bank("bankName", -1);
    }

    @Test
    public void testCreateBank() {
        Bank bank = new Bank("testName", 6);
    }

    @Test
    public void testGetName() {
        assertEquals("MyBank", bank.getName());
    }

    @Test
    public void testGetCapacity() {
        assertEquals(5, bank.getCapacity());
    }

    @Test
    public void testGetCount() {
        assertEquals(3, bank.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddClient_Throws_IfNoMoreCapacity() {
        fullBank.addClient(new Client("Gina"));
    }

    @Test
    public void testAddClient_EnlargesCount() {
        int initialCount = bank.getCount();
        bank.addClient(new Client("Gina"));

        assertEquals(initialCount + 1, bank.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClient_Throws_IfNoSuchClient() {
        fullBank.removeClient("Lily");
    }

    @Test
    public void testRemoveClient_LessensCount() {
        int initialCount = fullBank.getCount();
        fullBank.removeClient("Tom");

        assertEquals(initialCount - 1, fullBank.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoanWithdrawal_Throws_IfNoSuchClient() {
        bank.loanWithdrawal("Josh");
    }

    @Test
    public void testLoanWithdrawal() {
        Client sarah = bank.loanWithdrawal("Sarah");
        assertFalse(sarah.isApprovedForLoan());
    }

    @Test
    public void testStatistics() {
        String expectedOutput = "The client Tom, Sarah, John is at the MyBank bank!";
        assertEquals(expectedOutput, bank.statistics());
    }

}