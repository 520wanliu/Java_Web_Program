package demo6;
/*
* 1.编写程序，定义三个重载方法。方法名为mOL
*   三个方法分别接收一个int参数、两个int参数、一个字符串参数；
*   分别执行平方运算并输出结果、相乘并输出结果、输出字符串信息；
*   在主类的main()方法中分别用参数区别调用三个方法。
* 2.定义三个重载方法max()
*   第一个方法求两个int值中的最大值
*   第二个方法求两个double值中的最大值
*   第三个方法求三个double值中的最大值，并分别调用三个方法
*
* */
public class b_OverLoadExer {

    public static void main(String[] args) {
     /*
        b_OverLoadExer test = new b_OverLoadExer();
        test.mOL(2);
        test.mOL(2,3);
        test.mOL("A");*/

        b_OverLoadExer test1 = new b_OverLoadExer();
        int max1 = test1.max(3,4);
        System.out.println(max1);
    }
/*
    public void mOL(int i){
        System.out.println(i * i);
    }
    public void mOL(int i,int j){
        System.out.println(i * j);
    }
    public void mOL(String s){
        System.out.println(s);
    }*/

    public int max(int i,int j){
        return i > j ? i : j;
    }
    public double max(double d1,double d2){
        return d1 > d2 ? d1 : d2;
    }
    public double max(double d1,double d2,double d3){
        return (d1 > d2 ? d1 : d2) > d3 ? d1 > d2 ? d1 : d2 : d3;
    }
}

