package demo1;

public class d_Conversion {     // 实现60的二进制到十六进制的转换
    public static void main(String[] args){

        //方式一：自动转换
        String str1 = Integer.toBinaryString(60);
        System.out.println(str1);
        String str2 = Integer.toHexString(60);
        System.out.println(str2);
        String str3 = Integer.toOctalString(60);
        System.out.println(str3);

        //方式二：手动实现
//        int i1 = 60;
//        int i2 = i1 & 15;  //计算从右数第一个四位：C
//        String j = (i2 > 9) ? (char)(i2 - 10 + 'A') + "" : i2 + "";
//        int temp = i1 >>> 4;  //计算从右数第二个四位：3
//        i2 = temp & 15;
//        String k = (i2 > 9) ? (char)(i2 - 10 + 'A') + "" : i2 + "";
//        System.out.println(k + "" + j);

    }
}
