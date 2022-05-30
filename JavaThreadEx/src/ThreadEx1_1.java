class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

public class ThreadEx1_1 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end");

	}

}
