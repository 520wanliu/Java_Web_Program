package part5.demo1;
/*
   接口的使用
     1.接口使用上满足多态性
     2.接口实际上是定义了一种规范（如何操作数据库的规范）

 */
public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);

        //2.创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());

        //3.创建了接口的匿名实现类的非匿名对象
        USB phone = new USB() {  //此时实现了匿名实现类USB，非匿名对象phone
            @Override
            public void strat() {
                System.out.println("手机开机");
            }
            @Override
            public void stop() {
                System.out.println("手机关机");
            }
        };
        com.transferData(phone);

        //4.创建了接口的匿名实现类的匿名对象
        com.transferData(new USB() {
            @Override
            public void strat() {
                System.out.println("mp3开始听歌");
            }

            @Override
            public void stop() {
                System.out.println("mp3听歌结束");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb) {  //USB usb = new Flash();
        usb.strat();
        System.out.println("实现具体的数据传输细节");
        usb.stop();
    }
}

interface USB {
    void strat();
    void stop();
}

class Flash implements USB {

    @Override
    public void strat() {
        System.out.println("启动U盘");
    }
    @Override
    public void stop() {
        System.out.println("关闭U盘");
    }
}

class Printer implements USB {

    @Override
    public void strat() {
        System.out.println("启动打印机");
    }
    @Override
    public void stop() {
        System.out.println("打印结束");
    }
}

