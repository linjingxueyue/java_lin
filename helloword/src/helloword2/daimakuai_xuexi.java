package helloword2;
/**
 * 	������ѧϰ��
 * 		
 * 		1�� ���������ã�������ʼ���ࡢ����
 * 		2�� �������������εĻ���ֻ����static��
 * 		3�� ��Ϊ�� ��̬�������Ǿ�̬�����
 * 
 * 		4��  ��̬����飺
 * 					������ļ��ض�ִ�С�
 * 					ֻ��ִ��һ�Ρ�
 * 					һ������ڲ����Զ����� ��̬����顣
 * 					�����������ʱ�򣬳�ʼ����ľ�̬����
 * 					��̬������ִ�������ڷǾ�̬������ִ��
 * 				    ֻ�ܵ��þ�̬�����Ի��߷���
 * 					
 * 		5��  �Ǿ�̬����飺
 * 					���Ŷ���Ĵ�����ִ��
 * 					ÿ����һ�����󣬶�ִ��һ�ηǾ�̬�����
 * 					�����ڴ�������ʱ�򣬶��ڶ�������Խ��г�ʼ����
 * 					����ڲ����Զ������Ǿ�̬����顣�����ն�����Ⱥ�˳�����ִ�У� 
 * 					���Ե��÷Ǿ�̬�����Ի򷽷�Ҳ���Ե��þ�̬�����Ի򷽷���
 * 
 *     6�������Կ��Ը�ֵ��λ�ã�
 *     		1�� Ĭ�ϳ�ʼ��
 *     		2����ʽ��ʼ��
 *     		3����������ʼ��
 *     		4��ͨ������.���Եķ�ʽ��ֵ
 *     		5��������ڽ��г�ʼ��
 * @author PC
 *
 */
class Test_block{
	int age ;
	public static String name="linjing";
	public Test_block() {
		
	}
	public Test_block(int age ) {
			this.age = age;
	}
	// ��̬����飺
	static {
		name = "!!!!!!!";
		System.out.println("adsasdasdasd"+name);
	}
	// �Ǿ�̬����飺
	{
		age = 20;
		name = "!!!!!!!";
		System.out.println(name);
	}
}
public class daimakuai_xuexi {
	public static void main(String[] args) {

		Test_block.name = "------------";
		Test_block b1 = new Test_block();
		Test_block b2 = new Test_block();
		System.out.println("******************************************");
		Test_block b3 = new Test_block(40);
		System.out.println(b3.age);
		
	}
}