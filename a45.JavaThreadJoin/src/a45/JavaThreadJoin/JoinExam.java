package a45.JavaThreadJoin;

public class JoinExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread5 t1 = new Thread5();
		t1.start();
		
		System.out.println("시작");
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("종료!");
	}

}
