package helloword;

import org.graalvm.compiler.nodes.NodeView.Default;

import sun.jvm.hotspot.ui.action.ShowAction;

/**
 * 
 * 
 *  java ��������ѧϰ
 *  
 *  a.ѧϰ·�ߣ�
 *  	1�� Java �༰��ĳ�Ա�� ���ԡ�������������������顢�ڲ���
 *  	2�� ������������������ ��װ���̳С���̬��������
 *  	3�������ؼ��֣� this super static final abstract interface ��
 *  
 *  
 *  b.��Ա���������ԣ���ֲ�����
 *  	1������λ�ò�ͬ
 *  		��Ա���������ԣ��� ֱ�����������{}�ڲ���
 *  		�ֲ�������  �����ڷ����ڡ������βΡ�������ڡ��������ڡ��������βεı���
 *  	2�� ����Ȩ�����η��Ĳ�ͬ
 *  		��Ա���������ԣ��� ��������������ʱ��ָ����Ȩ�ޣ�ʹ��Ȩ�����η������õ����η��� private ��public�� default�� protected 
 *  		�ֲ������� ������ʹ��Ȩ�����η�
 *      3: Ĭ�ϳ�ʼ��ֵ������
 *      	��Ա���������ԣ��� �����������������г�ʼ��ֵ�ġ�
 *      	�ֲ�������  �޳�ʼ��ֵ�������Լ���ʼ���� ������ǰ�����ʼ����
 *      4�����ڴ��м��ص�λ�ò�ͬ
 *      	��Ա���������ԣ������ص��ѿռ���
 *      	�ֲ�������  ���ص�ջ�С�
 * 
 *  c.�����п���ֱ�ӵ������е����Ի��߷���   
 *  
 *  d. �ݹ�ĸ��� �ݹ�ʹ��ʱ�򣬼��������޷���ݹ���С�
 *  
 *  e. ���η���ʹ�÷�Χ�� ------- ���η��������༰����ڲ��ṹ�ڵ���ʱ�򣬿ɼ��ԵĴ�С
 *  	�ࣺpublic��ȱʡ
 *      
 * @author PC
 *
 */
public class son4_object_01 {
	// ��Ա����

	public String name = "linjing";
	
	private String name2 = "linjing2";
	
	String name3 = "linjing3";
	
	protected String name4 ="linjing4";
	int age;
	
	
	public son4_object_01() {
		System.out.println("------");
	}
	
	public void talk(String msg) {      // �βΡ��ֲ�����
		// ֱ�ӵ������е����Ի��߷���
		System.out.println(name);
		return ;
	}
	/**
	 * �ɱ�����βεķ�����
	 */
	public void show(int ... numbers) {
		System.out.println("numbers: "+numbers[0]+"   "+numbers[1]);
	}
	/**
	 * 	�ݹ���������� 
	 * @return
	 */
	public int getnum(int n) {
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return 4;
		}else {
			return 2*getnum(n-1)+getnum(n-2);
		}
	}
	public static void main(String[] args) {
		son4_object_01 s4 = new son4_object_01();
		System.out.println(s4.name4);
		s4.talk("aaa");
		s4.show(new int[] {1,2,3,4});
		s4.show(1,2,3,4);
		System.out.println("s4.getnum(10): "+s4.getnum(10));
	}
	
}