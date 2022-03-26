package a46.JavaThreadWaitNotify;

public class ThreadB extends Thread {
//
//	스레드 간 협업
//
//- 두 개의 스레드를 교대로 번갈아가면서 실행할 경우 이용
//
//- 자신의 작업이 끝나면 상대방 스레드를 일시 정지 상태에서 풀어주고, 자신은 일시정지 상태로 만드는 것이다.
//
//- 공유 객체를 사용해 이를 해결하는데, 공유 객체는 두 스레드가 작업할 내용을 각각 동기화 메소드로 구분한다.
//
//- 한 스레드가 작업을 완료하면 notify() 메소드를 호출해서 일시 정지 상태에 있는 다른 스레드를 실행 대기 상태로 만들고, 자신은 두 번 작업을 하지 않도록 wait() 메소드를 호출하여 일시 정지 상태로 만든다.
//
//- 동기화 메소드 안에서 사용
//[출처] [JAVA] - Notify|작성자 HEHE

	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + "를 더합니다.");
				total += i;

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			notify();
		}

	}

}
