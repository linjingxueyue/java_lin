package helloword2;
/**
 *  ����jiekou_xuexi
 *  
 *  1: ��̬������
 *  2: ���� �ӿڵ�����
 * @author PC
 *
 */


public class jiekou_xuexi2 {
	public static void main(String[] args) {
		Computer computer = new Computer();
		// ��̬ ���ֵ����� 
		computer.transer(new Flash());
		System.out.println("-----------------------------------------------------------");
		computer.transer(new USB() {
			
			@Override
			public void start() {
				System.out.println("���� �ӿ� �� start");
			}
			
			@Override
			public void end() {
				System.out.println("���� �ӿ� �� end");
				
			}
		});
	}
}

class Computer{
	public void transer(USB usb) {
		usb.start();
		System.out.println("���ڽ��д�������");
		usb.end();
	}
}
interface USB{
	void start();
	void end();
}

class Flash implements USB{

	@Override
	public void start() {
		System.out.println("Flsh usb start");
	}

	@Override
	public void end() {
		System.out.println("Flash usb end ");
	}
	
}