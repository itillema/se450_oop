package assignment.QuestionFour;

import assignment.QuestionThree.BankAccount;


public class BankAccountTest 
{
    public static void main() 
    {
        // Instantiate a Checking account  
        CheckingAccount account = new CheckingAccount(12345, 1000.0, "John Doe", BankAccount.AccountType.CHECKING, 500.0); 

        // Test deposit, withdraw, and display account info
        account.deposit(500.0);        
        account.withdraw(3000.0);
        account.transfer(100, BankAccount.AccountType.CHECKING);
        System.out.println(account.getAccountInfo());
    }

}
