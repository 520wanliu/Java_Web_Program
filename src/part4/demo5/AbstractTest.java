package part4.demo5;
/*
 abstract关键字的使用：
    1.abstract可以用来修饰的结构：类、方法
    2.abstract可以用来修饰类：抽象类
        > 此类不可实例化
        > 抽象类中一定有构造器，便于子类对象实例化调用（涉及：子类对象实例化的全过程）
        > 开发中会提供抽象类的子类，让子类对象实例化，完成相关操作

    3.abstract修饰方法：抽象方法
        > 抽象方法：只有方法的声明，没有方法体
        > 包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法
        > 若子类重写了父类所有的抽象方法后，此类可实例化
          若子类没有重写父类所有的抽象方法后，则此子类也是一个抽象类，需要使用abstract修饰

    4.abstract使用上的注意点：
        ① abstract不能用来修饰：属性、构造器等结构
        ② abstract不能用来修饰私有方法、静态方法、final的方法、final的类
*/
public class AbstractTest {
    public static void main(String[] args) {

        //一旦Person类被抽象，就不可实例化
//        Person p1 = new Person();
//        p1.eat();
    }
}

 abstract class Person{
    String name;
    int age;

    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //不是抽象方法
//    public void eat(){
//
//    }
    //抽象方法：只有方法的声明，没有方法体
    public abstract void eat();
    public abstract void breath();

    public void walk(){
        System.out.println("星星走来了！");
    }
 }

class Student extends Person{
    public Student(String name,int age){
        super(name,age);
    }

    public Student() {
    }

    public void eat() {
        System.out.println("星星好好吃饭！");
    }

    public void breath(){
        System.out.println("呼吸同一片天地！");
    }
}