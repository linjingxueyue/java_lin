package helloword2;
/**
 *  �������ģʽ��ѧϰ
 *     
 *     1: ����
 *     		��ȡһ���ķ�������������������ϵͳ�У�����ĳ����ֻ����һ������ʵ����
 *     
 *     2.���ʵ�֣�
 *     		1: ����ʽ Bank_01
 *     		2������ʽ Bank_02
 *    
 *     3:��������ʽ�����ʽ
 *     		����ʽ�� 
 *     			������ �������ʱ�������
 *     			�ô��� �̰߳�ȫ��
 *          ����ʽ��
 *          	�ô��� �ӳٶ���Ĵ�����
 *          	������ �̲߳���ȫ�� 		---�� �������߳�ʱ���ٽ����޸ġ�
 *    
 *     4������ģʽ�ľ�����
 *     		java.lang.Runtime	������ʽ��
 * @author PC
 *
 */

// ����ʽ Bank_01
class Bank_01{
	// 1:˽�л���Ĺ�����---- �������������ֱ��new �������
	private Bank_01() {
		
	}
	// 2: �ڲ����� ��̬ ���ʵ��
	private static Bank_01 instanceBank_01 = new Bank_01();
	
	// 3:�ṩ������ ��̬ ������������Ķ���
	public static Bank_01 getInstance() {
		return instanceBank_01;
	}
}

// ����ʽ Bank_02
class Bank_02{
	// 1:˽�л���Ĺ�����---- �������������ֱ��new �������
		private Bank_02() {
			
		}
		// 2: ���� ��̬ ���ʵ��
		private static Bank_02 instanceBank_02 = null;
		
		// 3:�ṩ������ ��̬ ������������Ķ���
		public static Bank_02 getInstance() {
			if(instanceBank_02 == null) {
				instanceBank_02 = new Bank_02();
			}
			return instanceBank_02;
		}
}
public class danlimoshi_xuexi {
	public static void main(String[] args) {
		Bank_01 b1 = Bank_01.getInstance();
		Bank_01 b2 = Bank_01.getInstance();
		System.out.println(b1==b2);
		System.out.println("------------------------------------------------------");
		Bank_02 b3 = Bank_02.getInstance();
		Bank_02 b4 = Bank_02.getInstance();
		System.out.println(b3==b4);
	}
}