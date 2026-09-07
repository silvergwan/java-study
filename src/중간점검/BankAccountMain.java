package 중간점검;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("최은관", 10000);

        account.deposit(5000);
        account.withdraw(3000);
        account.printInfo();

    }
}