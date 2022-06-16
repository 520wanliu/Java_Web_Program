package part4.demo5;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("橙子",666,5000,2000);
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }

/*
编写一个Employee类，声明为抽象类
包含如下三个属性：name、id、salary
提供必要的构造器和抽象方法：work()

*/
public abstract static class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name,int id,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
}

/*
 对于Manager类，他既有员工，还有奖金（bonus）的属性
*/
public static class Manager extends Employee {
    private double bonus;

    public Manager(double bonus) {
        super();
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理管理员工，便于提高公司运行效率");
    }
}

public static class CommonEmployee extends Employee {
    @Override
    public void work() {
        System.out.println("一线员工");
    }
}
}
