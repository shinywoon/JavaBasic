package View;

import Food.Food;

public class View {

	public static void viewfirstScreen() {
		System.out.println("-----------------------------------");
		System.out.println("Hello!! shin's Buger Shop!");
		System.out.println("-----------------------------------");
		System.out.print("\"please enter anyKey\" [ 메뉴보기 ] :  ");
	}

	public static void goPrePrint(int lastnum) {
		int num = lastnum;
		System.out.println(num + ". 이전으로");
	}

	public static void viewFoods(Food[] FoodList) {
		int i = 1;
		
		for (Food b : FoodList) {
			System.out.println(i + ". " + b.name);
			i++;
		}
		goPrePrint(i);
		
		System.out.print("select Detailview>>  ");
	}

	public void viewDetail(int dF, Food[] list) {
		int flag = dF-1; 
		System.out.println("-----------------------------------");
		System.out.println(list[flag].name);
		System.out.println(list[flag].price);	
		System.out.println(list[flag].Area1);	
		System.out.println(list[flag].Area2);	
		System.out.println("-----------------------------------");
	}

	public void selectNavi() {
		System.out.println("<<< Select Navi >>>");
		System.out.print("[ 1. 버거 ] [ 2. 세트메뉴 ] [ 3.음료 ]  :  ");
	}

}
