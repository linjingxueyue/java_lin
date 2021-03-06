package helloword2;
/**
 * 	代码块的学习：
 * 		
 * 		1： 代码块的作用：用来初始化类、对象。
 * 		2： 代码块如果有修饰的话：只能用static。
 * 		3： 分为： 静态代码块与非静态代码块
 * 
 * 		4：  静态代码块：
 * 					随着类的加载而执行。
 * 					只能执行一次。
 * 					一个类的内部可以定义多个 静态代码块。
 * 					可以在类加载时候，初始化类的静态属性
 * 					静态代码块的执行优先于非静态代码块的执行
 * 				    只能调用静态的属性或者方法
 * 					
 * 		5：  非静态代码块：
 * 					随着对象的创建而执行
 * 					每创建一个对象，都执行一次非静态代码块
 * 					可以在创建对象时候，对于对象的属性进行初始化。
 * 					类的内部可以定义多个非静态代码块。并按照定义的先后顺序进行执行； 
 * 					可以调用非静态的属性或方法也可以调用静态的属性或方法。
 * 
 *     6：对属性可以赋值的位置：
 *     		1： 默认初始化
 *     		2：显式初始化
 *     		3：构造器初始化
 *     		4：通过对象.属性的方式赋值
 *     		5：代码块内进行初始化
 * @author PC
 *
 */
class Test_block{
	int age ;
	public static String name="linjing";
	public Test_block() {
		
	}
	public Test_block(int age ) {
			this.age = age;
	}
	// 静态代码块：
	static {
		name = "!!!!!!!";
		System.out.println("adsasdasdasd"+name);
	}
	// 非静态代码块：
	{
		age = 20;
		name = "!!!!!!!";
		System.out.println(name);
	}
}
public class daimakuai_xuexi {
	public static void main(String[] args) {

		Test_block.name = "------------";
		Test_block b1 = new Test_block();
		Test_block b2 = new Test_block();
		System.out.println("******************************************");
		Test_block b3 = new Test_block(40);
		System.out.println(b3.age);
		
	}
}
