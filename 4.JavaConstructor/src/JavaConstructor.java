
class Calculator {
    int left, right;
 
    //생성자 :인스턴스가 생성되면 처음 한번 자동으로 실행 됨
    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class JavaConstructor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//생성자 : 인스턴스가 생성 될때 Calculator Public Calculator를 통해
		// Class변수의 left 와 right의 값이 정해짐
		Calculator c1 = new Calculator(10, 20);
	    c1.sum();
	    c1.avg();
	 
	    Calculator c2 = new Calculator(20, 40);
	     c2.sum();
	     c2.avg();
		
	     //생성자의 특징 
	     // 1. 값을 반환하지 않는다.
	     //생성자는 인스턴스를 생성해주는 역할을 하는 특수한 메소드
	     //따라서 반환 값을 필요로 하는 작업에서는 생성자를 사용하지 않는다.
	     // 반환 값이 없기 때문에 return도 사용하지 않고 반환값을 
	     //메소드 정의에 포함시키지도 않는다.
	     // 2. 생성자의 이름은 클래스의 이름과 동일하다.
	     // 클래스의 이름과 동일한 메소드는 생성자로 사용하기로 약속 되어 있다.
	     
	
	}

}
