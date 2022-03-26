package a48.JavaLamba;

public class JavaLamdaExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runnable을 객체로 만들어서 전달
		// 매서드만 전달하는 방법이 없기때문에 매번 객체를 만들어서 보내야 한다
		// 이것을 보안한것이 Lamda : 익명 매서드
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("hello");
//				}
//			}
//
//		}).start();
		
		new Thread(()-> {
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("hello");
//				}
//			}
		}).start();
	}

}
