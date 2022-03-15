package z3.JavaPractice;

import java.util.Scanner;

import Food.Food;
import View.View;

public class JavaPrac {
	static Food food = new Food();
	static View view = new View();
	static Scanner sc = new Scanner(System.in);
	
	public static void detailService(Food[] list){
		int detailFlag = 0;
		detailFlag = sc.nextInt();
		if(detailFlag < list.length) {
			view.viewDetail(detailFlag, list);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Food[] bugerList = food.setBugersMenu().get(0);
		Food[] setList = food.setBugersMenu().get(1);
		Food[] drinkList = food.setBugersMenu().get(2);


		while (true) {

			String menuSelectNo;
			

			view.viewfirstScreen();
			menuSelectNo = sc.next();

			if (menuSelectNo != null) {
				view.selectNavi();
				
				int selectFlag = 0;
				selectFlag = sc.nextInt();
				switch (selectFlag) {
				case 1:
					
					view.viewFoods(bugerList);
					detailService(bugerList);
					break;
					
				case 2:
					view.viewFoods(setList);
					detailService(setList);
					break;
					
				case 3:
					view.viewFoods(drinkList);
					detailService(drinkList);
					break;
				}

			}

		}

	}

}
