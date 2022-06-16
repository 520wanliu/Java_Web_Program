package part2.demo8;

public class Student extends Person{
    String major;
    int id = 1002;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name,int age,String major) {
//        this.name = name;
//        this.age = age;
        super(name, age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生应多吃营养的食物");
    }
    public void study() {
        System.out.println("学生学习东西");
        this.eat();
        super.eat();
    }
    public void show(){
        System.out.println("name = " + name + ",age = " + age);
        System.out.println("idS = " + id);
        System.out.println("idP = " + super.id);
    }
}
