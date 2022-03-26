package a47.JavaDemonThread;

public class DemonThread implements Runnable {
	
	
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Demon Thread 실행 중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}

	}

}
