package helloword2;
/**
 * a. this���� ���Ժͷ�����
 *  	 this����⣺ ��ǰ���� �� ��ǰ���ڴ����Ķ��������ڹ����������������
 *  	 ����ķ����У����ǿ���ʹ�á�this.���ԡ���this.�������ķ�ʽ�����õ�ǰ���Ի򷽷������ǣ�
 *     ͨ������£����Ƕ�ѡ��ʡ��"this."��
 *     
 * b.this�����������ù�����
 * 		��һ���������п���ͨ����this(����)������ʽ��������һ����������
 * 		ע�⣺ this() ������ʽ��������ڹ������ڲ������С�
 * 
 * @author PC
 *
 */

public class this_xuexi {
	public static void main(String[] args) {
		Test t1 = new Test("linjing");
	}
}

 class Test{
	public Test() {
		// ��ʼ��ʱ����Ҫִ������40�д��롣����
		System.out.println("������Test()ִ��");
	}
	public Test(String name) {
		this();
		System.out.println("������ Test(String name)ִ��");
	}
	public Test(String name,int age) {
		
	}
}
