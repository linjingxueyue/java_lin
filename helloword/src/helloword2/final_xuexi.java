package helloword2;


/**
 *  final 的理解：
 *  
 *  	1： 可以用来修饰的结构： 类、方法、 变量
 *  	
 *  	2： 修饰类的时候：
 *  		说明此类不能被其他类所继承。
 *  			eg: String类、System类、StringBuffer类
 *  
 *      3： final 修饰方法：
 *      		表示 此方法不可以被重写.但是可以被重载。
 *      			eg: GetClass() 方法
 *      
 *      4： final 用来修饰变量， 此时的变量就称之为常量.
 *      		但是 final 修饰的变量必须进行赋值。赋值的位置有：显式初始化、代码块内部、构造器函数中.
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