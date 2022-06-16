package part2.demo9;

public class Account {
    private int id;//账号
    private double balabce;//余额
    private double annualInterestRate;//年利率

    public Account(int id,double balance,double annualInterestRate) {
        this.id = id;
        this.balabce = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getBalabce() {
        return balabce;
    }
    public void setBalabce(double balabce) {
        this.balabce = balabce;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //返回月利率
    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }

    //取钱
    public void withdraw(double amount){
        if (balabce >= amount){
            balabce -= amount;
            System.out.println("成功取出"+ amount + "元！");
        }else System.out.println("余额不足，取钱失败！");
    }

    //存钱
    public void deposit(double amount){
        if (amount > 0){
            balabce += amount;
            System.out.println("成功存入" + amount + "元！");
        }
    }
}
