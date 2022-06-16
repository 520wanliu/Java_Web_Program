package part4.demo3;
/*
* 单例模式的懒汉式实现
*/
public class SingletonTest1 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);
    }
}
//懒汉式
class Order{
    //1.私有化类的构造器
    private Order(){
    }
    //2.声明当前类对象，没有初始化
    //4.此时的对象也必须声明为static的
    private static Order instance = null;

    //3.声明public、静态的公共方法来返回当前类对象
    public static Order getInstance(){
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}