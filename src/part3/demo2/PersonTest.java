package part3.demo2;

import javax.xml.crypto.Data;

/*
* 面向对象之三：多态性
*    1.理解多态性：一个事物的多种形态
*
*    2.何为多态性：
*        对象多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
*
*    3.多态的使用（虚拟方法调用）
*        有了对象的多态性以后，在编译期只能调用父类中声明的方法，在运行期实际执行的是子类重写父类的方法
*        总结：编译看左边，执行看右边
*
*    4.多态性的使用前提：①类的继承关系  ②要有方法的重写
*
*    5.对象的多态性，只适用于方法，不适用于属性（此时编译和运行都看左边）
*
*    6.虚拟方法调用（多态情况下）
*        子类中定义了与父类同名同参数的方法，在多态情况下，将此时父类的方法称为虚拟方法，
*        父类根据赋给它的不同子类对象，动态调用属于子类的该方法。
*        这种方法调用在编译期时无法确定的。
*        多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法
*
*    重载和重写的区别：
*       ①二者的概念
*       ②二者的具体规则
*       ③多态性：重载不表现为多态性，重写表现为多态性。具体如下：
*       从编译和运行的角度看：重载，是指允许存在多个同名方法，而这些方法的参数不同。编译器根据方法不同的参数表，
*       对同名方法的名称做修饰。对于编译器而言，这些同名方法就成了不同的方法。它们的调用地址在编译期就绑定了。
*       Java的重载是可以包括父类和子类的，即子类可以重载父类的同名不同参数的方法。
*       所以:对于重载而言，在方法调用之前，编译器就已经确定了所要调用的方法，这称为“早绑定”或“静态绑定”。
*       而对于多态，只有等到方法调用的那一刻，编译器才会确定所要调用的具体方法，这称为“晚绑定”或“两态绑定”。
*       引用一句Bruce Eckel的话:“不要犯傻， 如果它不是晚绑定，它就不是多态“。
*
*   向下转型：
*       有了对象的多态性后，内存中实际上是加载了子类特有的属性和方法的，但由于变量声明为父类类型，
*       导致编译时，只能调用父类中声明的属性和方法，子类所特有的属性和方法不能调用。
*   如何才能调用子类特有的属性和方法？
*       向下转型：使用强制类型转换符
* ***********************************************************************
*
*
*
*/
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        System.out.println("****************************************");
        //对象多态性：父类的引用指向子类的对象
        Person p2 = new Man();
        Person p3 = new Woman();

        //多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法----虚拟方法调用
        p2.eat();
        p2.walk();

//        p2.earnMoney();

        System.out.println("****************************************");
        //不能调用子类所特有的方法：编译时，p2是Person类型
        p2.name = "Tom";
//        p2.earnMoney();
//        p2.isSmoking = True;
        /*
        *  有了对象的多态性后，内存中实际上是加载了子类特有的属性和方法的，但由于变量声明为父类类型，
        * 导致编译时，只能调用父类中声明的属性和方法，子类所特有的属性和方法不能调用。
        */

        //如何才能调用子类特有的属性和方法？
        //     向下转型：使用强制类型转换符
        Man m1 = (Man) p2;
        m1.earnMoney();
//        m1.isSmoking = true;

        //使用强转时，可能出现ClassCastException(类型转换)的异常
//        Woman w1 = (Woman) p2;
//        w1.shopping();

        /*
        * instanceof关键字的使用
        *   a instanceof A：判断对象a是否是类A的实例。若是返回true，否则返回false
        *
        *   使用情境：为了避免在向下转型时出现ClassCastException的异常，在向下转型之前，
        *        先进行instanceof的判断，一旦返回true就向下转型，如果返回false不进行向下转型
        *
        *   如果a instanceof A返回true，则a instanceof B也返回true
        *   其中B是A的父类
        */
        if (p2 instanceof Woman){
            Woman w2 = (Woman)p2;
            w2.shopping();
            System.out.println("*******Woman********");
        }
        if (p2 instanceof Man){
            Man m2 = (Man) p2;
            m2.earnMoney();
            System.out.println("*******Man********");
        }
        if (p2 instanceof Person){
            System.out.println("*******Person********");
        }
        if (p2 instanceof Object){
            System.out.println("*******Object********");
        }

        //练习
        //问题一：编译时通过，运行时不通过
        //举例一：
//        Person p4 = new Woman();
//        Man m3 = (Man) p4;
        //举例二：
//        Person P5 = new Person();
//        Man m4 = (Man)p5;

        //问题二：编译通过，运行也通过
        Object obj = new Woman();
        Person P = (Person) obj;


        //问题三：编译不通过
//        Man m5 = new Woman();
//        String str = new Data();
    }
}


