package z4.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static int[] BubbleSort(int[] array, int len) {
		int[] numList = array;
		for (int i = 1; i < numList.length; i++) {
			for (int j = 1; j < numList.length; j++) {
				if (numList[j - 1] < numList[j]) {
					int tmp = numList[j - 1];
					numList[j - 1] = numList[j];
					numList[j] = tmp;
				}
			}

		}
		return numList;
	}

	public static void main(String[] args) {

		int[] array = { 2, 1, 7, 25, 3, 85, 11, 90, 45, 25 };

		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

		array = BubbleSort(array, array.length);

		for (int i : array) {
			System.out.print(i + " ");
		}

	}
}