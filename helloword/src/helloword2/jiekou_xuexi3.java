package helloword2;

/**
 *   接口的应用：
 *   	设计模式 - 》 代理模式的理解 
 * @author PC
 *
 */

public class jiekou_xuexi3 {
	public static void main(String[] args) {
		ProxyServer proxyServer = new ProxyServer(new Server());
		proxyServer.browse();
	}
}

interface NetWork{
	void browse();
}

//被代理类 （也就是想要指定代理的类）
class Server implements NetWork{

	@Override
	public void browse() {
		System.out.println("真实的服务器访问网络");		
	}
	
}
// 代理类 
class ProxyServer implements NetWork{
	private NetWork network;
	
	public ProxyServer(NetWork network) {
		super();
		this.network = network;
	}
	
	public void check() {
		System.out.println("链接网络之前的校验 ");
	}
	@Override
	public void browse() {
		check();
		System.out.println("代理服务器 开始 请求连接 。。。。。。");
		network.browse();
	}
	
}