package part5.demo1;
/*
   接口的应用：代理模式
      代理设计就是为其他对象提供一种代理以控制对这个对象的访问。
   工厂模式：实现了创建者与调用者的分离，即将创建对象的具体过程屏蔽隔离起来，达到提高灵活性的目的
   工厂模式分类：简单工厂模式：用来生产同已登记结构中的任意产品。（对于增加新的产品，需要修改已有代码）
              工厂方法模式：用来生产同一等级结构中的固定产品。（支持增加新的产品）
              抽象工厂模式：用来生产不同产品族的全部产品。（对于增加新的产品，无能为力来支持增加产品族）
 */
public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browser();
    }
}
//被代理类
interface NetWork{
    public void browser();
}
class Server implements NetWork{

    @Override
    public void browser() {
        System.out.println("采用真实的服务器访问网络");
    }
}
//代理类
class ProxyServer implements NetWork{

    private NetWork work;

    public ProxyServer(NetWork work) {
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前检查网络");
    }
    @Override
    public void browser() {
        check();
        work.browser();
    }
}