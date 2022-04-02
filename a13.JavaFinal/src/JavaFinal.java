

// Calculator class
class Calculator {
	//final 로 값을 고정 (상수화)
    static final double PI = 3.14;
    int left, right;
    
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //class 변수 PI 는 상수화 되어 있기 때문에 변경이 불가능하다.
        //Calculator.PI = 6;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class JavaFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//추상이 상속을 강제하는 것이라면 final은 상속/변경을 금지하는 규제다. 
	
		//final 필드
		//필드와 변수는 같은 의미라는 것 기억
		
		Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10;
		
        
        //주목할 점은 변수 앞에 final이 붙어있다는 점이다. 
        //Calculator.PI를 통해서 클래스 변수 PI의 값을 변경하려고 하고 있지만 
        //자바는 이것을 허용하지 않는다.
        //final로 지정된 변수에는 한번 값이 할당되면 그 값을 바꿀 수 없기 때문이다.

        //상수가 변하지 않는 값이라고 배운 기억이 날 것이다. 
        //그리고 위의 PI 예제는 변하지 않을 값이다. 
        //이런 값은 변수 앞에 final을 붙여서 이 값이 변경되는 것을 규제할 수 있다. 
        //이러한 특징은 클래스 변수의 예를 들었지만 인스턴스 변수에도 적용된다.
		
        //final 메소드
        /*
        class A{
            final void b(){}
        }
        class B extends A{
            void b(){}
        }
        */
        // 상속을 금지 함으로 Error 발생
        
        
        //final 클래스
        /*final class C{
            final void b(){}
        }
        class D extends C{}*/
        //final Class를 상속 받으려 하기 때문에 Error발생
        
        
	}

}
