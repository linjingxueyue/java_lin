package helloword2;

/**
 *  abstract 的理解：
 *  
 *  	1： 用来修饰的结构有： 类、方法
 *  
 *  	2： abstract 修饰类 时的特点：
 *  		1：此类不能实例化
 *  		2：此类即使不能够实例化对象，也有构造器。
 *  		3：开发过程中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作。
 *  
 *  	3：abstract 修饰方法：
 *  		1：抽象方法只有方法的声明，没有方法体。
 *  		2：包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法。
 *  		3: 子类只有重写了父类中所有的抽象方法后，才可以 实例化。
 *  		4： 若此类没有重写父类中所有的抽象方法，则此类也是一个抽象类。
 *      4: abstract 不能修饰的结构：
 *      		属性、私有方法、构造器
 *      		静态方法、final方法。（这两个都不能重写）。
 *      		final 类（不能被继承）
 *  ----------------------------------------------------------------------
 *  	在Java中静态方法可以被继承，但是不能被覆盖，即不能重写。
		如果子类中也含有一个返回类型、方法名、参数列表均与之相同的静态方法，那么该子类实际上只是将父类中的该同名方法进行了隐藏，
	 而非重写。
		父类引用指向子类对象时，只会调用父类的静态方法。所以，它们的行为也并不具有多态性
 * @author PC
 *
 */
public class abstract_xuexi {
	public static void main(String[] args) {
		// 创建一个匿名类
		 AA2 aa2 = new AA2() {
			 @Override
			 public void work() {
				 System.out.println("匿名类对象 的创建");
			 };
		 };
		 aa2.work();
	}
}

abstract class  AA2{
	public static void show() {
		System.out.println("AA2");
	}
	public abstract  void  work();
}
