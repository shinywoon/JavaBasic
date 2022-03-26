package a41.JavaThread;

public class ThreadExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaThread t1 = new JavaThread("*");
		JavaThread t2 = new JavaThread("-");

		// start 매서드를 사용해야 함
		// 실행 흐름이 2개
		t1.start();

		// 실행 흐름이 3개
		t2.start();

		System.out.println("main end !!!");

	}

}
