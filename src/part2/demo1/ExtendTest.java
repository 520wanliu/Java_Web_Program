package part2.demo1;
/*
* 面向对象的特征之二：继承性
*
* 一、继承性的好处：
*   ①减少代码的冗余，提高代码的复用性  ②便于功能的扩展  ③为之后多态性的使用，提供了前提
*
* 二、继承性的格式：class A extends B{}
*   A：子类、派生类、subclass
*   B：父类、超类、基类、superclass
*
*   2.1 体现：一旦子类A继承父类B后，子类A种就获取了父类B中声明的所有的属性和方法
*            特别的，父类中声明为private的属性或方法，子类继承父类后，仍然认为获取了父类中私有的结构
*            只是因为封装性的影响，使得子类不能直接调用父类的结构而已
*   2.2 子类继承父类后，还可定义自己特有的属性和方法，实现功能的拓展（子类和父类的关系不同于子集和集合的关系）
*
* 三、Java中关于继承性的规定：
*   ① 一个类可被多个子类继承
*   ② 一个类只能有一个父类（Java中类的单继承性）
*   ③ 子父类是相对的概念
*   ④ 子类直接继承的称为直接父类，间接继承的称为间接父类
*   ⑤ 子类继承父类后，就获取了直接父类以及所有间接父类中声明的属性和方法
*
* 四、说明
*   ① 如果我们没有显式的声明一个类的父类，则此类继承于java.Object类
*   ② 所有的java类（除java.lang.Object类之外）都直接或间接的继承于java.Object类
*   ③ 意味着，所有的java类都具有java.lang.Object类声明的功能
*/
public class ExtendTest {
    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.age = 1;
//        p1.eat();

        Student s1 = new Student();
        s1.eat();
//        s1.sleep();
        s1.name = "Tom";
        s1.setAge(10);
        System.out.println(s1.getAge());

        s1.breath();

        Creature c = new Creature();

    }
}
