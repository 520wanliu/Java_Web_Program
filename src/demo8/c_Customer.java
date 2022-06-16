package demo8;
/*
* JavaBean是一种Java语言写成的可重用组件
*
* 所谓JavaBean，是指符合如下标准的Java类：
*    > 类是公用的
*    > 有一个无参的公共的构造器
*    > 有属性，且有对应的get、set方法
*/
public class c_Customer {
    private int id;
    private String name;

    public c_Customer(){

    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
