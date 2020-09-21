package helloword;

public class String_xuexi {
	public static void main(String[] args) {
		String name = "linjing";
		String name2 = new String("linjing");
		
		System.out.println(name == name2);
		System.out.println("_____________________________________");
		/**
		 * 因为例子中的s3和s6中的"helloworld”都是字符串常量，它们在编译期就被确定了，所以s3==s6为true；
		 * 而"hello”和"world”也都是字符串常量，当一个字符串由多个字符串常量连接而成时，
		 * 它自己肯定也是字符串常量，所以s5也同样在编译期就被解析为一个字符串常量，
		 * 所以s5也是常量池中"helloworld”的一个引用
		 * 至于s4 就是在运行时候才确定的准确值，并不是常量池中"helloworld"的引用
		 */
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		String s4 = s1 + s2;
		String s5 = "hello" + "world";
		String s6= "helloworld";
		System.out.println(s3 == s6);
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		
	}
}
