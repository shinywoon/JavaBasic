package a43.JavaSharedObject;

public class MusicBox1 {

	// synchronized 여러개의 쓰레드들이 공유객체의 매서드들을 사용할때
	// 0.00001초라도 매서드가 먼저 실행이 되면 해당 객체에 사용권을 얻게 됨
	// 이를 monitoringlock 이라고 한다.
	// 먼저 실행된 메서드의 실행이 완료 되거나 wait() 매소드에 의해 정지 되지 않으면 monitoringlock을 풀지 않는다.

	public synchronized void playMusicA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("신나는 음악");

			try {
				Thread.sleep((int) Math.random() * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void playMusicB() {
		for (int i = 0; i < 10; i++) {
			System.out.println("슬픈 음악");

			try {
				Thread.sleep((int) Math.random() * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void playMusicC() {
		for (int i = 0; i < 10; i++) {
			// 매서드가 길어질경우 늦게 실행된 경우 오래기다리는 경우가 생김
			// 이문제를 해결하기 위해 매서드 전체에 synchronized를 거는것이 아닌 동시 실행이 되면 안되는 부분에 지정
			synchronized (this) {
				System.out.println("카페 음악");
			}

			try {
				Thread.sleep((int) Math.random() * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
