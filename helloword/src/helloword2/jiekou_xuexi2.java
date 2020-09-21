package helloword2;
/**
 *  接着jiekou_xuexi
 *  
 *  1: 多态的理解
 *  2: 匿名 接口的理解
 * @author PC
 *
 */


public class jiekou_xuexi2 {
	public static void main(String[] args) {
		Computer computer = new Computer();
		// 多态 体现的例子 
		computer.transer(new Flash());
		System.out.println("-----------------------------------------------------------");
		computer.transer(new USB() {
			
			@Override
			public void start() {
				System.out.println("匿名 接口 的 start");
			}
			
			@Override
			public void end() {
				System.out.println("匿名 接口 的 end");
				
			}
		});
	}
}

class Computer{
	public void transer(USB usb) {
		usb.start();
		System.out.println("正在进行传承数据");
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
