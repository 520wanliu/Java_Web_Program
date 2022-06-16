package part5.demo4;
/*
   开发中局部内部类的使用
 */
public class InnerClassTest1 {

    //三种方法开发中都很少见，常用此方法
    public void method() {
        //局部内部类
        class AA {

        }
    }

    //此方法（包含返回值类型）较常见
    //返回一个实现了Comparable接口的类的对象
    public Comparable getComparable(){

        //创建一个实现了Comparable接口的类:  局部内部类
    /*    //方式一：此时创建了一个实现接口的非匿名实现类的匿名对象
        class MyComparable implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();*/

        //方式二：此时创建了一个实现接口的匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
