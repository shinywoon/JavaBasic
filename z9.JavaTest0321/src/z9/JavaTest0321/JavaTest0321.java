package z9.JavaTest0321;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaTest0321 {
	
	public static int[][] rotate(int[][] array) {
		int[][] newList = new int[array.length][array[0].length];
		for (int i = 0; i < newList.length; i++) {
			for (int j = 0; j < newList.length; j++) {
				// 오른쪽으로 90도 회전
				newList[i][j] = array[array.length - 1 - j][i];
			}
		}
		return newList;
	}
	
	public static void printArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		int[][] array = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		printArray(array);
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("--------------");
			array = rotate(array);
			printArray(array);	
			System.out.println("--------------");
		}
		
		
		
		
	}

}
