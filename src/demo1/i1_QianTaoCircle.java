package demo1;

public class i1_QianTaoCircle {
    public static void main(String[] args){
        //100000以内的质数
        //判断不是质数：从2~n-1都不能被本身整除
        //boolean flag = true;
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();
        int count = 0;

        lable:for (int i = 2; i <= 100000; i++){
            //优化二：对本身是质数的自然数有效
            //for (int j = 2; j <= i - 1; j++)
            for (int j = 2; j <= Math.sqrt(i); j++){//
                if (i % j == 0){//判断是否被整除，若整除则不是质数
                    continue lable;
                }
            }
            count ++;
        }
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();

        System.out.println("质数的个数为：" + count);
        System.out.println("所花费的时间为："+(end - start)+"ms");
    }
}
