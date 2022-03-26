package a42.JavaMakeThread;

public class Thread2 implements Runnable{
	String str;
	
	public Thread2(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i< 10 ; i++) {
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
