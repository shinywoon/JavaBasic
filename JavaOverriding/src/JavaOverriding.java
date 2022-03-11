class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() {
       return ((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    
	//overriding
	//부모가 물려준 메소드를 사용하지 않고 자식이 입맛대로 바꿔 사용하겠다
	// 기본동작은 폭넓게 적용되고, 예외적인 동작은 더 높은 우선순위를 갖게하고 있다.
	//이것은 공학에서 일반적으로 발견되는 규칙이다. 
	//이것을 메소드 오버라이딩(overriding)이라고 한다.
	//overriding을 하기 위해서는 메소드의 리턴형식이 같아야 한다.
	// 부모의 리턴 타입이 void 라면 자식도 void
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
    
    //중복을 없애기 위해 super를 사용
    public int avg() {
    	return super.avg();
    }
    
}

public class JavaOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 SubstractionableCalculator c1 = new SubstractionableCalculator();
	     c1.setOprands(10, 20);
	     c1.sum();
	     c1.avg();
	     c1.substract();
		
		
		
	}

}
