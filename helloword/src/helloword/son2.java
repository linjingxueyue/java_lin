package helloword;



/**
 * 
 * 	��ά�����ѧϰ
 *  �������ͱ����� Ҫôû�д�ֵ��ΪNull��Ҫô��ֵ��Ϊĳ������ĵ�ֵַ��
 *
 */
public class son2 {
	public static void main(String[] args) {
	
		System.out.println("------------------------------");
		int[] ids = {1,2,3,5};
		System.out.println(ids[1]);
		int ids2[][] = new int[3][];
		ids2[0] = new int[4];
		ids2[1] = new int[5];
		ids2[1][4] = 1000;
		System.out.println(ids2[0]);
		System.out.println(ids2[1][4]);
		String[] ids3 = new String[4];
		System.out.println(ids3);
		System.out.println("---------------------");
		/* ʹ�ù����������������� */
		hellow_son_class empOne = new hellow_son_class("RUNOOB1");
		hellow_son_class empTwo = new hellow_son_class("RUNOOB2");
	 
	      // ��������������ĳ�Ա����
	      empOne.empAge(26);
	      empOne.empDesignation("�߼�����Ա");
	      empOne.empSalary(1000);
	      empOne.printEmployee();
	 
	      empTwo.empAge(21);
	      empTwo.empDesignation("�������Ա");
	      empTwo.empSalary(500);
	      empTwo.printEmployee();
	}
}
