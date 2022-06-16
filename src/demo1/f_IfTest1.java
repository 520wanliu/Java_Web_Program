package demo1;
/*
if - else语句:
成绩为100分，奖励一辆BMW；
成绩为（80，90）时，奖励一台iPhone xs max；
成绩为（60，80）时，奖励一个iPad；
其他时，什么奖励都没有
请从键盘输入成绩，并加以判断
 */
import java.util.Scanner;
public class f_IfTest1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入成绩：");
        double score = scan.nextDouble();
        if (score < 60)
            System.out.println("没有奖励");
        else if (score < 80)
            System.out.println("奖励一台iPad");
        else if (score < 99)
            System.out.println("奖励一台iPhone xs max");
        else if (score == 100)
            System.out.println("奖励一辆BMW");
    }
}
