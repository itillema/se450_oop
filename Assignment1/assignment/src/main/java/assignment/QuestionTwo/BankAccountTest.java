package assignment.QuestionTwo;

import assignment.QuestionOne.BankAccount;

public class BankAccountTest 
{
    public static void main() 
    {
        // Instantiate a BankAccount   
        BankAccount account = new BankAccount(12345, 1000.0, "John Doe", BankAccount.AccountType.SAVINGS);
        
        account.deposit(500.0);        
        account.withdraw(300.0);
        System.out.println(account.getAccountInfo());
    }

}
