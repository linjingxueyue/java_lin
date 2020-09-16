package helloword2;

import helloword.son4_object_01;

/**
 *  与 helloword下的son4_object_01.java文件一起测试修饰符的使用范围
 * @author PC
 *
 */


/**
 * 被protected修饰的方法和属性，在同一包内可被访问和继承。不同包内，子类可继承，非子类不能访问。
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