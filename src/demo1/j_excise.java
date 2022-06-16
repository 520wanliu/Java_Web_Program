package demo1;

public class j_excise {
    public static void main(String[] args){

        /*
        lable:for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 10; j++){
                if (j % 4 == 0){
//                    break ;
//                    continue;
                    continue lable;
                }
                System.out.print(j);
            }
            System.out.println();
        }*/

        //一个数如果恰好等于它的因子之和，这个数就称为“完数”。例如：6 = 1+2+3
        //编程：找出1000以内得所有完数（因子：除去这个数本身的其他约数）
        for (int i = 1; i <= 1000; i++){
            int sum = 0;
            for (int j = 1; j <= i / 2; j++){
                if (i % j == 0){
                    sum += j;
                }
            }
            if (i == sum){
                System.out.println(i);
            }
        }
/*
        //输出特殊形状
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 7 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
