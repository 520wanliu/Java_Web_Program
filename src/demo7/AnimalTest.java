package demo7;
/*
* 面向对象的特征一：封装与隐藏
* 一、问题的引入
*    当我们创建一个类的对象后，我们可以通过"对象.属性"的方式，对对象的属性进行赋值。
* 这里，赋值操作要受到属性的数据类型和存储范围的制约。除此之外，没有其他制约条件
*    但是，在实际问题中，往往需要给属性赋值加入额外的限制条件。这个条件就不能再属性声明时体现，
* 只能通过方法进行限制条件的添加（如下例）。
*    同时，需要避免用书在使用"对象.属性"的方式堆属性再次进行赋值，则需要将属性声明为私有的（private）
*    ---> 此时，针对于属性就体现了封装性
*
* 二、封装性的体现
*    将类的属性xxx私有化(private)，同时提供公共的(public)方法来获取(getxxx)和设置(setxxx)此属性的值
*      拓展：封装性的体现：①如上；②不对外暴露的私有的方法；③单例模式。
*
* 三、封装性的体现，需要权限修饰符的配合
*    1.Java规定的4种权限(从小到大)：private，缺省，protected，public
*    2.4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
*        类内部：四种都可用
*        同一个包：缺省、protected、public
*        不同包的子类：protected、public
*        同一个工程：public
*    3.具体的，4种权限都可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
*        修饰类：只能使用：缺省、public
*
*
*/
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "Tom";
        a.age = 1;
//        a.eat();
        a.setLegs(6);
//        a.show();
        System.out.println(a.getLegs());
    }
}

class Animal{
    String name;
    int age;
    private int legs; //私有属性，防止调用时重新定义，发生冲突

    //对属性的设置
    public void setLegs(int l){
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            legs = 0;
        }
    }
    //对属性的获取
    public int getLegs(){
        return legs;
    }
  /* public void eat(){
        System.out.println("他们在吃东西！");
    }*/
    /*public void show(){
        System.out.println("name = " + name + ",age = " + age + ",legs = " + legs);
    }*/
}
