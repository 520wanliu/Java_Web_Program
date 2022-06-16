package part5.demo1;
/*
   接口的使用
   1.接口使用interface关键字来定义
   2.Java中，接口和类是并列的两个结构
   3.如何定义接口：定义接口中的成员
     3.1 jdk7以前：只能定义全局常量和抽象方法
         > 全局常量：public static final的，但书写时可省略
         > 抽象方法：public abstract的
     3.2 jdk8：除了定义全局常量和抽象方法外，还可定义静态方法、默认方法(略)
   4.接口中不能定义构造器，意味着接口不可以实例化
   5.Java开发中，接口通过让类去实现（implements）的方式来使用
     如果实现类覆盖了接口中所有抽象方法，则此实现类就可实例化
     如果实现类没有覆盖接口中所有抽象方法，则此实现类仍未一个抽象类

   6.Java类可以实现多个接口--->弥补了Java单继承性的局限性
     格式：class AA extend BB implements CC,DD,EE{}

   7.接口与接口之间可以继承，且可以多继承

   // *********************************************************

   8.接口的具体使用：体现了多态性
   9.接口，实际上可以看作是一种规范

   面试题：抽象类与接口有哪些异同？
         都不可实例化

 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

//        Flyable.MIN_SPEED = 2;   //常量，不可再次赋值

        Plane p = new Plane();
        p.fly();
    }
}

interface Flyable {

    //全局常量
    public static final int MAX_SPEED = 7900;
    //    public static final int MIN_SPEED = 1;
    int MIN_SPEED = 1; //省略了public static final

    public abstract void fly();
    void stop();  // 省略了public abstract

    //Interface abstract methods cannot have body
//    public Flyable(){
//    }
}

interface Attackable{
    void attack();
}

class Plane implements Flyable{  //5
    @Override
    public void stop() {
        System.out.println("减速降落");
    }

    @Override
    public void fly() {
        System.out.println("飞机起飞");
    }
}

abstract class Kite implements Flyable{  //5
    @Override
    public void fly() {
        System.out.println("放风筝");
    }
}

class Bullet implements Flyable,Attackable{

    @Override
    public void stop() {
    }

    @Override
    public void fly() {
    }

    @Override
    public void attack() {
    }
}
//****************************
interface AA{
}
interface BB{
}
interface CC extends AA,BB{
}
