package helloword;



/**
 * 
 * 	二维数组的学习
 *  引用类型变量： 要么没有存值，为Null；要么存值，为某个对象的地址值。
 *
 */
public class son2 {
	public static void main(String[] args) {
	
		System.out.println("------------------------------");
		int[] ids = {1,2,3,5};
		System.out.println(ids[1]);
		int ids2[][] = new int[3][];
		ids2[0] = new int[4];
		ids2[1] = new int[5];
		ids2[1][4] = 1000;
		System.out.println(ids2[0]);
		System.out.println(ids2[1][4]);
		String[] ids3 = new String[4];
		System.out.println(ids3);
		System.out.println("---------------------");
		/* 使用构造器创建两个对象 */
		hellow_son_class empOne = new hellow_son_class("RUNOOB1");
		hellow_son_class empTwo = new hellow_son_class("RUNOOB2");
	 
	      // 调用这两个对象的成员方法
	      empOne.empAge(26);
	      empOne.empDesignation("高级程序员");
	      empOne.empSalary(1000);
	      empOne.printEmployee();
	 
	      empTwo.empAge(21);
	      empTwo.empDesignation("菜鸟程序员");
	      empTwo.empSalary(500);
	      empTwo.printEmployee();
	}
}
