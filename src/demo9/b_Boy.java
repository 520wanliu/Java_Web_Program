package demo9;

public class b_Boy {
    private String name;
    private int age;

    public b_Boy(){

    }
    public b_Boy(String n,int a){
        name = n;
        age = a;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void marry(b_Girl girl){
        System.out.println("我想娶"+girl.getName());
    }

    public void shout(){
        if (age >= 22)
            System.out.println("你可以去领证了！");
        else System.out.println("你还是先谈着吧。");
    }
}
