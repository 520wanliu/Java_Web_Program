package part4.demo2;

public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();
        Account acct2 = new Account("XX",100);

        Account.setInterestRate(0.045);
        Account.setMinMoney(1000);

        System.out.println(acct1);
        System.out.println(acct2);

        System.out.println(acct1.getInterestRate());
        System.out.println(acct1.getMinMoney());
    }
}
