class Calculator{
    int left, right;
    int third = 0;
     
    //setOprands 라는 이름의 메소드
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
    // 동일한 setOprands 라는 이름의 메소드
    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}


public class JavaOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//매개변수의 숫자에 따라서 같은 이름의, 서로 다른 메소드를 호출하고 있다는 것을 알 수 있다.
		//이름은 같지만 시그니처는 다른 메소드를 중복으로 선언 할 수 있는 방법을
		//메소드 오버로딩 이라고한다.
		
		 Calculator c1 = new Calculator();
	        c1.setOprands(10, 20);
	        c1.sum();       
	        c1.avg();
	        
	        c1.setOprands(10, 20, 30);
	        c1.sum();       
	        c1.avg();
		
	        //오버로딩의 규칙
	        // 메소드 오버로딩은 매개변수를 사용한다.
	        // 매개변수가 다르면 이름이 같아도 서로 다른 메소드가 되는 것
	        // 반면에 매개변수는 같지만 리턴타입이 다르면 오류가 발생
	       // 매개 변수의 수가같아도 매개 변수의 데이터 타입이 달라도 오버로딩이 가능
	        // 하지만 메소드의 반환값은 호출하는 시점에서 전달되지 않는 정보이기 때문에 
	        //오버로딩의 대상이 될 수 없다.
	        
	        //상속과 오버로딩
	        // 상속의 관계에서도 오버로딩을 사용할 수 있다.
	        
		
	}

}
