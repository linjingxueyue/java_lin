package helloword2;

/**
 * 	a.��̬�Ե����⣺
 * 		1��һ������Ķ�����̬
 *  
 *  b.��Ϊ��̬�ԣ�
 *   	1�������������ָ������Ķ��� ������Ķ��󸳸���������ã�
 *   			�������Ӹ���ͬ��ͬ�����ķ���ʱ�򣬵��õ���������д��ķ��� ----- ���ⷽ������
 *   			ֻ�ܵ��ø��������еķ�������ͬ�������� ���еķ��� 		----- ���뿴��ߣ����п��ұ�
 * 
 *  c. ��̬��ʹ�ã�
 *  		1�����˶���Ķ�̬���Ժ������ڱ����ڣ�ֻ�ܵ��ø����������ķ�������ִ���ڣ�d���õ���������д
 *  	  ���ķ���
 *  	:	2�����˶���Ķ�̬���Ժ��ڴ���ʵ���ϼ������Ӷ���������Լ����з����������ڱ�������Ϊ�������ͣ�
 *  	  ���±���ʱ��ֻ�ܵ��ø��������������Ժͷ��������������ν���أ�
 *  			����취�� ʹ������ǿ��ת����Ҳ��������ת�͡���ǿ��ת��ʱ����ܱ����� ������ ��̬�������е�����
 *  
 *  d. ��̬��ʹ��ǰ�᣺
 *  		1����ļ̳й�ϵ
 *  		2��Ҫ�з�������д����զû��Ҫʹ�ö�̬��
 *  
 *  e.  ΪʲôҪ�ж�̬�ԣ�				
 *  		----  �� func ������ʹ��
 *  
 *  f.  ����Ķ�̬��ֻ�������� ������������������	��
 *  									-----	���Եĵ��ã���������ж��ǿ����
 *  	��̬����һ������ʱ��Ϊ���Ǳ�������Ϊ
 *  		 ��̬ʱ�������ĵ�����������ʱ��ȷ���ġ�				-- ��̬��
 *  
 *  g.  ��������
 *  	     ����������ظ����ͬ����ͬ�����ĺ���	
 *  
 *  h. ��װ�Խ�������ܲ��ܵ��õ����⣬�̳����ǽ���ܲ��ܻ�ȡ������	
 * @author PC
 *
 */
class Person{
	String name;
	int age;
	int id=1001;
	public void eat() {
		System.out.println("�Է�");
	}
	public void run() {
		System.out.println("��");
	}
}
class Man extends Person{
	boolean smoking;
	int id=1002;
	public void earnMony() {
		System.out.println("��Ǯ");
	}
	public void eat() {
		System.out.println("��Է�");
	}
	@Override
	public void run() {
		System.out.println("����");
	}
}
class Womman extends Person{
	boolean isbeuty;
	public void goshopping() {
		System.out.println("ϲ������");
	}
	@Override
	public void eat() {
		System.out.println("�ٳ�");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
}
public class duotai_xuexi {
	public void func(Person person) {
		person.eat();
		person.run();
	}
	public static void main(String[] args) {
		// ************************************    ������ ���󴴽������
		Person p1 = new Person();
		p1.eat();
		Man m1 = new Man();
		m1.earnMony();
		System.out.println("*************************************************************");
		// ***************************************  ��̬������
		//      ���������ָ�� ����� ����
		Person p2 = new Man();
		p2.eat();	
		p2.run();
		System.out.println(p2.id);
//		p2.earnMony()						-- error ���ܵ����������еķ��� 
		Person p3 = new Womman();
		p3.eat();
//		Man m4 = new Person();              ----- error 
		// ***************************************  ��̬��ʹ�� -----git2
		System.out.println("*************************************************************");
		duotai_xuexi d1 = new duotai_xuexi();
		d1.func(new Man());
		d1.func(new Womman());
		// ***************************************  ��̬������ 
		System.out.println("*************************************************************");
//		p2.earnMony()						-- error   ��ν���أ�
		Man m2 = (Man)p2;
		m2.earnMony();
		System.out.println(p2 instanceof Womman);
//		Womman w1 = (Womman)p2;				-- Error ����ת���쳣 
	}
}