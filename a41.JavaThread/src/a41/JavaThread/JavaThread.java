package a41.JavaThread;

public class JavaThread extends Thread{
	
	String str;
	public JavaThread(String str) {
		this.str = str;
	}
	
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	

}
