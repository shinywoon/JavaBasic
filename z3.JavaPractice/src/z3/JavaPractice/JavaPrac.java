package z3.JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Food.Food;
import View.View;

public class JavaPrac {
	static Food food = new Food();
	static View view = new View();
	static Scanner sc = new Scanner(System.in);
	static List<Food> basket = new ArrayList<>();

	public static int detailService(Food[] list) {
		int detailFlag = 0;
		detailFlag = sc.nextInt();
		if (detailFlag < list.length) {
			view.viewDetail(detailFlag, list);
		}
		return detailFlag;
	}

	public static int basketAddFood(int pc, Food[] list) {
		int naviFlag = 0;
		naviFlag = sc.nextInt();
		if (naviFlag == 1) {
			basket.add(list[pc]);
			for (Food i : basket) {
				System.out.print(i.name + "     ");
				System.out.println(i.price);
			}
		}
		return naviFlag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food[] bugerList = food.setBugersMenu().get(0);
		Food[] setList = food.setBugersMenu().get(1);
		Food[] drinkList = food.setBugersMenu().get(2);

		while (true) {

			int menuSelectNo;

			view.viewfirstScreen();
			menuSelectNo = sc.nextInt();

			if (menuSelectNo == 1) {
				view.selectNavi();

				int selectFlag = 0;
				selectFlag = sc.nextInt();
				switch (selectFlag) {
				case 1:

					view.viewFoods(bugerList);
					int pc = detailService(bugerList);
					if (pc > bugerList.length) {
						continue;
					}
					view.viewBaketNavi();
					pc = pc - 1;
					int naviFlag = basketAddFood(pc, bugerList);
					if (naviFlag == 2) {
						continue;
					}

					break;

				case 2:
					view.viewFoods(setList);
					pc = detailService(setList);
					if (pc > bugerList.length) {
						continue;
					}
					view.viewBaketNavi();
					pc = pc - 1;
					naviFlag = basketAddFood(pc, setList);
					if (naviFlag == 2) {
						continue;
					}

					break;

				case 3:
					view.viewFoods(drinkList);
					pc = detailService(drinkList);
					if (pc > bugerList.length) {
						continue;
					}
					view.viewBaketNavi();
					pc = pc - 1;
					naviFlag = basketAddFood(pc, drinkList);
					if (naviFlag == 2) {
						continue;
					}

					break;
				}

			} else if (menuSelectNo == 2) {
				int bf = view.showBasket(basket);
				if (bf == 1) {
					continue;
				} else {
					view.basketNavi();
					int bnf = sc.nextInt();
					switch (bnf) {
					case 1:
						view.showBasket(basket);
						view.showComp();
						basket.clear();
						break;
					case 2:
						view.showBasket(basket);
						System.out.println("삭제할 항목을 선택해 주세요 :  ");
						int removeNo = (sc.nextInt()) -1;
						basket.remove(removeNo);
						view.showBasket(basket);
						break;
					default:
						continue;
					}
				}
			}

		}

	}

}
