
class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T>{
    public T info;
    Person(T info){ this.info = info; }
}
public class JavaGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
        EmployeeInfo ei1 = p1.info;
        System.out.println(ei1.rank); // 성공
         
        Person<String> p2 = new Person<String>("부장");
        String ei2 = p2.info;
        //System.out.println(ei2.rank); // 컴파일 실패
        //1은 잘 동작할 것이다. 중요한 것은 p2다.
        //p2는 컴파일 오류가 발생하는데 p2.info가 String이고 String은 rank 필드가 
        //없는데 이것을 호출하고 있기 때문이다.
        //여기서 중요한 것은 아래와 같이 정리할 수 있다.
        
		//p1.inpo : EmployeeInfo
		//p2.inpo : String
		//각각의 인스턴스를 생성할 때 사용한 <> 사이에 어떤 데이터 타입을 사용했느냐에 달려있다. 
		//클래스 Person의 필드 info의 데이터 타입은 T로 되어 있다. 그런데 T라는 데이터 타입은 존재하지 않는다.
		//이 값은 아래 코드의 T에서 정해진다.
		//클래스를 정의 할 때는 info의 데이터 타입을 확정하지 않고 
		//인스턴스를 생성할 때 데이터 타입을 지정하는 기능이 제네릭이다. 
		
		//타입 안전성
		
		
	}

}
