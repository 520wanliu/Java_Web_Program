package part4.demo4;
/*
    final :最终的
        1.final 可以用来修饰的结构：类、方法、变量
        2.final 用来修饰类 : 此类不可被其它类所继承
                比如：String类、System类、StringBuffer类
        3.final 用来修饰方法：表明此方法不可被重写
                比如：Object类中getClass()
        4.final 用来修饰变量：此时的“变量”称为一个常量
            4.1 final 修饰属性：可以考虑赋值的位置有：显式初始化、代码块中初始化、构造器中初始化
            4.2 final 修饰局部变量：
                      尤其是使用final修饰形参时，表明此形参是一个常量。
                      当调用此方法时，给常量形参赋一个参数。一旦赋值，就只能在方法体内使用此形参，但不可重新赋值

        static final 用来修饰属性：全局常量；
*/
public class FinalTest {
    //常量用大写表示
    final int WIDTH = 0;
    final int LEFT;
    final int RIGHT;
//    final int DOWN;

    {
        LEFT = 1;
    }

    public FinalTest(){
        RIGHT = 2;
    }

    //此时的构造器中需要对上一构造器中的属性再次赋值
    public FinalTest(int n) {
        this.RIGHT = n;
    }

    //
//    public void setDOWN(int down){
//        this.DOWN = down;
//    }
    public void show(){
        final int NUM = 10;//常量
//        NUM += 20; //NUM是常量，不可在被赋值
    }

    public void show(final int num){
//        num = 20;  //此时num为常量，编译不通过
        System.out.println(num);
    }

    public static void main(String[] args) {

        int num = 10;
        num = num + 5;

        FinalTest test = new FinalTest();
//        test.setDOWN(3);
        test.show(10);
    }
}

final class FinalA{

}

/* // final类不可被继承
class B extends FinalA{

}*/

class AA{
    public final void show(){

    }
}
/* //final方法不可被重写
class BB extends AA{
    public void show() {

    }
}*/
