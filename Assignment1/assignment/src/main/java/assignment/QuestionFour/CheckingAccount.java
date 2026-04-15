package assignment.QuestionFour;

import assignment.QuestionThree.BankAccount;

public class CheckingAccount extends BankAccount
{

    private double overdraftLimit;
    public CheckingAccount(int accountNumber, double balance, String accountHolder, AccountType accountType, double overdraftLimit) 
    {
        super(accountNumber, balance, accountHolder, BankAccount.AccountType.CHECKING);
        this.overdraftLimit = overdraftLimit;
    }


    /**
    * Withdraws money from a user's account and returns the new balance 
    * @param amount The amount to be withdrawn - double amount.
    * @return The new balance after the withdrawal - double balance.
    */
    @Override
    public double withdraw(double amount) 
    {
        if (amount >0 && amount <= (getBalance() + overdraftLimit)) 
        {
            setBalance(getBalance() - amount);
            return getBalance();
        } 
        else 
        {
            System.err.println("Insufficient funds.");
            return getBalance();
        }
    }


    /**
     * Displays the overdraft limit for the checking account.
     * @return The overdraft limit - double overdraftLimit.
     */
    public double displayOverdraftLimit() 
    {
        return overdraftLimit;
    }



}
