package helloword;

import java.util.Scanner;

/**
 * ctrl + shift + o ： 快捷鍵--導入所需要的安裝包
 * @author PC
 *
 */
public class hellow_son_class {
	String name;
	   int age;
	   String designation;
	   double salary;
	   // Employee 类的构造器
	   public hellow_son_class(String name){
	      this.name = name;
	   }
	   // 设置age的值
	   public void empAge(int empAge){
	      age =  empAge;
	   }
	   /* 设置designation的值*/
	   public void empDesignation(String empDesig){
	      designation = empDesig;
	   }
	   /* 设置salary的值*/
	   public void empSalary(double empSalary){
	      salary = empSalary;
	   }
	   /* 打印信息 */
	   public void printEmployee(){
	      System.out.println("名字:"+ name );
	      System.out.println("年龄:" + age );
	      System.out.println("职位:" + designation );
	      System.out.println("薪水:" + salary);
	   }
	   
	   public static void main(String[] args) {
		   System.out.println("-----------------------");
		   int[] ids = new int[4];
		   String[] ids2 = new String[4];
		   char[] ids3 = new char[4];
		
		   System.out.println(ids[0]);
		   System.out.println(ids2[0]);
		   System.out.println(ids3[0]=='0');
		   System.out.println("++++++");
		   System.out.println("-----------------------");
		   char a ='3';
		   Scanner scanner = new Scanner(System.in);
		   int b = scanner.nextInt();
		   for(int i = 0;i<10;i++) {
			   a = 'c';
		   }
		   System.out.println(a);
		   
	   }
}

