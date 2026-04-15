package assignment.QuestionThree;

public class BankAccount 
{
    // Enum of account types: Savings or checking
    public enum AccountType 
    {
        SAVINGS,
        CHECKING
    };

    private int accountNumber;
    private double balance;
    private String accountHolder;
    private AccountType AccountType;
    

    public BankAccount(int accountNumber, double balance, String accountHolder, AccountType AccountType) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.AccountType = AccountType;

    }


    /**
    * Deposits money into a user's account and returns the new balance 
    * @param amount The amount to be deposited - double amount.
    * @return The new balance after the deposit - double balance.
    */
    public double deposit(double amount) 
    {
            balance += amount;
            return balance;
    }


    /**
    * Withdraws money from a user's account and returns the new balance 
    * @param amount The amount to be withdrawn - double amount.
    * @return The new balance after the withdrawal - double balance.
    */
    public double withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            return balance;
        } 
        else 
        {
            System.out.println("Insufficient balance.");
            return balance;
        }
    }


    /**
    * Returns the account information as a string
    * @return A string containing the account information
    */
    public String getAccountInfo()
    {
        return String.format("Account Number: %d\nAccount Holder: %s\nAccount Type: %s\nBalance: %.2f", accountNumber, accountHolder, AccountType, balance);

    }

    /**
    * Transfers money from a user's account and returns the new balance
    * @param amount The amount to be transferred - double amount.
    * @param destinationAccount The type of the destination account - AccountType.
    * @return The new balance after the transfer - double balance.
    */
    public double transfer(double amount, AccountType destinationAccount) 
    {
        if(balance >=0 && amount > 0 && amount <= balance) 
        {
            balance -= amount;
        } 
        else 
        {
            System.out.println("Insufficient balance.");
        }

        return balance;
    }


    /**
    * Returns the balance of the account
    * @return The balance of the account - double balance.
    */
    public double getBalance() 
    {
        return balance;
    }


    /**
    * Sets the balance of the account
    * @param balance The new balance - double balance.
    * @return The updated balance - double balance.
    */
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }


}
