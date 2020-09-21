package helloword2;

/**
 *   �ӿڵ�Ӧ�ã�
 *   	���ģʽ - �� ����ģʽ����� 
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

//�������� ��Ҳ������Ҫָ��������ࣩ
class Server implements NetWork{

	@Override
	public void browse() {
		System.out.println("��ʵ�ķ�������������");		
	}
	
}
// ������ 
class ProxyServer implements NetWork{
	private NetWork network;
	
	public ProxyServer(NetWork network) {
		super();
		this.network = network;
	}
	
	public void check() {
		System.out.println("��������֮ǰ��У�� ");
	}
	@Override
	public void browse() {
		check();
		System.out.println("��������� ��ʼ �������� ������������");
		network.browse();
	}
	
}