package part3.demo4;

import com.sun.xml.internal.ws.server.ServerRtException;

import java.util.Date;

/*
* Object类中toString()的使用
*   1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString();
*   2.Object类中toString()的定义：
*       public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
    3.像String、Date、File、包装类等都重写了Object类中的toString()方法
*     使得再调用对象的toString()时，返回“实体内容”信息
*   4.自定义类也可重写toString()方法，当调用此方法时，返回对象的“实体内容”
*/
public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom",21);
        System.out.println(cust1.toString()); //part3.demo4.Customer@330bedb4
        System.out.println(cust1); //part3.demo4.Customer@330bedb4

        String str = new String("MM");
        System.out.println(str);  //MM

        Date date = new Date(453453453453L);
        System.out.println(date.toString());  //Tue May 15 15:17:33 CST 1984
    }
}
