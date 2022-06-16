package part5.demo4;
/*
   开发中局部内部类的使用
 */
public class InnerClassTest2 {
    /*
       在局部内部类的方法中（比如：show()）如果调用局部内部类所声明的方法（比如：method()）中的局部变量（如：num）的话
       要求此局部变量声明为final的

       jdk7及之前版本：要求此局部变量显式的声明为final的
       jdk8及之后版本：可省略final的声明
     */
    public void method(){
        //局部变量
        int num = 10;

        class AA{
            public void show(){
//                num = 20;
                System.out.println(num);
            }
        }
    }
}
