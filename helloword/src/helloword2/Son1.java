package helloword2;

import helloword.son4_object_01;

/**
 *  �� helloword�µ�son4_object_01.java�ļ�һ��������η���ʹ�÷�Χ
 * @author PC
 *
 */


/**
 * ��protected���εķ��������ԣ���ͬһ���ڿɱ����ʺͼ̳С���ͬ���ڣ�����ɼ̳У������಻�ܷ��ʡ�
 * @author PC
 *
 */
class son2{
	protected  String name = "sad";
}
public class Son1 extends son4_object_01 {
	
	public void test(son4_object_01 s) {
//		s.name4
	}
	public static void main(String[] args) {
		son2 s2 = new son2();
		System.out.println(s2.name);
		Son1 son1 = new Son1();
		System.out.println(son1.name4);
		son4_object_01 s1 = new son4_object_01();
//		System.out.println(s1.name4);
	}
}