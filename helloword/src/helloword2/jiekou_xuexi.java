package helloword2;

/**
 * 	接口(interface)的理解：
 * 
 * 		0： 接口 与 类 是两种等级别(并列) 的结构。 但是 一个类的父类只能有一个，接口可以有多个。
 * 
 * 		1： 解决JAVA没有多继承的缺点，
 * 
 * 		2： 接口的成员：
 * 			 JDK7 及 以前： 只能定义 全局常量 及 抽象方法.
 * 						 全局常量的定义可以省略 public static final 关键字 
 * 						 抽象方法可以省略 public abstract 关键字
 * 					
 * 			 JDK8及以后：   除7中的意外，还可定义静态方法，默认方法。
 * 		
 * 		3: 接口中不能定义构造器。意味着不可以实例化
 * 
 * 		4： java开发中，接口通过让类去实现接口的方式 来使用接口。
 * 			    如果类实现了接口中所有的抽象化方法，则该类可以进行实例化
 * 				如果该类没有重写完所有的抽象化方法，则该类仍然是一个抽象类。
 * 
 * 		5: 接口和 接口 之间 ，可以是多继承的。
 * 
 *      6： 接口 的具体使用，可以体现多态性。
 *      		见 jiekou_xuexi2
 *      7：接口实际上，可以看做一种 规范。
 *      
 *      8：接口 与抽象类 的区别：
 *      		相同点：
 *      		不同点
 * @author PC
 *
 */
public class jiekou_xuexi {
	public static void main(String[] args) {
		// 可以直接调用接口
			System.out.println(Flyable.MAX_SPEED);
			Plane p1 = new Plane();
			System.out.println(p1.MAX_SPEED);
			p1.fly();
			p1.attack();
	}
}

class Plane implements Flyable,Attackable,CC3{

	@Override
	public void fly() {
		System.out.println("fly -----");
	}

	@Override
	public void stop() {
		System.out.println("stop -----");
		
	}

	@Override
	public void attack() {
		System.out.println("attack -----");
		
	}

	@Override
	public void showA() {
		System.out.println("接口CC3继承自接口AA3的 方法 -----");
		
	}

	@Override
	public void showB() {
		System.out.println("接口CC3继承自接口BB3的 方法 -------");
		
	}
	
}

interface Flyable{
	//  全局常量
	 int MAX_SPEED = 7900;
	
	public static final int MIN_SPEED = 0;
	
	// 抽象方法
	public abstract void fly();
	
	void stop();
	
}
interface Attackable{
	void attack();
}

// ------------------------------- 接口多继承的例子 -------------------------------
interface AA3{
	void showA();
}
interface BB3{
	void showB();

}
interface CC3 extends AA3,BB3{
	
}