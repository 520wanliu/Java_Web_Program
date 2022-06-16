package demo3;

/*
* 类中方法的声明
 *
 * 方法：描述类应该具有的功能
 *
 * 1.举例
 * public void eat(){}
 * public void sleep(int hour){}
 * public String getName(){}
 * public String getNation(String nation){}
 * 2.方法的声明：权限修饰符 返回值类型 方法名（形参列表）{
 *                    方法体；
 *             }
 * 3.说明
 *       3.1 权限修饰符：
 *           Java的4种权限修饰符：private,public,protected,缺省
 *       3.2 返回值类型   有返回值 vs 无返回值
 *           3.2.1 如果方法有返回值，则必须在方法声明时，指定返回值类型，
 *                     同时，方法中需要使用return关键字来返回指定类型的变量或常量，“return 数据；”
 *                 如果方法没有返回值，则方法声明时，使用void来表示，通常没有返回值的方法中，
 *                     就不需要使用return，但是，如果使用return，只能“return;”：表示结束此方法的意思。
 *           3.2.2 我们定义方法该不该有返回值？
 *                 ① 根据题目要求     ② 具体问题具体分析
 *       3.3 方法名：属于标识符，遵循标识符的规则和规范，“见名知意”
 *       3.4 形参列表：方法可以声明0个或多个形参。（用逗号区分多个形参值）
 *           3.4.1 格式：数据类型1 形参1，数据类型2 形参2，...
 *           3.4.2 定义方法时，该不该定义形参？
 *                 ① 根据题目要求     ② 具体问题具体分析
 *       3.5 方法体：具体功能的实现
 *
 * 4. return关键字的使用：
 *       1. 使用范围：使用在方法体中
 *       2. 作用：① 结束方法；
 *               ② 针对于有返回值类型的方法，使用“return 数据”方式返回所要的数据
 *       3. 注意：return关键字后不可以声明执行语句
 * 5. 方法的使用中可以调用当前类的属性或方法
 *       特殊的：方法A中调用方法A：递归方法
 *       注意：方法里不可以定义方法
*/
public class a_OOPBase {

    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();

        //调用对象的结构：属性、方法
        //调用属性：对象.属性
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);
        System.out.println(p1.isMale);

        //调用方法：对象.方法
        p1.eat();
        p1.talk("chinese");

        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.isMale);

    }

    static class Person{
        //属性：对应类中的成员变量
        String name;
        int age = 2;
        boolean isMale;

        //行为：对应类中的成员方法
        public void eat(){
            System.out.println("人可以吃饭！");
        }
        public void sleep(){
            System.out.println("人可以睡觉！");
        }
        public void talk(String language){
            System.out.println("人可以说话，可以使用的语言是：" + language);
        }
    }
}
