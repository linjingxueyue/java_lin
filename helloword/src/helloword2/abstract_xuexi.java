package helloword2;

/**
 *  abstract �����⣺
 *  
 *  	1�� �������εĽṹ�У� �ࡢ����
 *  
 *  	2�� abstract ������ ʱ���ص㣺
 *  		1�����಻��ʵ����
 *  		2�����༴ʹ���ܹ�ʵ��������Ҳ�й�������
 *  		3�����������У������ṩ����������࣬���������ʵ�����������صĲ�����
 *  
 *  	3��abstract ���η�����
 *  		1�����󷽷�ֻ�з�����������û�з����塣
 *  		2���������󷽷����࣬һ����һ�������ࡣ��֮���������п���û�г��󷽷���
 *  		3: ����ֻ����д�˸��������еĳ��󷽷��󣬲ſ��� ʵ������
 *  		4�� ������û����д���������еĳ��󷽷��������Ҳ��һ�������ࡣ
 *      4: abstract �������εĽṹ��
 *      		���ԡ�˽�з�����������
 *      		��̬������final����������������������д����
 *      		final �ࣨ���ܱ��̳У�
 *  ----------------------------------------------------------------------
 *  	��Java�о�̬�������Ա��̳У����ǲ��ܱ����ǣ���������д��
		���������Ҳ����һ���������͡��������������б�����֮��ͬ�ľ�̬��������ô������ʵ����ֻ�ǽ������еĸ�ͬ���������������أ�
	 ������д��
		��������ָ���������ʱ��ֻ����ø���ľ�̬���������ԣ����ǵ���ΪҲ�������ж�̬��
 * @author PC
 *
 */
public class abstract_xuexi {
	public static void main(String[] args) {
		// ����һ��������
		 AA2 aa2 = new AA2() {
			 @Override
			 public void work() {
				 System.out.println("��������� �Ĵ���");
			 };
		 };
		 aa2.work();
	}
}

abstract class  AA2{
	public static void show() {
		System.out.println("AA2");
	}
	public abstract  void  work();
}