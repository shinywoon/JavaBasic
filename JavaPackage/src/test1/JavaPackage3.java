package test1;

//package를 import 하면 사용할 수 있다.
import test.JavaPackage;
import test.*;
public class JavaPackage3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Error 발생
		// 다른 Package에 있으므로 로드 할 수 없다.
		JavaPackage jp = new JavaPackage();
		JavaPackage2 jp2 = new JavaPackage2();
	}

}
