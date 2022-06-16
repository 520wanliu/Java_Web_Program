package part2.demo7;

import part2.demo6.Order;

public class SubOrder extends Order {
    public void method(){
        Order order = new Order();

        orderProtected = 1;
        orderProtected = 2;

        methodProtected();
        methodPublic();

        //在不同的子类中，不能调用Order类中声明为private和缺省权限的属性、方法
//        orderDefault = 3;
//        orderPrivate = 4;
//        methodDefault();
//        methodPrivate();
    }
}
