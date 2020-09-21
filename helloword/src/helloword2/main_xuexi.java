package helloword2;
/**
 *  main() 方法的使用说明：
 *  	1： 作为程序的入口
 *  	2： 也是一个普通的静态方法。
 *  	3： 一个文件中，每个类都可以由一个main函数，运行时候手动选择作为入口的main函数
 *  	4： 这也说明了 静态函数里面只能调用静态属性或者方法。如果想要调用非静态结构可以通过new 对象实例的方式
 *  	5：mian()函数，也可以作为 我们与控制台交互的方式
 *  	
 * @author PC
 *
 */
public class main_xuexi {
	public void show() {
		System.out.println("只能通过new 对象实例的方式，才可以在 静态函数中 调用非静态结构");
		
	}
	public static void main(String[] args) {	// 入口
		Main.main(new String[100]);
		// 这也说明了 静态函数里面只能调用静态属性或者方法。如果想要调用非静态结构可以通过new 对象实例的方式
//		show()			--- error 
		main_xuexi m1 = new main_xuexi();
		m1.show();
	}
}
class Main{
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			args[i]="args_"+i;
			System.out.println(args[i]);
		}
	}	
}