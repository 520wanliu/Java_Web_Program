package demo7;
/*
* 1.创建程序，在其中定义两个类，Person和PersonTest类。定义如下：
* 用setAge()设置人的合法年龄(0~130)，getAge()返回人的年龄
*
* 2.练习2：
*   2.1 Person类中添加构造器，利用构造器设置所有的人的age属性初始值都为18.
*   2.2 修改上题中类和构造器，增加name属性，使得每次创建Person对象的同时
*       初始化对象的age属性和name属性值
*
* */
public class Person {
    int ages;
    String name;

    public Person() {
        name = "Jerry";
        ages = 28;
    }
    public Person(String n,int a){
        name = n;
        ages = a;
    }

    public void setAge(int age){
        if (age > 0 && age <= 130){
            ages = age ;
        }else {
            throw new RuntimeException("传入的数据非法！");
        }
    }
    public int getAge(){
        return ages;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
