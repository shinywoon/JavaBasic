
class O{
    public void a(int param){
        System.out.println("숫자출력");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("문자출력");
        System.out.println(param);
    }
}

class A{
	public String x(){return "x";}
}
class B extends A{
	  public String y(){return "y";}
}

public class JavaPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다형성이란 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 
		//동작하는 것을 의미한다. 
		//키보드의 키를 통해서 비유를 들어보겠다. 
		//키보드의 키를 사용하는 방법은 '누른다'이다. 
		//하지만 똑같은 동작 방법의 키라고 하더라도 ESC는 취소를 ENTER는 
		//실행의 목적을 가지고 있다. 
		//다형성이란 동일한 조작방법으로 동작시키지만 동작방법은 다른 것을 의미한다.
		
		//overloading과 다형성
		//오버로딩은 가장 이해하기 쉬운 다형성의 예라고 할 수 있다
		
		 O o = new O();
	     o.a(1);;
	     o.a("one");
		//클래스 O의 메소드 a는 두개의 본체를 가지고 있다. 
	     //동시에 두개의 본체는 하나의 이름인 a를 공유하고 있다. 
	     //같은 이름이지만 서로 다른 동작 방법을 가지고 있기 때문에 
	     //오버로딩은 다형성의 한 예라고 할 수 있다
	     
	     //클래스와 다형성
	     A obj = new B();
	     obj.x();
	     //obj.y(); Error 발생  =>  B obj = new B(); 로 수정 시 사용 가능
	     //이상하게 보이겠지만 클래스 B의 데이터 형이 클래스 A이다.
	     //클래스 B는 클래스 A를 상속하고 있다. 
	     //이런 경우에 클래스 B는 클래스 A를 데이터 형으로 삼을 수 있다. 
	     
	     // 즉 클래스 B의 데이터 형을 클래스 A로 하면 클래스 B는 마치 
	     //클래스 A인것처럼 동작하게 되는 것이다. 
	     //클래스 B를 사용하는 입장에서는 클래스 B를 클래스 A인것처럼 사용하면 된다
	   
	     //클래스 B를 클래스 A의 데이터 타입으로 인스턴스화 했을 때 
	     //클래스 A에 존재하는 맴버만이 클래스 B의 맴버가 된다. 
	     //동시에 클래스 B에서 오버라이딩한 맴버의 동작방식은 그대로 유지한다.
	     
	     //다형성의 세계에서는 인터페이스도 중요한 수단이다. 
	     //특정한 인터페이스를 구현하고 있는 클래스가 있을 때 
	     //이 클래스의 데이터 타입으로 인터페이스를 지정 할 수 있다.
	     
	     /*
	      interface I{}
			class C implements I{}
			public class PolymorphismDemo2 {
    			public static void main(String[] args) {
        		I obj = new C();
    		}
		}*/
	     
	     //다중 상속이 지원되는 인터페이스의 특징과 결합해서 상속과는
	     //다른 양상의 효과를 만들어낸다
	     
	     /*
	      interface I2{
    		public String A();
		}
		interface I3{
    		public String B();
		}
		class D implements I2, I3{
    	public String A(){
        		return "A";
    		}
    	public String B(){
        		return "B";
    		}
		}
		public class PolymorphismDemo3 {
    		public static void main(String[] args) {
        		D obj = new D();
        		I2 objI2 = new D();
        		I3 objI3 = new D();
         
        		obj.A();
        		obj.B();
         
        		objI2.A();
        		//objI2.B();
         
        		//objI3.A();
        		objI3.B();
    		}
		}*/
	     
	     //주석처리된 메소드 호출은 오류가 발생하는 것들이다. 
	     //objI2.b()에서 오류가 발생하는 이유는 objI2의 데이터 타입이 
	     //인터페이스 I이기 때문이다. 
	     //인터페이스 I는 메소드 A만을 정의하고 있고 
	     //I를 데이터 타입으로 하는 인스턴스는 마치 메소드 A만을 가지고 있는 것처럼 
	     //동작하기 때문이다.

	     //이것은 인터페이스의 매우 중요한 특징 중의 하나를 보여준다. 
	     //인스턴스 objI2의 데이터 타입을 I2로 한다는 것은 인스턴스를 
	     //외부에서 제어할 수 있는 조작 장치를 
	     //인스턴스 I2의 맴버로 제한한다는 의미가 된다. 
	     //인스턴스 I2와 I3로 인해서 하나의 클래스가 다양한 형태를 띄게 되는 것이다.
	     
	     
	}

}
