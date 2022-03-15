import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.
//		int a, b, result;
//		result = 0;

//
//		System.out.print("두 정수를 입력하세요>>");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		result = a + b;
//		System.out.println(a + "+" + b + "은 " + result);

		// 2.

//		final int height = 5;
//		int f = 0;
//		System.out.print("몇 층인지 입력하세요>>");
//		f = sc.nextInt();
//		System.out.println((height * f) + "m 입니다.");

		// 3.

//		int x, y = 0;
//		System.out.print("x 값을 입력하세요>>");
//		x = sc.nextInt();
//		y = (int) ((Math.pow(x, 2)) - (3 * x)) + 7;
//		System.out.println("x = " + x + " y = " + y);

		// 4.
//		
//		final int min = 50, max = 100;
//		int x, y = 0;
//		x = 0;
//		y = 0;
//		System.out.print("점 (x,y)의 좌표를 입력하세요>>");
//		x = sc.nextInt();
//		y = sc.nextInt();
//
//		if (x > min && x < max) {
//			System.out.println("점 (" + x + "," + y + ")은 (50,50)과 (100,100)의 사각형 내에 있습니다.");
//		} else {
//			System.out.println("사각형 외에 있습니다.");
//		}

		// 5.
//		
//		String str = "";
//		System.out.print("논리 연산을 입력하세요>>");
//		boolean b1 = sc.nextBoolean();
//		String op = sc.next();
//		boolean b2 = sc.nextBoolean();
//		switch (op) {
//		case "AND":
//			if (b1 == b2) {
//				System.out.println("true");
//			} else {
//				System.out.println("false");
//			}
//			break;
//		case "OR":
//			if ((b1 == true) || (b2 == true)) {
//				System.out.println("true");
//			} else {
//				System.out.println("false");
//			}
//			break;
//		}

		// 6.

//		int money = 0;
//		int[] flag = { 50000, 10000, 1000, 500, 100, 10, 1 };
//		int[] cntList = new int[7];
//		System.out.print("돈의 액수를 입력하세요>>");
//		money = sc.nextInt();
//		int i = 0;
//		while (i < 7) {
//			cntList[i] = money / flag[i];
//			money = money % flag[i];
//			i++;
//		}
//
//		System.out.println(
//				"오만원" + cntList[0] + "개, " + "만원" + cntList[1] + "개, " + "천원" + cntList[2] + "개, " + "500원" + cntList[3]
//						+ "개, " + "100원" + cntList[4] + "개, " + "10원" + cntList[5] + "개, " + "1원" + cntList[6] + "개");

		// 7.

//		String score;
//		System.out.print("학점을 입력하세요>>");
//		score = sc.next();
//		switch (score) {
//		case "A":
//			System.out.println("Excellent");
//			break;
//		case "B":
//			System.out.println("Excellent");
//			break;
//		case "C":
//			System.out.println("Good");
//			break;
//		case "D":
//			System.out.println("Good");
//			break;
//		default:
//			System.out.println("Bye");
//		}

		// 8.
//		
//		String coffee = "";
//		int cnt = 0;
//		System.out.print("커피 주문하세요>>");
//		coffee = sc.next();
//		cnt = sc.nextInt();
//		if (coffee.equals("에스프레소")) {
//			System.out.println((2000 * cnt) + "원입니다.");
//		} else if (coffee.equals("아메리카노")) {
//			System.out.println((2500 * cnt) + "원입니다.");
//		} else if (coffee.equals("카푸치노")) {
//			System.out.println((3000 * cnt) + "원입니다.");
//		} else if (coffee.equals("카페라떼")) {
//			System.out.println((3500 * cnt) + "원입니다.");
//		}
//
//		switch (coffee) {
//		case "에스프레소":
//			System.out.println((2000 * cnt) + "원입니다.");
//			break;
//		case "아메리카노":
//			System.out.println((2500 * cnt) + "원입니다.");
//			break;
//		case "카푸치노":
//			System.out.println((3000 * cnt) + "원입니다.");
//			break;
//		case "카페라떼":
//			System.out.println((3500 * cnt) + "원입니다.");
//			break;
//		}

		// 9.

//		int num;
//		int first = 0;
//		int second = 0;
//		System.out.print("1 ~ 99 사이의 정수를 입력하세요>>");
//		num = sc.nextInt();
//		
//		first = num/10;
//		second = num%10;
//		
//		int firstCheck = first%3; 
//		int secondCheck = second%3; 
//		if(firstCheck == 0 && secondCheck ==0) {
//			System.out.println("박수짝짝");
//		}else if(firstCheck == 0 || secondCheck ==0) {
//			System.out.println("박수짝");
//		}else {
//			System.out.println("박수없음");
//		}
//		

		// 10.
		Scanner sc = new Scanner(System.in);
		String coffee1 = "";
		int cnt1 = 0;
		System.out.print("커피 주문하세요>>");
		coffee1 = sc.next();
		cnt1 = sc.nextInt();
		if (coffee1.equals("에스프레소")) {
			if (cnt1 <= 10) {
				System.out.println((2000 * cnt1) * 0.95 + "원입니다.");
			} else {
				System.out.println((2000 * cnt1) + "원입니다.");
			}

		} else if (coffee1.equals("아메리카노")) {

			System.out.println((2500 * cnt1) + "원입니다.");
		} else if (coffee1.equals("카푸치노")) {
			System.out.println((3000 * cnt1) + "원입니다.");
		} else if (coffee1.equals("카페라떼")) {
			System.out.println((3500 * cnt1) + "원입니다.");
		}

	}

}
