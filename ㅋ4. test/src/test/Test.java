package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<Integer> num = new ArrayList<>();
		
		while(sc.hasNextInt()) {
			num.add(sc.nextInt());
		}
		
		for(int i : num) {
			System.out.println(i);
		}
		
	}

}
