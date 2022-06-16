package part3.demo3;


import java.util.Date;
import java.util.Objects;

/*
* 面试题：== 和equals()的区别
*
*   一、== 的使用
*      ==：运算符
*      1.可以使用在基本数据类型变量和引用数据类型变量中
*      2.如果比较的是基本数据类型变量，比较两个变量保存的数据是否相等。
*           （类型不一定相同，boolean类型除外）
*        如果比较的是引用数据类型变量，比较两个对象的地址值是否相同，
*        即两个引用是否指向同一个对象实体
*   补充：== 符号使用时，必须保证符号左右两边的变量类型一致
*
*   二、equals()方法的使用
*      1.是一个方法，而非运算符
*      2.只能适用于引用数据类型
*      3.Object类中equals()的定义：
*       public boolean equals(Object obj) {
*           return (this == obj);
*        }
*       说明：Object类中定义的equals()和 == 的作用是相同的，
*       比较两个对象的地址值是否相同，即两个引用是否指向同一个实体
*      4.像String、Date、File、包装类等都重写了Object类中的equals()方法。
*        重写后，比较的不是两个引用的地址是否相同，而是比较两个对象的“实体内容”是否相同
*      5.通常情况下，自定义的类如果使用equals()的话，指比较两个对象的“实体内容”是否相同。
*        此时需要对Object类中的equals()进行重写。
*
*        重写的原则：比较两个对象的实体内容(即name和age)是否相同
*/
public class EqualsTest {
    public static void main(String[] args) {
        //基本数据类型比较
        int i = 10;
        int j = 10;
        double k = 10.0;
        System.out.println(i == j); //true
        System.out.println(i == k); //true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);  //true

        //引用数据类型比较，比较的是对象的地址值
        Customer cust1 = new Customer("Tom",21);
        Customer cust2 = new Customer("Tom",21);
        System.out.println(cust1 == cust2);  //false

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2); //false

        System.out.println("************************************");
        System.out.println(cust2.equals(cust1));  //false ---> true
        System.out.println(str2.equals(str1));  //true

        Date date1 = new Date(32432525324L);
        Date date2 = new Date(32432525324L);
        System.out.println(date1.equals(date2));  //true

    }
}
class Customer{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Customer(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    //重写的原则：比较两个对象的实体内容(即name和age)是否相同
    //手动实现equals()的重写
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Customer){
            Customer cust = (Customer) obj;
//            //比较两个对象的属性是否相同
//            if (this.name.equals(cust.name) && this.age == cust.age){
//                return true;
//            }else {
//                return false;
//            }
            return this.name.equals(cust.name) && this.age == cust.age;
        }else {
            return false;
        }
    }

    //手动重写equals()方法
    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && name.equals(customer.name);
    }*/

}
