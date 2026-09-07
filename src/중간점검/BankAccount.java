package 중간점검;

public class BankAccount {
    private String owner;
    private int balance;

    BankAccount(String owner, int balance) {
        validateBalance(balance);
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("입금 금액은 0보다 커야합니다.");
        } else {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("출금 금액은 0보다 커야합니다.");
        } else if (amount > balance) {
            throw new IllegalArgumentException("출금 금액은 잔액보다 클 수 없습니다.");
        } else {
            balance -= amount;
        }
    }

    public void printInfo() {
        System.out.println("예금주명 = " + owner + ", 잔액 = " + balance);
    }

    public void validateBalance(int balance){
        if (balance < 0){
            throw new IllegalArgumentException("잔액은 0보다 커야합니다.");
        }
    }
}
