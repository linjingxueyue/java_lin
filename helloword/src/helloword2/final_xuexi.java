package helloword2;


/**
 *  final ����⣺
 *  
 *  	1�� �����������εĽṹ�� �ࡢ������ ����
 *  	
 *  	2�� �������ʱ��
 *  		˵�����಻�ܱ����������̳С�
 *  			eg: String�ࡢSystem�ࡢStringBuffer��
 *  
 *      3�� final ���η�����
 *      		��ʾ �˷��������Ա���д.���ǿ��Ա����ء�
 *      			eg: GetClass() ����
 *      
 *      4�� final �������α����� ��ʱ�ı����ͳ�֮Ϊ����.
 *      		���� final ���εı���������и�ֵ����ֵ��λ���У���ʽ��ʼ����������ڲ���������������.
 *      
 * @author PC
 *
 */
public class final_xuexi {

}

class AA{
	// final int age ;   -- error
	final int age = 10;
	final String nameString ;
	final int score;
	{
		nameString = "linjing";
	}
	public AA(){
		score = 10;
	}
	public final void show() {
		
	}
}

class BB extends AA {
	public final void show(int a) {
		
	}
}