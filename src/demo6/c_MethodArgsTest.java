package demo6;
/*
* 可变个数形参的方法
*
* 具体使用：1.可变个数形参的格式：数据类型 ... 变量名
*         2.当调用可变个数形参的方法时，传入的参数个数可以是：0个，1个，2个，。。。
*         3.可变个数形参的方法与本类方法中方法名相同，形参不同的方法间构成重载
*         4.可变个数形参的方法与本类方法中方法名相同，形参类型也相同的数组之间不构成重载，即不可共存
*         5.可变个数形参在方法的形参中，不许声明在末尾
*         6.可变个数形参在方法的形参中，最多只能声明一个可变形参
* */
public class c_MethodArgsTest {

    public static void main(String[] args) {
        c_MethodArgsTest test = new c_MethodArgsTest();
        test.show("hello");
//        test.show("hello","world");

        test.show("AA","BB","CC");
    }
    public void show(String s){
        System.out.println("show");
    }
    public void show(String ... s){
        System.out.println("show multnum");
        for (int i = 0; i < s.length; i++)
            System.out.print(s[i] + "\t");
    }
    /*
    4.可变个数形参的方法与本类方法中方法名相同，形参类型也相同的数组之间不构成重载，即不可共存
    public void show(String[] s){
        System.out.println("show multnum");
    }*/
//  5.可变个数形参在方法的形参中，不许声明在末尾
  /*  public void show(int i, String ... str){

    }*/


}
