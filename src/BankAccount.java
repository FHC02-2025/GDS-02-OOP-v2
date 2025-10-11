public class BankAccount {

    private String accountOwner;
    private double balance;

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
        balance = 0;
    }

    public void addMoney(double money) {
        if (money >= 10_000) {
            System.out.println("Sorry, maximum is 14999 EUR to add");
            return;
        }

        if (money >= 5000) {
            money = money * 0.99;
        }

        System.out.println("Money transfer");
        System.out.println("Old balance = " + balance);
        System.out.println("Adding Money = " + money);

        this.balance = this.balance + money;
        System.out.println("New Balance = " + money);
    }

    public void withdrawMoney(double money) {
        if ((balance - money) < 0) {
            System.out.println("Too less money. Its " + balance + " on your account!");
        }
        else {
            balance -= money;
        }
    }

    public void print(){
        System.out.println("accountOwner = " + accountOwner);
        System.out.println("balance = " + balance);
        System.out.println("----------");
    }

}
