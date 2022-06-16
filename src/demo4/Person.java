package demo4;

/*
* 创建一个Person类，定义为：
* （1）创建Person类的对象，设置该对象的name、age、sex属性，
*     调用study方法，输出字符串“studying”，调用showAge()方法显示age值，
*     调用addAge()方法给对象age属性值增加2岁
* （2）传概念第二个对象，执行上述操作，体会同一个类的不同对象之间的关系
*
* */
public class Person {
    String name;
    int age;
    int sex;
    /**
     * sex:1表明是男性
     * sex:0表明是女性
     */

    public void study(){
        System.out.println("studing");
    }
    public  void showAge(){
        System.out.println("age:"+age);
    }
    public int addAge(int i){
        age += i;
        return age;
    }
}
