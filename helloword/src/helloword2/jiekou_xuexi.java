package helloword2;

/**
 * 	�ӿ�(interface)�����⣺
 * 
 * 		0�� �ӿ� �� �� �����ֵȼ���(����) �Ľṹ�� ���� һ����ĸ���ֻ����һ�����ӿڿ����ж����
 * 
 * 		1�� ���JAVAû�ж�̳е�ȱ�㣬
 * 
 * 		2�� �ӿڵĳ�Ա��
 * 			 JDK7 �� ��ǰ�� ֻ�ܶ��� ȫ�ֳ��� �� ���󷽷�.
 * 						 ȫ�ֳ����Ķ������ʡ�� public static final �ؼ��� 
 * 						 ���󷽷�����ʡ�� public abstract �ؼ���
 * 					
 * 			 JDK8���Ժ�   ��7�е����⣬���ɶ��徲̬������Ĭ�Ϸ�����
 * 		
 * 		3: �ӿ��в��ܶ��幹��������ζ�Ų�����ʵ����
 * 
 * 		4�� java�����У��ӿ�ͨ������ȥʵ�ֽӿڵķ�ʽ ��ʹ�ýӿڡ�
 * 			    �����ʵ���˽ӿ������еĳ��󻯷������������Խ���ʵ����
 * 				�������û����д�����еĳ��󻯷������������Ȼ��һ�������ࡣ
 * 
 * 		5: �ӿں� �ӿ� ֮�� �������Ƕ�̳еġ�
 * 
 *      6�� �ӿ� �ľ���ʹ�ã��������ֶ�̬�ԡ�
 *      		�� jiekou_xuexi2
 *      7���ӿ�ʵ���ϣ����Կ���һ�� �淶��
 *      
 *      8���ӿ� ������� ������
 *      		��ͬ�㣺
 *      		��ͬ��
 * @author PC
 *
 */
public class jiekou_xuexi {
	public static void main(String[] args) {
		// ����ֱ�ӵ��ýӿ�
			System.out.println(Flyable.MAX_SPEED);
			Plane p1 = new Plane();
			System.out.println(p1.MAX_SPEED);
			p1.fly();
			p1.attack();
	}
}

class Plane implements Flyable,Attackable,CC3{

	@Override
	public void fly() {
		System.out.println("fly -----");
	}

	@Override
	public void stop() {
		System.out.println("stop -----");
		
	}

	@Override
	public void attack() {
		System.out.println("attack -----");
		
	}

	@Override
	public void showA() {
		System.out.println("�ӿ�CC3�̳��Խӿ�AA3�� ���� -----");
		
	}

	@Override
	public void showB() {
		System.out.println("�ӿ�CC3�̳��Խӿ�BB3�� ���� -------");
		
	}
	
}

interface Flyable{
	//  ȫ�ֳ���
	 int MAX_SPEED = 7900;
	
	public static final int MIN_SPEED = 0;
	
	// ���󷽷�
	public abstract void fly();
	
	void stop();
	
}
interface Attackable{
	void attack();
}

// ------------------------------- �ӿڶ�̳е����� -------------------------------
interface AA3{
	void showA();
}
interface BB3{
	void showB();

}
interface CC3 extends AA3,BB3{
	
}