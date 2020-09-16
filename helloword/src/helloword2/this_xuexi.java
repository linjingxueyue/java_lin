package helloword2;
/**
 * a. this修饰 属性和方法：
 *  	 this的理解： 当前对象 或 当前正在创建的对象（适用于构造器函数的情况）
 *  	 在类的方法中，我们可以使用“this.属性”或“this.方法”的方式，调用当前属性或方法。但是，
 *     通常情况下，我们都选择省略"this."。
 *     
 * b.this可以用来调用构造器
 * 		在一个构造器中可以通过“this(参数)”的形式，调用另一个构造器。
 * 		注意： this() 这种形式，必须放在构造器内部的首行。
 * 
 * @author PC
 *
 */

public class this_xuexi {
	public static void main(String[] args) {
		Test t1 = new Test("linjing");
	}
}

 class Test{
	public Test() {
		// 初始化时候，需要执行如下40行代码。。。
		System.out.println("构造器Test()执行");
	}
	public Test(String name) {
		this();
		System.out.println("构造器 Test(String name)执行");
	}
	public Test(String name,int age) {
		
	}
}
