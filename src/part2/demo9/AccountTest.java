package part2.demo9;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,0.045);

        account.withdraw(3000);
        System.out.println("您的账户余额为：" + account.getBalabce());

        account.deposit(2500);
        System.out.println("您的账户余额为：" + account.getBalabce());

        System.out.println("月利率为：" +
                (account.getAnnualInterestRate() * 100) + "%");

    }
}
