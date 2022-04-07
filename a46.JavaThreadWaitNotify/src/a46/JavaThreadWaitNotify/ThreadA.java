package a46.JavaThreadWaitNotify;

public class ThreadA {
	public static void main(String[] args) {
		
		ThreadB tb = new ThreadB();
		tb.start();
		
		synchronized (tb) {
			try {
				System.out.println("b가 완료될때까지 기다립니다.");
				tb.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Total : " + tb.total);
		}
		System.out.println("main end!");
		
	}
}
