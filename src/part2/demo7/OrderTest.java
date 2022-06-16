package part2.demo7;

import part2.demo6.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderPublic = 1;
        order.methodPublic();

        //不同包下的普通类（非子类）要使用Order类，只可以调用声明为public的属性、方法
//        order.orderPrivate = 2;
//        order.orderDefault = 3;
//        order.orderProtected = 4;
//
//        order.methodPrivate();
//        order.methodDefault();
//        order.methodProtected();
//
    }
}
