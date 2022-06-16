package part3.demo6;

import java.util.Scanner;
import java.util.Vector;

/*
* 包装类的使用：
*    1. java提供了8中基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
*    2. 掌握基本数据类型、包装类、String三者之间的相互转换
*/
//public class WrapperTest {
//}


/*
* 利用Vector代替数组处理，从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
* 提示，数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
* 而向量类java. util.Vector可以根据需要动态伸缩。
*
* 创建Vector对象∶Vector v=new Vector();  //obj必须是对象
* 给向量添加元素∶ V.addElement（Object obj）;
* 取出向量中的元素∶ 0bject obj=v.elementAt（a）
*   注意第一个元素的下标是O，返回值是Object类型的。计算向量的长度∶ V.size（）;
*   若与最高分相差10分内∶A等;20分内∶B等; 30分内∶C等;其它∶D等
*/
public class ScoreTest {
    public static void main(String[] args) {
        //1.实例化Scanner，用于从键盘获取学生成绩
        Scanner scanner = new Scanner(System.in);

        //2.创建Vector对象：Vector v=new Vector();相当于原来的数组
        Vector v = new Vector();

        //3.通过循环操作，给Vector中添加数组元素
        int maxScore = 0;
        System.out.println("请输入学生成绩（以负数代表输入结束）：");
        for (;;){
            int score = scanner.nextInt();
            //3.1 输入时负数时，代表输入结束
            if (score < 0){
                break;
            }
            if (score > 100){
                System.out.println("输入成绩无效，请重新输入：");
                continue;
            }
            //3.2 添加操作v.addElement(Object obj);
            //jdk5.0前：
//            Integer inScore = new Integer(score);
//            v.addElement(inScore);
            //jdk5.0后：
            v.addElement(score);
            //4.获取学生成绩最大值
            if (maxScore < score) {
                maxScore = score;
            }
        }
        //5.遍历Vector，得到每个学生成绩，并与最大成绩比较，得到每个学生的成绩
        char level;
        for (int i = 0; i < v.size(); i++){
            Object obj = v.elementAt(i);
            //jdk5.0前：
//            Integer inScore = (Integer)obj;
//            int score = inScore.intValue();
            //jdk5.0后：
            int score = (int) obj;

            if (maxScore - score < 10) {
                level = 'A';
            }else if (maxScore - score < 20){
                level = 'B';
            }else if (maxScore - score < 30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student " + i + " score is " + score + ",level is " + level);
        }
    }
}
