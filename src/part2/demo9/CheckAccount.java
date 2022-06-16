package part2.demo9;
/*
* 创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性Overdraft代表可透支限额。
* 在CheckAccount类中重写withdraw方法，其算法如下：
*       如果(取款金额 < 账户金额)  可直接取款
*       如果(取款金额 > 账户金额)  计算需要透支的额度：判断可透支额overdraft是否足够支付本次透支需要
*                  如果可以   将账户余额修改为0，重减可透支金额
*                  如果不可   提示用户超过可透支额的限额
*/
public class CheckAccount extends Account{
    private double overdraft;//可透支限额

    public CheckAccount(int id,double balance,double annualInterestRate,double overdraft){
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }
    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalabce() > amount){ //余额足够消费
//            getBalabce() -= amount;
            //方式一：
//            setBalabce(getBalabce() - amount);
            //方式二：
            super.withdraw(amount);
        }else if (overdraft >= (amount - getBalabce())){
            //透支额度 + 余额  足够消费
            overdraft -= (amount - getBalabce());
            setBalabce(0);

//            super.withdraw(getBalabce());
        }else System.out.println("超过可透支限额！");
    }
}
