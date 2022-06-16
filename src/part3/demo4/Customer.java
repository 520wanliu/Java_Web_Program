package part3.demo4;

public class Customer {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Customer(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    /*
    //重写的原则：比较两个对象的实体内容(即name和age)是否相同
    //手动实现equals()的重写
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Customer){
            Customer cust = (Customer) obj;
//            //比较两个对象的属性是否相同
//            if (this.name.equals(cust.name) && this.age == cust.age){
//                return true;
//            }else {
//                return false;
//            }
            return this.name.equals(cust.name) && this.age == cust.age;
        }else {
            return false;
        }
    }*/

    //手动重写equals()方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && name.equals(customer.name);
    }
/*
    //手动实现
    @Override
    public String toString() {
        return "Customer[name = " + name + ",age = " + age + "]";
    }*/
    //自动实现

    @Override
    public String toString() {
        return "Customer{name=" + name + '\'' +", age=" + age +'}';
    }
}
