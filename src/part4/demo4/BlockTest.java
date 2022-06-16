package part4.demo4;
/*
* 类的成员之四：代码块（或初始化块）
*   1.代码块的作用：用来初始化类、对象
*   2.代码块如果有修饰的话，只能是用个static
*   3.分类：静态代码块  vs 非静态代码块
*   4.静态代码块
*     > 内部可以有输出语句
*     > 随着类的加载而执行，且只执行一次
*     > 作用：初始化类的信息
*     > 如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
*     > 静态代码块的执行要优先于非静态代码块的执行
*     > 静态代码块只能调用静态的属性、静态的方法，不能调用非静态结构
*   5.非静态代码块
*     > 内部可以有输出语句
*     > 随着对象的创建而执行，且每创建一个对象就执行一次非静态代码块
*     > 作用：可以在创建对象时，对对象的属性等进行初始化
*     > 如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
*     > 非静态代码块可以调用静态的属性、静态的方法，或能非静态的属性、非静态的方法
*
* 对属性可以赋值的位置：
*   ① 默认初始化
*   ② 显式初始化
*   ③ 构造器中初始化
*   ④ 有了对象后，可通过“对象.属性”或“对象.方法”的方式进行赋值
*   ⑤ 代码块中赋值  (代码块和构造器时，先执行代码块)
*/
public class BlockTest {
    public static void main(String[] args) {
        String desc1 = Person.desc;
        System.out.println(desc1);

        Person p1 = new Person();
        Person p2 = new Person();
    }
}

class Person{
    String name;
    int age;
    static String desc = "我是人";

    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //static的代码块
    static {
        System.out.println("hello,static block");
        info();
//        eat(); //静态代码块不能掉用非静态方法
    }
    //非static的代码块
    {
        System.out.println("hello,block");
        eat();
        info();
    }

    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person [ name = " + name + ",age = " + age + "]";
    }
    public static void info(){
        System.out.println("我是一个快乐的人");
    }
}