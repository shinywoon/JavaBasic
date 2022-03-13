
public class JavaEnum {
	
	 	private final static int APPLE = 1;
	    private final static int PEACH = 2;
	    private final static int BANANA = 3;
	    
	    // 추가
	    // company
	    private final static int GOOGLE = 1;
	    //private final static int APPLE = 2;
	    private final static int ORACLE = 3;
	    //과일 APPLE과 기업 APPLE이 서로 같은 이름을 가진다. 
	    //이렇게 되면 APPLE의 값이 2에서 1로 바뀐다. 
	    //프로그램은 오동작 할 것이다. 
	    //다행인 것은 final로 선언했기 때문에 컴파일이 되지 않고 
	    //이름이 중복되는 문제를 방지 할 수 있다. 
	    //그런데 이미 기업에 대한 상수를 작성했고 
	    //이것이 이미 다양한 영역에서 사용되고 있는 상태에서 
	    //APPLE을 추가하려면 낭패가 될 것이다. 
	    //이러한 문제를 회피하기 위해서 접두사를 붙여보자.
	    //COM_APPLE , FRUIT_APPLE 이러한 기법 : 네임스페이스
	    
	    // 좀더 깔끔하게바꾸기 위해 인터페이스를 이용
	    /*interface FRUIT{
	    int APPLE=1, PEACH=2, BANANA=3;
	}
	interface COMPANY{
	    int GOOGLE=1, APPLE=2, ORACLE=3;
	}*/
	   
	   /* 2.
	    enum Fruit{
    		APPLE, PEACH, BANANA;
		}
		enum Company{
    		GOOGLE, APPLE, ORACLE;
		}
	    */
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수도 상수가 될 수 있다. 
		//변수를 지정하고 그 변수를 final로 처리하면 한번 설정된 변수의 값은 
		//더 이상 바뀌지 않는다. 
		//또한 바뀌지 않는 값이라면 인스턴스 변수가 아니라 
		//클래스 변수(static)로 지정하는 것이 더 좋을 것이다.
		
		   int type = APPLE;
		   // interface 이용
	      // int type = FRUIT.APPLE;
		   //인터페이스를 이렇게 사용할 수 있는 것은 
		   //인터페이스에서 선언된 변수는 무조건 public static final의 속성을 갖기 때문이다.
		   switch(type){
	           case APPLE:
	                System.out.println(57+" kcal");
	                break;
	           case PEACH:
	                System.out.println(34+" kcal");
	                break;
	           case BANANA:
	                System.out.println(93+" kcal");
	                break;
	        }
		
	       //프로그램이 커지면서 누군가 기업에 대한 상수가 필요해졌다.
	       //하지만 interface를 사용해도 switch 문에 1이 입력 됨으로
		   // 54kal 이 출력 된다.
		   // 이를막기 위 해 Class로 구분하여 작성시 Error 가 발생 된다.
		   
		   
		   //enum
		   //enum은 열거형(enumerated type)이라고 부른다
		   // java1.5 부터 문법적으로 지원하기 시작
		   
		   /*
		    Fruit type = Fruit.APPLE;
        	switch(type){
            	case APPLE:
                	System.out.println(57+" kcal");
                	break;
            	case PEACH:
                	System.out.println(34+" kcal");
                	break;
            	case BANANA:
                	System.out.println(93+" kcal");
                	break;
     	  	}

		    */
		   
		   //enum을 사용하는 이유를 정리하면 아래와 같다.
		   //코드가 단순해진다.
		   //인스턴스 생성과 상속을 방지한다.
		   //키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼 수 있다
		  //enum은 사실 클래스다. 그렇기 때문에 생성자를 가질 수 있다
		  // 하지만 enum 생성자에 public을 붙이면 Error발생
		   // enum의 생성자가 접근 제어자 private만을 허용하기 때문
		   //APPLE("red"), PEACH("pink"), BANANA("yellow");
		   //Fruit의 상수를 선언하면서 동시에 생성자를 호출
	       /*
	        Fruit(String color){
    		System.out.println("Call Constructor "+this);
    		this.color = color;
			}*/
		   //생성자의 매개변수로 전달된 값은 this.color를 통해서 
		   //인스턴스 변수의 값으로 할당
		   //열거형은 메소드를 가질수도 있다
	}

}
