package a27.JavaGeneric;

class Box<E>{

	private E obj;

	public void setObj(E obj) {
		this.obj = obj;
	}

	public E getObj() {
		return obj;
	}
}

public class JavaGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		//컴파일 Error x -> String 또한 Object type 이기 때문이다.
//		box.setObj("hello");
//		//리턴할때 obj type으로 주기때문에 강제 형변환을 해야 한다.
//		String str = (String)box.getObj();
//		System.out.println(str);
//		
//		box.setObj(1);
//		int vlaue = (int)box.getObj();
//		System.out.println(vlaue);
		
		// Java Generic
		// 
		
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("sss");
		String str = box2.getObj();
		System.out.println(str);
		//auto boxing
		Box<Integer> box3 = new Box<>();
		box3.setObj(2);
		//auto Unboxing
		int num = box3.getObj();
		System.out.println(num);
	
		
	}

}
