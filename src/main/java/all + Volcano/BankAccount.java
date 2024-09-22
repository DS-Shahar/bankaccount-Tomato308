
public class BankAccount
{
	private int balance = 0;
	private int minBalance = -5000;
	
    public BankAccount(int balance) 
    {
        this.balance = balance;
    }
	
    public int getBalance() 
    {
        return balance;
    }
    
    
    public int getminBalance () 
    {
    	return minBalance;
    }
    
    public void setBalance(int balance)
    {
    	if (balance >= minBalance)
    	{
    		this.balance = balance;
    	}
    }
    
    public BankAccount(int balance, int minBalance) 
    {
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public boolean withdraw(int amount) 
    {
        if (balance - amount < minBalance)
            return false;
        balance = balance - amount;
        return true;
    }
    
    public void deposit(int amount)
    {
        balance = balance + amount;
    }

    public boolean transfer(BankAccount target, int amount) 
    {
        if (withdraw(amount) == false)
            return false;
        target.deposit(amount);
	  return true;
    }

    public String toString() 
    {
        return "balance: " + balance;
    }
}
