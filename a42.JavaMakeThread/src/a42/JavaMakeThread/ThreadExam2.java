package a42.JavaMakeThread;

public class ThreadExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t1 = new Thread2("*");
		Thread2 t2 = new Thread2("-");
		
		//start가 없음
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
		
		System.out.println("main end !!!");
	}

}
