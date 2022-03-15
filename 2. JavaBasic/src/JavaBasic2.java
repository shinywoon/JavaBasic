
//자바 Util 라이브러리에서 스캐너 메소드를 참조
import java.util.Scanner;

// 자바 라이브러리 (파일 입력을 사용하기 위함)
import java.io.*;

public class JavaBasic2 {

	//메소드 선언(정의)
public static void numbering() {
		 int i = 0;
	        while (i < 10) {
	            System.out.println(i);
	            i++;
	}
}

//매소드 선언 부 매개변수
//받아올 인자의 데이터타입 , 매개변수 명 식으로 선언
public static void numbering1(int limit) {
	 	int i = 0;
	 	//매개변수를 함수안에서 사용
       while (i < limit) {
           System.out.println(i);
           i++;
}
}

public static void numbering2(int init,int limit) {
 	int i = init;
 	//매개변수를 함수안에서 사용
   while (i < limit) {
       System.out.println(i);
       i++;
}
}

//함수 명 앞에 데이터 타입은 반드시 리턴의 데이터 타입과 같아야 한다,
// 반환값이 없을 경우 void를 사용한다.
public static String numbering3(int init,int limit) {
	int i = init;
    // 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
    String output = "";
    while (i < limit) {
        // 숫자를 화면에 출력하는 대신 변수 output에 담았다.
        output += i;
        i++;
    }
    // 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이
    //return 키워드 뒤에 반환하려는 값을 배치하면 된다.
    return output;
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//매소드 (method) : 코드를 재 사용 할 수 있게 해준다.
		//메소드 호출
		numbering();
		
		//매개변수와 인자
		//메소드 호출부 (인자)
		numbering1(5);
		
		//보수의 인자
		numbering2(1,5);
		
		//return
		//함수 정의부에 리턴이 있을 경우 값으로 반환되며 이를 변수에 대입할 수 있다.
		String result = numbering3(1,5);
		System.out.println(result);
		
		//입력과 출력
		//Sting[] args
		//main 메소드는 자바에서 특별한 의미를 가진 메소드다. 
		//main 메소드의 내용을 구현하면 자바 에플리케이션을 실행할 때 main 메소드가 
		//호출되면서 프로그램이 구동하게 되는 것이다. 
		//이 때 Strings[] args는 입력 값의 파라미터로 동작한다.
		//String[] args은 매개변수다. 매개변수는 메소드가 호출될 때 전달된 입력 값을 
		//메소드 내부로 전달하는 역할을 하는 변수다. 이 변수의 데이터형은 String[]인데,
		//String[]은 문자열을 담고 있는 배열이다. 
		//args.length는 배열의 길이를 의미한다. 
		//이후 사용법 추가 스터디 예정!!!!
		
		//앱이 실행중에 입력 받기	
		//자바에서 기본적으로 제공하는 라이브러리 중에 scanner을 이용하면
		//사용자 입력을 받을 수 있다.
		// Class명 변수 = new 인스턴스명(옵션)
		//System.in -> 시스템 Class 에서 input 메소드를 사용
		Scanner sc = new Scanner(System.in);
		//sc 인스턴스에 접근하여 nextInt() 메소드를 사용
		//nexInt는 Int형 데이터를 받아오는 메소드
		int  i = sc.nextInt();
		System.out.println(i);
		sc.close();
		
		//다양한 형태의 입출력
		//사용자의 키보드 제어만이 입력은 아니다. 
		//아래 예제는 out.txt라는 파일을 입력 받아서 화면에 출력하는 예를 보여주고 있다.
		//예제를 실행하려면 프로젝트의 루트 디렉토리(src와 bin 디렉토리가 위치하고 있는 
		//경로)로 이동해서 아래와 같이 명령을 실행한다. out.txt 파일이 존재해야 한다.
		//try{}catch{}는 일단 무시하도록 하자
		try {
            File file = new File("out.txt");
            sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println((sc.nextInt()*1000)); 
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
		
		
	}

}
