package helloword;

import java.util.Scanner;

/**
 * ctrl + shift + o �� ����I--��������Ҫ�İ��b��
 * @author PC
 *
 */
public class hellow_son_class {
	String name;
	   int age;
	   String designation;
	   double salary;
	   // Employee ��Ĺ�����
	   public hellow_son_class(String name){
	      this.name = name;
	   }
	   // ����age��ֵ
	   public void empAge(int empAge){
	      age =  empAge;
	   }
	   /* ����designation��ֵ*/
	   public void empDesignation(String empDesig){
	      designation = empDesig;
	   }
	   /* ����salary��ֵ*/
	   public void empSalary(double empSalary){
	      salary = empSalary;
	   }
	   /* ��ӡ��Ϣ */
	   public void printEmployee(){
	      System.out.println("����:"+ name );
	      System.out.println("����:" + age );
	      System.out.println("ְλ:" + designation );
	      System.out.println("нˮ:" + salary);
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

