package demo1;

public class c_large {
    public static void main(String[] args) {
        int m = 24;
        int n = 56;
        int max = (m > n) ? m : n;
        System.out.println(max);

        n = 24;
        String maxStr = (m > n) ? "m大" : ((m == n) ? "m和n相等" : "n大");
        System.out.println(maxStr);

        int n1 = 32;
        int n2 = 23;
        int n3 = 12;
        int maxnum;

        int max1 = (n1 > n2) ? n1 : n2;
        int max2 = (max1 > n3) ? max1 : n3;
        System.out.println("三个数中最大数为："+max2);

//        maxnum = (((n1 > n2) ? n1 : n2) > n3) ? ((n1 > n2) ? n1 : n2) : n3;
//        System.out.println("三个数中最大数为："+ maxnum);

        int Max;
        int num1 = 23,num2 = 34,num3 = -24;
        if (num1 >= num2 && num1 >= num3)
            Max = num1;
        else if (num2 >= num1 && num2 >= num3)
            Max = num2;
        else Max = num3;

        System.out.println("三个数中的最大值为："+Max);



        double d1 = 14.4;
        double d2 = 17.5;
        if (d1 > 10 && d2 < 20)
            System.out.println("两数之和为："+(d1 + d2));
        else
            System.out.println("两数之差为："+(d2 + d1));



        String str1 = "北京";
        String str2 = "南京";

        String temp ;
        temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("交换结果为："+(str1 + "\t" + str2));

    }
}
