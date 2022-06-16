package demo6;

public class f_RecursionTest {
    public static void main(String[] args) {
        //计算1-100之间所有自然数的和
       /* //方式一：
        int sum = 0;
        for (int i = 0; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);*/

        //方式二：递归调用
        f_RecursionTest test = new f_RecursionTest();
        int sum = test.getSum(100);
        System.out.println(sum);

        f_RecursionTest test1 = new f_RecursionTest();
        int mutil = test.getMutil(5);
        System.out.println(mutil);

        f_RecursionTest test2 = new f_RecursionTest();
        int num = test2.f(10);
        System.out.println(num);

        int value = test2.fib(3);
        System.out.println(value);
    }
    public int getSum(int m){
        if (m == 1){
            return 1;
        }else {
            return m + getSum(m-1);
        }
    }
    //计算1-m之间的乘机，即m！
    public int getMutil(int m){
        if (m == 1){
            return 1;
        }else {
            return m * getMutil(m-1);
        }
    }

    //已知有一个数列，f(0) = 1,f(1) = 4, f(n + 2) = 2 * f(n + 1) + f(n)
    //其中n是大于0的整数，求f(10)的值
    public int f(int n){
        if (n == 0)
            return 1;
        else if (n == 1)
            return 4;
        else return (2 * f(n - 1) + f(n - 2));
    }

    //输出斐波那契数列
    public int fib(int m){
            if (m == 1 || m == 2)
                return 1;
            else return fib(m - 1) + fib(m - 2);
    }
}
