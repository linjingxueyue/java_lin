package helloword;
//import java.io.*;
public class helloword {
	static int a ;
	public void getname() {
		System.out.println("----S");
	}
	public static void main (String[] args) {
//		getname();
			String name = "linjing";
			String name2 = name.substring(0,name.length());
			System.out.println(name2);
			if(name.equals(name2)) {
				System.out.println("---------------------"+ a);
			} 
			if(name==name2) {
				System.out.println("---------------------");
			}
			System.out.println("**********************************");
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
		      int[] ids =  new int[5];
		      int[] ids2 = new int[] {5,6,7,8,9,10};
//		      ids[0] = 10;
		       for(int i=0;i<5;i++) {
		    	   ids[i]=i;
		       }
			   System.out.println(ids.length);
			   System.out.println(ids2[2]);
	}
}
