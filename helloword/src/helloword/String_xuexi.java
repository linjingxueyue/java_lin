package helloword;

public class String_xuexi {
	public static void main(String[] args) {
		String name = "linjing";
		String name2 = new String("linjing");
		
		System.out.println(name == name2);
		System.out.println("_____________________________________");
		/**
		 * ��Ϊ�����е�s3��s6�е�"helloworld�������ַ��������������ڱ����ھͱ�ȷ���ˣ�����s3==s6Ϊtrue��
		 * ��"hello����"world��Ҳ�����ַ�����������һ���ַ����ɶ���ַ����������Ӷ���ʱ��
		 * ���Լ��϶�Ҳ���ַ�������������s5Ҳͬ���ڱ����ھͱ�����Ϊһ���ַ���������
		 * ����s5Ҳ�ǳ�������"helloworld����һ������
		 * ����s4 ����������ʱ���ȷ����׼ȷֵ�������ǳ�������"helloworld"������
		 */
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		String s4 = s1 + s2;
		String s5 = "hello" + "world";
		String s6= "helloworld";
		System.out.println(s3 == s6);
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		
	}
}
