package part4.demo6exer;

import java.util.Calendar;
import java.util.Scanner;
/*
   定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
   利用循环结构遍历数组，输出各个对象的类型：name，number birthday，以及该对象生日。
   当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 */
public class PayrollSystem {
    public static void main(String[] args) {
        //方式一：Scanner输入
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入本月月份：");
//        int month = scanner.nextInt();

        //方式二：Calendar获取当前月份
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH); //获取当前月份,且此时的月份按照一月份：0以此类推

        Employee[] emp = new Employee[2];
        emp[0] = new SalariedEmployee("橙子",2001,new MyDate(1997,7,27),20000);
        emp[1] = new HourlyEmployee("星星",2002,new MyDate(1997,1,19),70,240);

        for (int i = 0; i < emp.length; i++){
            System.out.println(emp[i]);
            double salary = emp[i].earnings();
            System.out.println("月工资为：" + salary);

            if ((month + 1) == emp[i].getBirthday().getMonth()){
                System.out.println("生日快乐，奖励一百元");
            }
        }
    }
}
