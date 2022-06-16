package part3.demo2;


public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());
    }


    public void method(Personal e){
        String info = e.getInfo();
        System.out.println(info);

        if (e instanceof Graduate) {
            System.out.println("a graduate student");
            System.out.println("a student");
            System.out.println("a person");
        } else if (e instanceof Student) {
            System.out.println("a student");
            System.out.println("a person");
        }else {
            System.out.println("a person");
        }
    }
}

class Personal
{
    protected String name = "person";
    protected int age = 50;
    public String getInfo(){
        return "Name:" + name+ "\nage:" + age;
    }

}

class Student extends Personal {
    protected String school = "pku";
    public String getInfo(){
        return "Name:" + name + "\nage:" + age + "\nschool:" + school;
    }
}

class Graduate extends Student {
    protected String major = "IT";
    public String getInfo(){
        return "Name:" + name+ "\nage:" + age + "\nschool:" + school + "\nmajor:" + major;
    }
}
