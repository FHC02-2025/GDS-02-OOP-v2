public class BankDemoApp {

    public static void main(String[] args) {
        System.out.println("Hello World Bank");

        BankAccount ba = new BankAccount();
        ba.setAccountOwner("Susi Sorglos");

        ba.addMoney(1000);
        ba.print();

        ba.withdrawMoney(900);
        ba.print();

        ba.withdrawMoney(150);
        ba.print();

    }
}
