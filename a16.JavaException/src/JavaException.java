
public class JavaException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try...catch
		//try {
			// 예외의 발생이 예상되는 로직
		//}catch(예외클래스 인스턴스){
			//예외가 발생했을 때 실행되는 로직
	//}
		//catch(Exception e)
		//e는 변수다. 
		//이 변수 앞의 Exception은 변수의 데이터 타입이 Exception이라는 의미다. 
		//Exception은 자바에서 기본적으로 제공하는 클래스로 java.lang에 소속되어 있다.
		//예외가 발생하면 자바는 마치 메소드를 호출하듯이 catch를 호출하면서 
		//그 인자로 Exception 클래스의 인스턴스를 전달하는 것이다.

		//e.getMessage()는 자바가 전달한 인스턴스의 메소드 중 getMessage를 호출하는 
		//코드인데, getMessage는 오류의 원인을 사람이 이해하기 쉬운 형태로 
		//리턴하도록 약속되어 있다.
		
		//e.getMessage();
		//오류에 대한 기본적인 내용을 출력해준다. 상세하지 않다.

		//e.toString()
		//e.toString()을 호출한 결과는 java.lang.ArithmeticException: / by zero 이다. 
		//e.toString()은 e.getMessage()보다 더 자세한 예외 정보를 제공한다.
		//java.lang.ArithmeticException은 발생한 예외가 어떤 예외에 해당하는지에 대한 
		//정보라고 지금을 생각하자. 
		//ArithmeticException 수학적인 계산의 과정에서 발생하는 예외상황을 의미한다.
		//(우리는 어떤 숫자를 0으로 나누려고 하고 있다는 것을 상기하자)

		//e.printStackTrace()
		//메소드 getMessage, toString과는 다르게 printStackTrace는 리턴값이 없다.
		//이 메소드를 호출하면 메소드가 내부적으로 예외 결과를 화면에 출력한다. 
		//printStackTrace는 가장 자세한 예외 정보를 제공한다.
		
		//finally
		//finally{
			//예외여부와 관계없이 실행되는 로직
		//}
		
		//
		
	}

}
