package part2.demo5;

public class Student extends Person{
    String major;

    public Student(){

    }
    public Student(String major) {
        this.major = major;
    }
    //对父类中eat方法进行重写
    @Override
    public void eat(){
        System.out.println("学生要学习，就得多吃饭");
    }
    public void study(){
        System.out.println("学习，专业是：" + major);
    }
}
