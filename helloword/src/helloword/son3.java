package helloword;

import java.util.Scanner;
/**
 * 打印回形数组。
 * @author PC
 *
 */

public class son3 {
	public void printarray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(" "+ array[i][j]+" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		son3 s = new son3();
		System.out.print("请输入一个数字; ");
//		System.out.println();
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
//		int number = 7;
		int[][] array = new int[number][number];
		int count = 0;
		int startX = 0;
		int startY = 0;
		int endX = number - 1;
		int endY = number - 1;
		while (startX <= endX) {
			for (int i = startX; i <= endX; i++) {
				array[startY][i] = ++count;
			}
			startY++;
			for (int i = startY; i <= endY; i++) {
				array[i][endX] = ++count;
			}
			endX--;
			for (int i = endX; i >= startX; i--) {
				array[endY][i] = ++count;
			}
			endY--;
			for (int i = endY; i >= startY; i--) {
				System.out.println(endY + " "+startX);
				array[i][startX] = ++count;
			}
			startX++;
		}
		s.printarray(array);

	}
}
