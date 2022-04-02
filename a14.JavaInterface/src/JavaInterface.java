

//인터페이스(interface)는 다소 추상적인 개념이다
//인터페이스는 abstract, final와 함께 대표적인 규제
//인터페이스의 역할은 이렇다. 
//어떤 객체가 있고 그 객체가 특정한 인터페이스를 사용한다면 
//그 객체는 반드시 인터페이스의  메소드들을 구현해야 한다. 
//만약 인터페이스에서 강제하고 있는 메소드를 구현하지 않으면 
//이 에플리케이션은 컴파일 조차 되지 않는다.
interface I{
    public void z();
}

//클래스 A 뒤의 implements I는 이 클래스가 인터페이스 I를 구현하고 있다는 의미다.
//그것은 interface I의 맴버인 public void z() 메소드를 
//클래스 A가 반드시 포함하고 있어야 한다는 뜻이다. 
//따라서 위의 코드는 문제가 없다. 
//인터페이스의 의미를 좀 더 분명하게 하기 위해서 
// public void z(){}를 삭제하자. 컴파일 에러가 발생할 것이다. 
class A implements I{
   public void z(){}
}

public class JavaInterface {

	public static void main(String[] args) {
		
		//인터페이스와 상속은 다르다. 
		//상속이 상위 클래스의 기능을 하위 클래스가 물려 받는 것이라고 한다면, 
		//인터페이스는 하위 클래스에 특정한 메소드가 반드시 존재하도록 강제한다
		
		//또 사용하는 키워드도 다르다. 클래스를 선언 할 때는 class를 사용하지만 
		//인터페이스는 interface를 사용한다.

		//또 상속은 extends를 사용하지만 인터페이스는 implements를 사용한다.

		//인터페이스의 규칙
		//하나의 클래스가 여러개의 인터페이스를 구현 할 수 있다. 
		
		/*interface I1{
    	public void x();
		}
 
		interface I2{
    		public void z();
		}
 
		class A implements I1, I2{
    		public void x(){}
    		public void z(){}   
		}*/
		
		//인터페이스도 상속이 된다.
		/*
		 interface I3{
    	public void x();
		}
 
		interface I4 extends I3{
    	public void z();
		}
 
		class B implements I4{
    	public void x(){}
    	public void z(){}   
		}
		 
		 * */
		
		//인터페이스의 맴버는 반드시 public이다. 
		
		//abstract vs interface
		//인터페이스와 추상 클래스는 서로 비슷한 듯 다른 기능이다. 
		//인터페이스는 클래스가 아닌 인터페이스라는 고유한 형태를 가지고 있는 
		//반면 추상 클래스는 일반적인 클래스다. 
		//또 인터페이스는 구체적인 로직이나 상태를 가지고 있을 수 없고, 
		//추상 클래스는 구체적인 로직이나 상태를 가지고 있을 수 있다
		
	}

}
