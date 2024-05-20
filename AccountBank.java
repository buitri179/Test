public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public AccountBank() {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountInfor() {
        System.out.println("Số tài khoản: " + accountNumber + "\nTên chủ tài khoản: " + accountHolderName + "\nSố dư: " + balance);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Bạn đã nạp tiền thành công.");
    }

    public void withdraw(double amount) {
        if(amount > this.balance) {
            System.out.println("Số dư không đủ để rút.");
        } else {
            this.balance -= amount;
            System.out.println("Bạn đã rút tiền thành công.");
        }
    }

    public void transfer(double amount, AccountBank destination) {
        if(amount > this.balance) {
            System.out.println("Tài khoản nguồn không đủ tiền.");
        } else {
            this.balance -= amount;
            destination.deposit(amount);
            System.out.println("Bạn đã chuyển khoản thành công.");
        }
    }
}
