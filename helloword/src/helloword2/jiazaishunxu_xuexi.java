package helloword2;


/**
 *   ����������� �۲�ִ��˳��:
 *   	�� �� �� �ӡ���̬����
 * @author PC
 *
 */
class Root{
	static {
		System.out.println("Root�ľ�̬��ʼ����");
	}
	{
		System.out.println("Root ����ͨ��ʼ����");
	}
	public Root(){
		System.out.println("Root���޲ι�����");
	}
}

class Mid extends Root{
	static {
		System.out.println("Mid�ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid ���޲γ�ʼ����");
	}
	public Mid() {
		System.out.println("Mid �� �޲ι�����");
	}
	public Mid(String msg) {
		this();
			System.out.println("Mid�Ĵ��ι�������msg: "+msg);
	}
}

class Leaf extends Mid{
	static int age;
	static {
		System.out.println("leaf�ľ�̬��ʼ����1");
	}
    {
		System.out.println("leaf����ͨ��ʼ����");
	}
	static {
		System.out.println("leaf�ľ�̬��ʼ����2");
	}
    public Leaf() {
    	super("linjing");
    	System.out.println("Leaf ������");
    }
}
public class jiazaishunxu_xuexi {
	public static void main(String[] args) {
//		new Leaf();
	order o1 = new order();
	System.out.println(o1.id);
	}
}

class order{
	{
		id= 4;
	}
	int id = 3;
}