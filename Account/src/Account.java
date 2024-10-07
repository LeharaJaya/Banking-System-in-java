public class Account {
    private double Balance;
    private String AccountNum;

    public Account(double balance, String accnum) {
        Balance = balance;
        AccountNum = accnum;

    }

    public Account() {
        Balance = 0.0;
        AccountNum = "";
    }

    public void withdraw(double amount) {
        if (amount <= Balance) {
            Balance -= amount;
            System.out.println("Withdarw " + amount);
        }else {
            System.out.println("insufficient balance");
        }
    }
    public void deposit(double amount) {
        Balance+= amount;
        System.out.println("Deposited "+ amount);

    }

    public double getBalance() {
        return Balance;
    }

    public void close(){
      System.out.println("Account close");
  }

}