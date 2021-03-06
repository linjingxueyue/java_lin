package helloword;

import org.graalvm.compiler.nodes.NodeView.Default;

import sun.jvm.hotspot.ui.action.ShowAction;

/**
 * 
 * 
 *  java 面向对象的学习
 *  
 *  a.学习路线：
 *  	1： Java 类及类的成员： 属性、方法、构造器、代码块、内部类
 *  	2： 面向对象的三大特征： 封装、继承、多态、抽象性
 *  	3：其他关键字： this super static final abstract interface 等
 *  
 *  
 *  b.成员变量（属性）与局部变量
 *  	1：声明位置不同
 *  		成员变量（属性）： 直接声明在类的{}内部。
 *  		局部变量：  声明在方法内、方法形参、代码块内、构造器内、构造器形参的变量
 *  	2： 关于权限修饰符的不同
 *  		成员变量（属性）： 可以在声明属性时，指明其权限，使用权限修饰符。常用的修饰符： private 、public、 default、 protected 
 *  		局部变量： 不可以使用权限修饰符
 *      3: 默认初始化值得问题
 *      	成员变量（属性）： 根据其数据类型是有初始化值的。
 *      	局部变量：  无初始化值，必须自己初始化。 （调用前必须初始化）
 *      4：在内存中加载的位置不同
 *      	成员变量（属性）：加载到堆空间中
 *      	局部变量：  加载到栈中。
 * 
 *  c.方法中可以直接调用现有的属性或者方法   
 *  
 *  d. 递归的感悟： 递归使用时候，记者向有限方向递归就行。
 *  
 *  e. 修饰符的使用范围： ------- 修饰符体现了类及类的内部结构在调用时候，可见性的大小
 *  	类：public、缺省
 *      
 * @author PC
 *
 */
public class son4_object_01 {
	// 成员变量

	public String name = "linjing";
	
	private String name2 = "linjing2";
	
	String name3 = "linjing3";
	
	protected String name4 ="linjing4";
	int age;
	
	
	public son4_object_01() {
		System.out.println("------");
	}
	
	public void talk(String msg) {      // 形参。局部变量
		// 直接调用类中的属性或者方法
		System.out.println(name);
		return ;
	}
	/**
	 * 可变个数形参的方法。
	 */
	public void show(int ... numbers) {
		System.out.println("numbers: "+numbers[0]+"   "+numbers[1]);
	}
	/**
	 * 	递归的理解例子 
	 * @return
	 */
	public int getnum(int n) {
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return 4;
		}else {
			return 2*getnum(n-1)+getnum(n-2);
		}
	}
	public static void main(String[] args) {
		son4_object_01 s4 = new son4_object_01();
		System.out.println(s4.name4);
		s4.talk("aaa");
		s4.show(new int[] {1,2,3,4});
		s4.show(1,2,3,4);
		System.out.println("s4.getnum(10): "+s4.getnum(10));
	}
	
}
