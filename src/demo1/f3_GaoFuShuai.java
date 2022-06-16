package demo1;

/*
条件：身高：180以上；富：财富一千万以上；帅：是
1.若但条件都满足，则：我一定要嫁给他！！！
2.若三条件有为真，则：嫁吧，比上不足比下有余。
3.若三条件都不满足，则：坚决不嫁
 */

import java.util.Scanner;

public class f3_GaoFuShuai {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请说明男生身高：(cm)");
        double tall = scanner.nextDouble();
        System.out.println("请说明男孩是否富裕：(千万)");
        double rich = scanner.nextDouble();
//        System.out.println("请说明男孩是否长得帅：(true / false)");
//        boolean smart = scanner.nextBoolean();
//
//        if (tall >= 180 && rich >= 1 && smart == true)
//            System.out.println("我一定要嫁给他！！！");
//        else if (tall >= 180 || rich >= 1 || smart == true){
//            System.out.println("嫁吧，比上不足比下有余。");
//        }else System.out.println("坚决不嫁！！！");

        System.out.println("请说明男孩是否长得帅：(是 / 否)");
        String smart = scanner.next();

        if (tall >= 180 && rich >= 1 && smart.equals("是"))
            System.out.println("我一定要嫁给他！！！");
        else if (tall >= 180 || rich >= 1 || smart.equals("是")){
            System.out.println("嫁吧，比上不足比下有余。");
        }else System.out.println("坚决不嫁！！！");
    }
}
