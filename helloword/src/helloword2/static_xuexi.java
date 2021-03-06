package helloword2;
/**
 *   static 的注意点：
 *    
 *    修饰 属性、方法、内部类、代码块。
 *    
 *   	在静态方法内部，不能使用this关键字与super关键字。静态方法内部只能调用静态结构
 *   	关于静态方法与静态函数的理解需要从生命周期的角度进行分析
 *   
 *    开发过程中对于静态属性的创建时机：
 *   	开发过程中，对于多个对象公有的属性，需要申明为静态属性
 *   
 *   开发过程中对于静态方法的创建时机：
 *   	操作静态属性的方法，通常设置为static的
 *   	工具类中的方法，习惯上声明为static。比如： Math、Array、Collections
 * @author PC
 *
 */
public class static_xuexi {
	public static void main(String[] args) {
	System.out.println();
	}
}
