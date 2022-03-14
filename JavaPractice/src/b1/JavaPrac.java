package b1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaPrac {
	// 계산기 만들기

	public static void printAll(List<Double> list) {
		for (double i : list) {
			System.out.println(i);
		}
	}

	public static int printf(double result, int flag) {
		switch (flag) {
		case 1:
			System.out.println("sum : " + result);
			return 0;
		case 2:
			System.out.println("minus : " + result);
			return 0;
		case 3:
			System.out.println("multi : " + result);
			return 0;
		case 4:
			System.out.println("div : " + result);
			return 0;
		}
		return 0;
	}

	public static void cal(List<Double> numList) {
		int flag = 1; // 1: sum 2. mi 3. mul 4. div
		double result = 0;
		result = sum(numList);

		result = printf(result, flag);
		flag++;
		// 뺄셈
		result = minus(numList);

		result = printf(result, flag);
		flag++;
		// 곱셈
		result = multi(numList);

		result = printf(result, flag);
		flag++;
		// 나눗셈
		result = div(numList);

		result =printf(result, flag);
		flag++;
	}

	public static double sum(List<Double> numList) {
		double result = numList.get(0);
		for (int i = 1; i < numList.size(); i++) {
			result += numList.get(i);
		}
		return result;
	}

	public static double minus(List<Double> numList) {
		double result = numList.get(0);
		for (int i = 1; i < numList.size(); i++) {
			result -= numList.get(i);
		}
		return result;
	}

	public static double multi(List<Double> numList) {
		double result = numList.get(0);
		for (int i = 1; i < numList.size(); i++) {
			result *= numList.get(i);
		}
		return result;
	}

	public static double div(List<Double> numList) {
		double result = numList.get(0);
		for (int i = 1; i < numList.size(); i++) {
			result /= numList.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("out.txt");
		List<Double> numList = new ArrayList<>();
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				numList.add(sc.nextDouble());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

		printAll(numList);
		// 더하기 구현하기
		cal(numList);

	}

}