//부모 클래스
class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
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
// 자식 클래스 (sub) extends를 이용하여 부모 Class를 지정
// 부모 클래스의 기본 포멧을 따르겠다.
class SubstractionableCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

class MultiplicationableCalculator extends Calculator {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

class DivisionableCalculator extends MultiplicationableCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}

public class JavaErbgang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//상속
		//부모 클래스와 자식 클래스의 관계를 상위(super) 클래스와 
		//하위(sub) 클래스라고 표현하기도 한다. 
		//또한 기초 클래스(base class), 유도 클래스(derived class)라고도
		//부른다. 
		
		 SubstractionableCalculator c1 = new SubstractionableCalculator();
	        c1.setOprands(10, 20);
	        c1.sum();
	        c1.avg();
	        c1.substract();
		//속을 통해서 코드의 중복을 제거할 수 있었고, 
	    //또 부모 클래스을 개선하면 이를 상속받고 있는 
	    //모든 자식 클래스들에게 그 혜택이 자동으로 돌아간다. 
	    //다시 말해서 유지보수가 편리해진다는 것이다.  
	    //재활용성과 중복의 제거, 그리고 유지보수의 편의는 
	    //서로 다른 목적으로 가지고 있지만, 
	    //하나가 좋아지면 자연스럽게 다른 쪽도 좋아지는 관계에 있다는 것을 다시 한 번 환기해주는 대목이다.
		
	    MultiplicationableCalculator c2 = new MultiplicationableCalculator();
	    c2.setOprands(10, 20);
	    c2.sum();
	    c2.avg();
	    c2.multiplication();
	     //상속 받은 Class 또한 다시 상속 할 수 있다.
	    DivisionableCalculator c3 = new DivisionableCalculator();
	    c3.setOprands(10, 20);
	    c3.sum();
	    c3.avg();
	    c3.multiplication();
	    c3.division();
	    
	    // 단점 : 복잡도의 증가
	    
	}

}
