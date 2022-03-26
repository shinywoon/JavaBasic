package z2.JavaHomeWork.ori1;

import java.util.Objects;

public class JavaHomeWork {

	public static void main(String[] args) {

		int money = 3500;

		for (int bbang = 500; bbang < money; bbang += 500) {

			for (int kkang = 700; kkang < money - bbang; kkang += 700) {

				for (int coke = 400; coke <= money - (bbang + kkang); coke += 400) {

					if (bbang + kkang + coke == money) {
						System.out.println(
								"크림빵(" + (bbang / 500) + "개),새우깡(" + (kkang / 700) + "봉지), 콜라(" + (coke / 400) + "병)");
					}
				}
			}
		}
	}
}
