
//클래스
class Calculator{
	// 변수 -> 상태
	//클래스 변수
    int left, right;
     
    //초기화 매소드
    // 매소드 -> 행동
    // 클래스 매소드
    public void setOprands(int left, int right){
        //this -> 해당 Class에 변수또는 매소드에 접근.
    	this.left = left;
        this.right = right;
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}

class C1{
    static int static_variable = 1;
    int instance_variable = 2;
    static void static_static(){
        System.out.println(static_variable);
    }
    static void static_instance(){
        // 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다. 
        //System.out.println(instance_variable);
    }
    void instance_static(){
        // 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
        System.out.println(static_variable);
    }
    void instance_instance(){        
        System.out.println(instance_variable);
    }
}

public class JavaClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인스턴스 생성
		Calculator c1 = new Calculator();
		//인스턴스 매소드
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();       
         
        //인스턴스 생성
        
        Calculator c2 = new Calculator();
        //인스턴스 변수
        c2.left = 1;
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();

        //클래스 : 설계도
        //인스턴스 : 제품
        
        
        //1. 인스턴스 메소드는 클래스 맴버에 접근 할 수 있다.
        //2. 클래스 메소드는 인스턴스 맴버에 접근 할 수 없다. 
        
        C1 c = new C1();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 인스턴스 메소드가 정적 변수에 접근 -> 성공
        c.static_static();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 정적 메소드가 인스턴스 변수에 접근 -> 실패
        c.static_instance();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 클래스 변수에 접근 -> 성공
        c.instance_static();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공 
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
        c.instance_instance();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 클래스 변수에 접근 -> 성공
        C1.static_static();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
        C1.static_instance();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instance_static();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instance_instance();
		
	}

}
