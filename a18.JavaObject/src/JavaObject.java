class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals(Object obj) {
        Student _obj = (Student)obj;
        return name == _obj.name;
    }
}
public class JavaObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//자바에서 상속이란 필수적이다.
		//직접 상속하건 하지 않았건 기본적인 상속을 하게 된다.
		//자바에서 모든 클래스는 사실 Object를 암시적으로 상속받고 있는 것이다. 
		//그런 점에서 Object는 모든 클래스의 조상이라고 할 수 있다. 
		//그 이유는 모든 클래스가 공통으로 포함하고 있어야 하는 기능을 제공하기 위해서다.
		
		//toString
		//객체를 문자로 표현하는 메소드
		
		//클래스 Calculator에 toString을 재정의(overiding)했다. 
		//그리고 인스턴스를 System.out.println의 인자로 전달하니까 t
		//oString을 명시적으로 호출하지 않았음에도 동일한 효과가 나고 있다.
		//toString 메소드는 자바에서 특별히 취급하는 메소드다. 
		//toString을 직접 호출하지 않아도 어떤 객체를 System.out.print로 호출하면 
		//자동으로 toString이 호출되도록 약속되어 있다.
		
		//equals
		//equals는 객체와 객체가 같은 것인지를 비교하는 API이다. 
		//객체 간에 같고 다름은 필요에 따라서 달라질 수 있기 때문이다.
		
		 Student s1 = new Student("egoing");
	     Student s2 = new Student("egoing");
	     System.out.println(s1 == s2);
	     System.out.println(s1.equals(s2));
		//s1과 s2가 서로 다른 객체이기 때문이다. 
	   //하지만 두 개의 객체가 논리적으로는 egoing이라는 값을 가지고 있기 때문에
	   //저 두 개의 객체가 같은 객체로 간주 되었으면 좋겠다. 
	   //이럴 때 클래스 Object의 메소드 equals를 overiding하면 된다. 
	     
	     //1. 객체 간에 동일성을 비교하고 싶을 때는 ==를 사용하지 말고 equals를 이용하자.

	     //2. equals를 직접 구현해야 한다면 hashCode도 함께 구현해야 함을 알고 이에 대한 분명한 학습을 한 후에 구현하자.

	     //3. equals를 직접 구현해야 한다면 eclipse와 같은 개발도구들은 equals와 hashCode를 자동으로 생성해주는 기능을 가지고 있다. 
	     //이 기능을 이용하는 것을 고려해보자.
	     
	     
	     
	}

}
