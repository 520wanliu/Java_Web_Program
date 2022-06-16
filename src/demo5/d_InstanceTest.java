package demo5;
/*
* 一、内存解析的使用
* 1.引用类型的变量，只可能存储两类值： null  或  地址值（含变量的类型）
*
* 二、匿名对象的使用
* 1.理解：我们创建的对象，没有显示的赋给一个变量名，即为匿名对象
* 2.特征：匿名对象只能调用一次
* 3.使用：如下
*
* */

public class d_InstanceTest {
    public static void main(String[] args) {
        Phone play = new Phone();
/*

        play.sendEmain();
        play.playGame();
*/
/*

        //匿名对象
        new Phone().playGame();
        new Phone().sendEmain();

        new Phone().price = 1999;
        new Phone().showPrice();
*/

        //匿名对象的使用
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());
    }

}
//匿名对象的使用
class PhoneMall{
    public void show(Phone phone){
        phone.sendEmain();
        phone.playGame();
    }
}

class Phone{
    double price;
    public void sendEmain(){
        System.out.println("发送邮件！");
    }

    public void playGame(){
        System.out.println("玩游戏！");
    }
    public void showPrice(){
        System.out.println("手机价格为："+price);
    }

}