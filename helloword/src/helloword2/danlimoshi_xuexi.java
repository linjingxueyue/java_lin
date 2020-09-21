package helloword2;
/**
 *  单例设计模式的学习
 *     
 *     1: 定义
 *     		采取一定的方法，抱枕在整个软件系统中，对于某个类只存在一个对象实例。
 *     
 *     2.如何实现：
 *     		1: 饿汉式 Bank_01
 *     		2：懒汉式 Bank_02
 *    
 *     3:区分懒汉式与饿汉式
 *     		饿汉式： 
 *     			坏处： 对象加载时间过长。
 *     			好处： 线程安全。
 *          懒汉式：
 *          	好处： 延迟对象的创建。
 *          	坏处： 线程不安全。 		---》 讲到多线程时候再进行修改。
 *    
 *     4：单例模式的举例：
 *     		java.lang.Runtime	（饿汉式）
 * @author PC
 *
 */

// 饿汉式 Bank_01
class Bank_01{
	// 1:私有化类的构造器---- 避免在类的外面直接new 创造对象
	private Bank_01() {
		
	}
	// 2: 内部创建 静态 类的实例
	private static Bank_01 instanceBank_01 = new Bank_01();
	
	// 3:提供公共的 静态 方法，返回类的对象
	public static Bank_01 getInstance() {
		return instanceBank_01;
	}
}

// 懒汉式 Bank_02
class Bank_02{
	// 1:私有化类的构造器---- 避免在类的外面直接new 创造对象
		private Bank_02() {
			
		}
		// 2: 声明 静态 类的实例
		private static Bank_02 instanceBank_02 = null;
		
		// 3:提供公共的 静态 方法，返回类的对象
		public static Bank_02 getInstance() {
			if(instanceBank_02 == null) {
				instanceBank_02 = new Bank_02();
			}
			return instanceBank_02;
		}
}
public class danlimoshi_xuexi {
	public static void main(String[] args) {
		Bank_01 b1 = Bank_01.getInstance();
		Bank_01 b2 = Bank_01.getInstance();
		System.out.println(b1==b2);
		System.out.println("------------------------------------------------------");
		Bank_02 b3 = Bank_02.getInstance();
		Bank_02 b4 = Bank_02.getInstance();
		System.out.println(b3==b4);
	}
}
