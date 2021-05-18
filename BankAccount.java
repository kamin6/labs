public class BankAccount {
    protected String Customer;
    protected int AccountNumber;
    protected float Balance;

    protected int currentAccountNumber = 100000;

    public float getBalance() {
        return this.Balance;
    }

    public void setBalance(float Balance) {
        this.Balance = Balance;
    }

    public int getAccountNumber() {
        return this.AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {

        if (AccountNumber >= 100000){
            this.AccountNumber = AccountNumber;
        } else {
            this.AccountNumber = currentAccountNumber++;
        }
        
    }


    public String getCustomer() {
        return this.Customer;
    }

    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }

    public void Deposit(int Amount) {
        this.Balance += Amount;
    }

    public void Withdraw(int Amount) {
        this.Balance -= Amount;
    }




}
