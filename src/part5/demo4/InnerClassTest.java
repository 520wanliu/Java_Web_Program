package part5.demo4;
/*
   类的内部成员之五：内部类
      1.Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B就是外部类
      2.内部类的分类：成员内部类(静态/非静态)  vs  局部内部类（方法内、代码块内、构造器内）
      3.成员内部类：
        一方面，作为外部类的成员
           > 调用外部类的结构
           > 可被static修饰（此时外部类作为内部类出现，可被static修饰）
           > 可被4中不同的权限修饰

        另一方面，作为一个类
           > 类内可以定义属性、方法、构造器等
           > 可被final修饰，表示此类不可被继承。即不使用final修饰时可被继承
           > 可被abstract修饰，表明不可实例化
      4.关注如下3个问题：
        4.1 如何实例化成员内部类的对象
        4.2 如何在成员内部类中区分调用外部类的结构
        4.3 开发中局部内部类的使用：见InnerClassTest1
 */
public class InnerClassTest {
    public static void main(String[] args) {
        //4.1 创建静态的Dog内部类的实例（静态的成员内部类）
        Person.Dog dog = new Person.Dog();
        dog.show();

        //4.1 创建非静态的Dog内部类的实例（非静态的成员内部类）
        //此时不可同上述实例化过程
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();

        System.out.println("******************************");

        bird.display("杜鹃");
    }
}

class Person{

    String name = "星星";
    int age = 18;

    public void eat(){
        System.out.println("星星中午没吃饭");
    }

    //成员内部类(静态)
//    abstract static class Dog{
    static class Dog{
        String name;
        int age;

        public void show(){
            System.out.println("一条狗的使命");
//            eat();
        }
    }
    //成员内部类(非静态)
//    final class Bird{
    class Bird{
        String name = "黄鹂";

        public Bird(){

        }

        public void sing(){
            System.out.println("我是一只小小鸟！");
            eat();  //有省略Person.this.eat();  //此时调用外部类的非静态属性
            System.out.println(age);
        }

        //4.2 如何在成员内部类中区分调用外部类的结构
        public void display(String name){
            System.out.println(name);  //此时调用的是方法的形参
            System.out.println(this.name);  //此时调用的是内部类Bird中的属性name
            System.out.println(Person.this.name);  //此时调用的是外部类Person的成员变量name
        }
    }

    public void  method(){
        //局部内部类(方法内)
        class AA{
        }
    }
    //局部内部类(代码块内)
    {
        class BB{
        }
    }
    //局部内部类(构造器内)
    public Person(){
        class CC{
        }
    }
}
