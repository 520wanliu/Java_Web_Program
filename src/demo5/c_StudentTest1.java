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
 *
 * 对上一代码的优化
 *
 * */
public class c_StudentTest1 {
    public static void main(String[] args) {
        Student1 stu[] = new Student1[20];
        for (int i = 0; i < 20; i++){
            //给数组元素赋值
            stu[i] = new Student1();
            //给Student对象的属性赋值
            stu[i].number = i + 1;
            //年级：[1，6]
            stu[i].state = (int) ((Math.random()) * (6 - 1 + 1) + 1);
            //成绩：[1,100]
            stu[i].score = (int) (Math.random() * (100 - 0 + 1));

        }
        //遍历学生数组
        c_StudentTest1 test = new c_StudentTest1();
        test.print(stu);
        System.out.println("*************************");
        //问题一：
        test.searchState(stu,4);
        System.out.println("*************************");
        //问题二：
        test.Sort(stu);
        //遍历学生数组
        test.print(stu);
    }
    //遍历Student1[]数组的操作
    public void print(Student1[] stus){
       for (int i = 0; i < stus.length; i++){
            System.out.println(stus[i].info());
       }
    }

    //查找3年级学生信息
    public void searchState(Student1[] stus,int state){
        for (int i = 0; i < stus.length; i++){
            if (stus[i].state == state){
                System.out.println(stus[i].info());
            }
        }
    }
    //按成绩高低排序
    public void Sort(Student1[] stus){
        for (int i = 0; i < stus.length; i++){
            for (int j = 0; j < stus.length - 1; j++){
                if (stus[i].score > stus[j].score){
                    //如果需要换序，交换的是数组的元素，Student对象！！！
                    Student1 temp = stus[i];
                    stus[i] = stus[j];
                    stus[j] = temp;
                }
            }
        }
    }
}
class Student1{
    int number;//学号
    int state;//年级
    int score;//成绩

    //显示学生信息的方法
    public String info(){
        return "学号：" + number + "，年级：" + state + "，成绩" + score;
    }
}
