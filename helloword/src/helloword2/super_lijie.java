package helloword2;
/**
 *  a.super 的理解：
 *  
 *  	1:子类中直接使用 属性，代表的是this.属性，此时先在子类中查找该属性，不存在时候，再去父类中查找该属性。
 *    直接使用super.属性的方式，就意味着不在子类中查询，直接在父类中查询.
 *    对于子类没有重写父类方法或属性时候，使用 this还是super 调用属性和方法没有区别
 *    
 *    	2: 当子类重写了父类方法，而又想要调用父类被重写的方法时候，可以直接用super.方法的形式调用
 *    
 *      3: 当在构造器函数的首行既没有使用super()也没有使用this()的时候，默认使用super();
 *      
 *      4: 在类的多个构造器中，至少一个构造器使用了super()。原因：一个类n个构造器，最多有n-1个构造器使用this()
 *      
 *   b.子类对象的实例化过程
 *   
 *   	1:从结果上来看（继承性）：
 *   		子类继承父类之后，就获取了父类中声明的属性或方法
 *   		 创建子类对象，在堆空间中，就会加载父类中声明的属性
 *   
 *      2：从过程上来看：
 *      	当通过子类构造器构造子类对象时候，一定会直接或间接的调用其父类构造器，进而调用父类的父类的构造器
 *        一直到调用了java.lang.object类中的构造器为止。正因加载过所有父类的结构，所以才可以看到内存中有父类的
 *        结构，子类对象才可以进行调用
 *        
 *        注意： 虽然创建子类对象时候，调用了父类的构造器，但是自始至终就创建了一个对象，即为new的子类对象
 *   
 *   c. super(形参列表) 调用父类指定的构造器
 *      this(形参列表)  调用本类的其他构造器
 * @author PC
 *
 */
class Father{
	public Father() {
		System.out.println("+++++++");
	}
	public Father(int nu) {
		System.out.println("------");
	}
	int id = 1001;
}
public class super_lijie extends Father {
	int id = 1002;
	public super_lijie() {
		System.out.println("this.id: "+ id+" "+this.id+" super.id: "+super.id);
	}
	public super_lijie(int numer) {
		System.out.println("this.id: "+ this.id+" super.id: "+super.id);
	}
	public static void main(String[] args) {
		super_lijie sl = new super_lijie();
		super_lijie s2 = new super_lijie(10);
	}
}
