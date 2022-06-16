package demo9;

public class b_Girl {
    private String name;
    private int age;

    public b_Girl(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void marry(b_Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }

    /**
     * @Description 比较两个对象的大小
     * @param girl
     * @return  正数：当前对象大； 负数：当前对象小；  0：当前对象与形参对象相等
     */

    public int compare(b_Girl girl){
       /* if (this.age > age)
            return 1;
        else if (this.age < age)
            return -1;
        else return 0;*/

        return this.age - girl.age;
    }
}
