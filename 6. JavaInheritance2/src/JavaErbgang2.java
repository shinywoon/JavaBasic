
//기본 생성자에 대한 과정과 부모에서 생성자를 만들때 오류가 뜨는것에 대한 
//설명이 필요

//상위 클래스인 Calculator의 생성자가 존재하지 않는다는 의미다. 
//하위 클래스가 호출될 때 자동으로 상위 클래스의 기본 생성자를 호출하게 된다. 
//그런데 상위 클래스에 매개변수가 있는 생성자가 있다면 자바는 자동으로 
//상위 클래스의 기본 생성자를 만들어주지 않는다. 
//따라서 존재하지 않는 생성자를 호출하게 되기 때문에 에러가 발생했다.

class Calculator {
    int left, right;
     //Calculator Class의 기본 생성자
   // public Calculator(){}
    //Calculator Class의 매개변수 Class
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
     
    //생성자 x 매소드를 이용하여 생성자 역할
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

//Calculator Class를 상속 받음
class SubstractionableCalculator extends Calculator {
	
	//Sub 생성자
    public SubstractionableCalculator(int left, int right) {
    	//super의 키워드는 부모 클래스를 의미, 여기에 ()를 붙이면 부모 클래스의 생성자를 의미
    	//이렇게 하면 부모클래스의 기본 생성자가 없어져도 오류가 발생하지 않는다
    	//하위 클래스의 생성자에서 super를 사용할 때 주의할 점은 super가
    	//가장 먼저 나타나야 한다. 즉 부모가 초기화 되기전에  자식이 초기화 되는 일을 방지
    	
        super(left, right);
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}


public class JavaErbgang2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//매개변수가 있는 생성자가 있을 때는 자동으로 기본 생성자를 만들어주지 않는다. 따라서 위의 예제는 존재하지 않는 생성자를 호출하고 있다. 
		//이 문제를 해결하기 위해서는 아래와 같이 기본 생성자를 추가해줘야 한다.
		
		 SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
	        c1.sum();
	        c1.avg();
	        c1.substract();
		
	}

}
