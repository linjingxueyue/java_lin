package helloword2;
/**
 *  a.super �����⣺
 *  
 *  	1:������ֱ��ʹ�� ���ԣ���������this.���ԣ���ʱ���������в��Ҹ����ԣ�������ʱ����ȥ�����в��Ҹ����ԡ�
 *    ֱ��ʹ��super.���Եķ�ʽ������ζ�Ų��������в�ѯ��ֱ���ڸ����в�ѯ.
 *    ��������û����д���෽��������ʱ��ʹ�� this����super �������Ժͷ���û������
 *    
 *    	2: ��������д�˸��෽����������Ҫ���ø��౻��д�ķ���ʱ�򣬿���ֱ����super.��������ʽ����
 *    
 *      3: ���ڹ��������������м�û��ʹ��super()Ҳû��ʹ��this()��ʱ��Ĭ��ʹ��super();
 *      
 *      4: ����Ķ���������У�����һ��������ʹ����super()��ԭ��һ����n���������������n-1��������ʹ��this()
 *      
 *   b.��������ʵ��������
 *   
 *   	1:�ӽ�����������̳��ԣ���
 *   		����̳и���֮�󣬾ͻ�ȡ�˸��������������Ի򷽷�
 *   		 ������������ڶѿռ��У��ͻ���ظ���������������
 *   
 *      2���ӹ�����������
 *      	��ͨ�����๹���������������ʱ��һ����ֱ�ӻ��ӵĵ����丸�๹�������������ø���ĸ���Ĺ�����
 *        һֱ��������java.lang.object���еĹ�����Ϊֹ��������ع����и���Ľṹ�����Բſ��Կ����ڴ����и����
 *        �ṹ���������ſ��Խ��е���
 *        
 *        ע�⣺ ��Ȼ�����������ʱ�򣬵����˸���Ĺ�������������ʼ���վʹ�����һ�����󣬼�Ϊnew���������
 *   
 *   c. super(�β��б�) ���ø���ָ���Ĺ�����
 *      this(�β��б�)  ���ñ��������������
 * @author PC
 *
 */
class Father{
	public Father() {
		System.out.println("+++++++");
	}
	public Father(int nu) {
		System.out.println("------");
	}
	int id = 1001;
}
public class super_lijie extends Father {
	int id = 1002;
	public super_lijie() {
		System.out.println("this.id: "+ id+" "+this.id+" super.id: "+super.id);
	}
	public super_lijie(int numer) {
		System.out.println("this.id: "+ this.id+" super.id: "+super.id);
	}
	public static void main(String[] args) {
		super_lijie sl = new super_lijie();
		super_lijie s2 = new super_lijie(10);
	}
}