public class BankDemoApp {

    public static void main(String[] args) {
        System.out.println("Hello World Bank");

        BankAccount ba = new BankAccount("Susi Sorglos");
        //ba.setAccountOwner("Susi Sorglos");

        ba.addMoney(1000);
        ba.print();

        ba.withdrawMoney(900);
        ba.print();

        ba.withdrawMoney(150);
        ba.print();

        // ---------
        BankAccount anonymous = new BankAccount("Karli");
        //anonymous.setAccountOwner("karli");
        anonymous.addMoney(9_000);
        anonymous.addMoney(9_000);
        anonymous.addMoney(9_000);
        anonymous.addMoney(9_000);
        anonymous.addMoney(9_000);

        anonymous.print();

    }
}
