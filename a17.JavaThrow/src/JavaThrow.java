import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B{
	 void run(){
	        BufferedReader bReader = null;
	        String input = null;
	        try {
	            bReader = new BufferedReader(new FileReader("out.txt"));
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        try{
	            input = bReader.readLine();
	        } catch (IOException e){
	            e.printStackTrace();
	        }       
	        System.out.println(input); 
	    }
}

/*class B{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input); 
    }
}*/

class C{
    void run(){
        B b = new B();
        b.run();
    }
}

/* class C{
    void run(){
        B b = new B();
        try {
            b.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/

public class JavaThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Throws는 한국어로는 '던지다'로 번역된다. 
		//throw는 예외처리를 다음 사용자에게 넘기는 것이다.
		
		
		//JavaThrow.main은 C.run의 사용자이다. 
		//C.run은 B.run의 사용자이다. 
		//반대로 B.run의 다음 사용자는 C.run이고
		//C.run의 다음 사용자는 JavaThrow.main이 되는 셈이다.
		
		 C c = new C();
         c.run();
         
         //B.run이 FileReader의 생성자와 BufferedReader.readLine가 던진 예외를 
         //try...catch로 처리한다. 
         //즉 B.run이 예외에 대한 책임을 지고 있다
         //그런데 B.run이 예외 처리를 직접 하지 않고 다음 사용자 C.run에게 넘길 수 있다
        // /* 주석 참조 
		//B 내부의 try...catch 구문은 제거되었고 run 옆에 throws IOException, 
         //FileNotFoundException이 추가되었다. 
         //이것은 B.run 내부에서 IOException, FileNotFoundException에 
         //해당하는 예외가 발생하면 이에 대한 처리를 B.run의 사용자에게 위임하는 것이다. 
         //위의 코드에서 B.run의 사용자는 C.run이다.
		//따라서 C.run은 /* 주석과 같이 수정돼야 한다.
        
         

         //예외	사용해야 할 상황
         //IllegalArgumentException			매개변수가 의도하지 않은 상황을 유발시킬 때
         //IllegalStateException				메소드를 호출하기 위한 상태가 아닐 때
         //NullPointerException				매개 변수 값이 null 일 때
         //IndexOutOfBoundsException	인덱스 매개 변수 값이 범위를 벗어날 때
         //ArithmeticException					산술적인 연산에 오류가 있을 때
		
         //ex)  throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
         
         //예외의 종류
         //Throwable
        // Error
        // Exception
        // Runtime Exception
        
         
         
	}

}
