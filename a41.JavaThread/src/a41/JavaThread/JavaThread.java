package a41.JavaThread;

public class JavaThread extends Thread{
	
	String str;
	
	public JavaThread(String str) {
		this.str = str;
	}
	
	//Thread는 run()이라는 Method를 가지고 있다.
	@Override
	public void run() {
		for(int i = 0 ; i < 10; i++) {
			System.out.println(str);
			try {
				//너무 빠름으로 Thread가 가진 sleep Method로 지연을 줌
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	

}
