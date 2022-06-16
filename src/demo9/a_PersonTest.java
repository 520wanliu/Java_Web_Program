package demo9;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

/*
* this关键字的使用
* 1.this可以用来修饰：属性、方法、构造器
*
* 2.this修饰属性和方法
*   this理解为：当前对象或当前正在创建的对象
*
*   2.1 在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对象属性或方法
*       通常情况下，通常选择省略"this."；特殊情况下，若方法的形参和类的属性同名时，
*       必须显式的使用"this.变量"的方式，表明此变量是属性，而非形参
*   2.2 在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前正在创建的对象属性或方法
*       通常情况下，通常选择省略"this."；特殊情况下，若方法的形参和类的属性同名时，
*       必须显式的使用"this.变量"的方式，表明此变量是属性，而非形参
*
* 3.this调用构造器
*   ① 在类的构造器中，可以显示的使用"this(形参列表)"的方式，调用本类中指定的其他构造器
*   ② 构造器中不能通过"this(形参列表)"的方式调用自己的构造器
*   ③ 如果一个类中有n个构造器，则最多有n—1个构造器中使用了"this(形参列表)"
*   ④ 规定："this(形参列表)"必须声明在当前构造器的首行
*   ⑤ 构造器内部最多只能声明一个"this(形参列表)"，用来调用其他的构造器
*/
public class a_PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(1);
        System.out.println(p.getAge());
    }
}

class Person{
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age) {
         this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}