package helloword2;
/**
 *  方法的重写：
 *  	方法的声明包括： 权限修饰符  返回值 方法名  （参数列表）{
 *  							方法体
 *  					 }
 *  	1：子类重写的方法的 方法名 与 参数列表 与  父类被重写的方法一致
 *  
 *  	2：子类重写方法的权限修饰符 不小于 父类被重写方法的权限修饰符
 *  			特殊情况： 子类 不能重写 父类被声明为private的方法
 *  
 *  	3：父类返回值类型是void，则子类重写的返回值类型必须是void
 *  	   父类返回值类型是A类型，则子类重写的返回值类型必须是A类或A类的子类
 *  		父类的返回值类型是基本数据类型， 子类重写方法的返回值类型必须是相同数据类型
 *  
 *  	4：子类重写方法抛出的异常类型，不大于 父类被重写方法抛出的异常类型
 *  ——————————————————————————————————————————
 *  	子类和父类同名与同参数的方法，只有非static时才考虑重写，static时候不能重写（随类加载）
 * @author PC
 *
 */
class Mother{
	public void eat() {
		System.out.println("eat");
	}
	public Object talk() {
		return null;
	}
	public static void run() { 
		
	}
}
class son extends Mother{
	
	public void eat() {
		System.out.println("eat2 ...");
	}
	
	public void eat(String str) {
		System.out.println(str);
	}
	
	public String talk() {
		return null;
	}
	public static void run() { 
			
		}
	}
public class overwrite {

		public static void main(String[] args) {
		
			son s = new son();
			s.eat();
			s.eat("sssss");
		}
}
