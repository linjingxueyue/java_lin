package helloword2;
/**
 *  ��������д��
 *  	���������������� Ȩ�����η�  ����ֵ ������  �������б�{
 *  							������
 *  					 }
 *  	1��������д�ķ����� ������ �� �����б� ��  ���౻��д�ķ���һ��
 *  
 *  	2��������д������Ȩ�����η� ��С�� ���౻��д������Ȩ�����η�
 *  			��������� ���� ������д ���౻����Ϊprivate�ķ���
 *  
 *  	3�����෵��ֵ������void����������д�ķ���ֵ���ͱ�����void
 *  	   ���෵��ֵ������A���ͣ���������д�ķ���ֵ���ͱ�����A���A�������
 *  		����ķ���ֵ�����ǻ����������ͣ� ������д�����ķ���ֵ���ͱ�������ͬ��������
 *  
 *  	4��������д�����׳����쳣���ͣ������� ���౻��д�����׳����쳣����
 *  ������������������������������������������������������������������������������������
 *  	����͸���ͬ����ͬ�����ķ�����ֻ�з�staticʱ�ſ�����д��staticʱ������д��������أ�
 * @author PC
 *
 */
class Mother{
	public void eat() {
		System.out.println("eat");
	}
	public Object talk() {
		return null;
	}
	public static void run() { 
		
	}
}
class son extends Mother{
	
	public void eat() {
		System.out.println("eat2 ...");
	}
	
	public void eat(String str) {
		System.out.println(str);
	}
	
	public String talk() {
		return null;
	}
	public static void run() { 
			
		}
	}
public class overwrite {

		public static void main(String[] args) {
		
			son s = new son();
			s.eat();
			s.eat("sssss");
		}
}
