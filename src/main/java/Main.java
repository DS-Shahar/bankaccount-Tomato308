
public class Main
{
   public static void main(String[] args) 
   {
     BankAccount acct1 = new BankAccount(1000, -1000);
     System.out.println(acct1.getBalance());
     BankAccount acct2 = new BankAccount(1000, -1000);
     System.out.println(acct2.getBalance());
     acct2.transfer(acct1, 500);
     System.out.println(acct1.getBalance());
     System.out.println(acct2.getBalance());
     acct1.transfer(acct2, 1600);
     System.out.println("money has been tranfered from Bob to Lisa");
    }
}
