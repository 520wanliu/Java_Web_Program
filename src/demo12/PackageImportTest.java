package demo12;

import demo10.Account;

import java.util.Arrays;

/*
* 一、package关键字的使用
*   1、为了更好的实现项目中类的管理，提供包的概念
*   2、使用package声明类或接口所属的包，声明在源文件的首行
*   3、包，属于标识符，遵循标识符的命名规则、规范(xxxyyyy)、“见名知意”
*   4、每“.”一次，代表一层文件目录
*
*   补充：同一个包下，不可命名同名的接口、类；不同的包下，可以命名同名的接口、类
*
* 二、import关键字的使用
*   import：导入
*   1、在源文件中显式的使用import结构导入指定包下的类、接口
*   2、声明在包的声明和类的声明之间
*   3、若需要导入多个结构，则并列写出即可
*   4、可以使用“xxx.*”的方式，表示可以导入xxx包下的所有结构
*   5、若使用的类或接口是java.lang包下定义的，则可以省略import结构
*   6、若使用的类或接口是本包下定义的，则可以省略import结构
*   7、若在源文件中使用不同包下同名的类，则必须至少有一个类需要以全类名的方式显示
*   8、使用“xxx.*”方式表明可以调用xxx包下的所有结构，但如果使用的是xxx子包下的结构，则仍需要显式导入
*   9、import static：导入指定类或接口中的静态结构(属性或方法)
*
* 三、属性赋值方式：
*   1.默认初始化
*   2.显式初始化
*   3.构造器中初始化
*   4.属性赋值：对象.属性  或   对象.方法
*
* */
public class PackageImportTest {
    public static void main(String[] args) {
        String info = Arrays.toString(new int[]{1,2,3});
        System.out.println(info);

        //全类名方式显示
        demo10.Account acc = new Account(1000,2000,0.0123);
        demo11.Account acct = new demo11.Account(1000);
    }
}
/*
* 为什么要引入封装性？
*   1.高内聚、低耦合
*     高内聚：类的内部数据操作细节自己完成，不允许外部干涉；
*     低耦合：仅对外暴露少量的方法用于使用
*   2.隐藏对象内部的复杂性，只对外公开简单的接口，便于外界调用，提高系统的可扩展性、可维护性。
*
* Java规定的四种权限修饰符
*   1.权限从小到大为：private < 缺省 < protected < public
* 构造器（constructor）：
*   1.作用：创建对象；  初始化对象的信息
*   2.使用说明：
*
*/


















