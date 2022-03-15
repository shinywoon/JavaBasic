package Food;

import java.util.ArrayList;
import java.util.List;

public class Food {

	public String name;
	public int price;
	public String Area1;
	public String Area2;

	public Food() {
	};

	public Food(String name, int price, String Area1, String Area2) {
		this.name = name;
		this.price = price;
		this.Area1 = Area1;
		this.Area2 = Area2;
	}

	public static List<Food[]> setBugersMenu() {
		Food buger1 = new Food("싸이버거", 6300, "패티 : 미국산", "빵 : 국산");
		Food buger2 = new Food("양념싸이버거", 7200, "패티 : 미국산", "빵 : 국산");
		Food buger3 = new Food("간장마늘싸이버거", 6800, "패티 : 미국산", "빵 : 국산");
		Food buger4 = new Food("딥치즈버거", 5200, "패티 : 미국산", "빵 : 국산");
		Food[] bugerList = { buger1, buger2, buger3, buger4 };

		Food set1 = new Food("싸이버거 SET", 9200, "패티 : 미국산", "빵 : 국산");
		Food set2 = new Food("양념싸이버거 SET", 1000, "패티 : 미국산", "빵 : 국산");
		Food set3 = new Food("간장마늘싸이버거 SET", 9100, "패티 : 미국산", "빵 : 국산");
		Food set4 = new Food("딥치즈버거 SET", 8300, "패티 : 미국산", "빵 : 국산");
		Food[] setList = { set1, set2, set3, set4 };

		Food drink1 = new Food("콜라", 9200, "물 : 청주", "탄산 : 국산");
		Food drink2 = new Food("사이다", 1000, "물 : 청주", "탄산 : 국산");
		Food drink3 = new Food("커피", 9100, "물 : 청주", "탄산 : 국산");
		Food drink4 = new Food("홍차", 8300, "물 : 청주", "탄산 : 국산");
		Food[] drinkList = { drink1, drink2, drink3, drink4 };

		List<Food[]> foodList = new ArrayList<>();
		foodList.add(bugerList);
		foodList.add(setList);
		foodList.add(drinkList);

		return foodList;
	}

}