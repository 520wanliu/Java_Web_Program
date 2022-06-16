package demo5;
/*
* 对象数组题目：
* 定义类student，包含三个属性：学号number（int），年纪state（int），成绩score（int）
* 创建20个学生对象，学号为1到20，年纪和成绩都由随机数确定
* 问题一：打印出3年级（state值为3）的学生信息
* 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
*
* 提示：
* 1）生成随机数：Math.random(),返回值类型为double
* 2）四舍五入取整：Math.round(double d),返回值类型long
* */
public class c_StudentTest {
    public static void main(String[] args) {
        Student stu[] = new Student[20];
        for (int i = 0; i < 20; i++){
            //给数组元素赋值
            stu[i] = new Student();
            //给Student对象的属性赋值
            stu[i].number = i + 1;
            //年级：[1，6]
            stu[i].state = (int) ((Math.random()) * (6 - 1 + 1) + 1);
            //成绩：[1,100]
            stu[i].score = (int) (Math.random() * (100 - 0 + 1));

        }
        //遍历学生数组
        for (int i = 0; i < stu.length; i++){
//            System.out.println(stu[i].number + "," + stu[i].state +
//                    "," + stu[i].score);
            System.out.println(stu[i].info());
        }
        System.out.println("********************");
        //问题一：
        for (int i = 0; i < stu.length; i++){
            if (stu[i].state == 3){
                System.out.println(stu[i].info());
            }
        }
        System.out.println("*************************");
        //问题二：
        for (int i = 0; i < stu.length; i++){
            for (int j = 0; j < stu.length - 1; j++){
                if (stu[i].score > stu[j].score){
                    //如果需要换序，交换的是数组的元素，Student对象！！！
                    Student temp = stu[i];
                    stu[i] = stu[j];
                    stu[j] = temp;
                }
            }
        }
        //遍历学生数组
        for (int i = 0; i < stu.length; i++){
//            System.out.println(stu[i].number + "," + stu[i].state +
//                    "," + stu[i].score);
            System.out.println(stu[i].info());
        }
    }

}
class Student{
    int number;//学号
    int state;//年级
    int score;//成绩

    //显示学生信息的方法
    public String info(){
        return "学号：" + number + "，年级：" + state + "，成绩" + score;
    }
}
