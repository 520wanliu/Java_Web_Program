package part4.demo3;
/*
* 单例设计模式
*   1.所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例
*   2.如何实现？
*     饿汉式   懒汉式
*   3.区分饿汉式和懒汉式
*     饿汉式：
*           坏处->对象加载时间过长
*           好处->保证线程安全
*     懒汉式：
*           好处->延迟对象的创建
*           目前写法的坏处：线程不安全
*   4.单例模式的优点
*     由于单例模式只生成一个实力，减少了系统性能开销，当一个对象的产生需要较多资源时，如读取配置、
*     产生其他依赖时，则可以通过在应用启动时直接产生一个单例对象，然后永久驻留内存的方式来解决。
*/
public class SingletonTest {
    public static void main(String[] args) {
//        Bank bank1 = new Bank();
//        Bank bank2 = new Bank();

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);
    }
}

//饿汉式
class Bank{
    //1.私有化类的构造器
    private Bank(){
    }

    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static Bank instance = new Bank();

    //3.提供公共的静态的方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
