class Account{ 
private int account_balance; 
    // getter method
	public int getBalance() {
        return account_balance;
    }
    // setter method
	public void setNumber(int num) {
        this.account_balance = num;
    }
}
public class Encap
{
public static void main(String[] args)
{
Account acc=new Account();
acc.setNumber(1000);
System.out.println(acc.getBalance());
}
}