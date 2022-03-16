package View;

import java.util.List;

import Food.Food;

public class View {

	public static void viewfirstScreen() {
		System.out.println("-----------------------------------");
		System.out.println("Hello!! shin's Buger Shop!");
		System.out.println("-----------------------------------");
		System.out.print("\"please enter anyKey\" [ 1. 메뉴보기 ] [2. 장바구니 보기] :  ");
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

	public void viewBaketNavi() {
		System.out.println("[1. 장바구니 담기]  [ 2.이전으로 ]");
	}

	public int showBasket(List<Food> basket) {
		int flag = 0;
		if(basket.isEmpty()) {
			System.out.println("----------------");
			System.out.println("비어있습니다.");
			System.out.println("----------------");
			flag = 1;
			return flag;
		}else {
			int z = 1;
			System.out.println("============");
			for(Food i : basket) {
				System.out.print(z + ". ");
				System.out.print(i.name + "    ");
				System.out.println(i.price);
				z++;
			}	
			System.out.println("============");
			int sum = sumBasket(basket);
			System.out.println("Total : " + sum +"원 ");
		}
		
		return flag;
	}
	
	public int sumBasket(List<Food> basket) {
		int result = 0;
		
		for(int i = 0; i < basket.size() ; i++) {
			result += basket.get(i).price;
		}
				
		return result;
	}
	
	public void basketNavi() {
		System.out.println("[ 1. 결제하기 ] [ 2. 메뉴 삭제 하기 ] [ 3. 이전으로 ]");
	}
	
	public void showComp() {
		System.out.println("결제 완료");
	}
	
	
}
