package helloword2;
/**
 *  main() ������ʹ��˵����
 *  	1�� ��Ϊ��������
 *  	2�� Ҳ��һ����ͨ�ľ�̬������
 *  	3�� һ���ļ��У�ÿ���඼������һ��main����������ʱ���ֶ�ѡ����Ϊ��ڵ�main����
 *  	4�� ��Ҳ˵���� ��̬��������ֻ�ܵ��þ�̬���Ի��߷����������Ҫ���÷Ǿ�̬�ṹ����ͨ��new ����ʵ���ķ�ʽ
 *  	5��mian()������Ҳ������Ϊ ���������̨�����ķ�ʽ
 *  	
 * @author PC
 *
 */
public class main_xuexi {
	public void show() {
		System.out.println("ֻ��ͨ��new ����ʵ���ķ�ʽ���ſ����� ��̬������ ���÷Ǿ�̬�ṹ");
		
	}
	public static void main(String[] args) {	// ���
		Main.main(new String[100]);
		// ��Ҳ˵���� ��̬��������ֻ�ܵ��þ�̬���Ի��߷����������Ҫ���÷Ǿ�̬�ṹ����ͨ��new ����ʵ���ķ�ʽ
//		show()			--- error 
		main_xuexi m1 = new main_xuexi();
		m1.show();
	}
}
class Main{
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			args[i]="args_"+i;
			System.out.println(args[i]);
		}
	}	
}