package a49.JavaLamdaBasic;

public class CompareExam {
	
	public static void exec(Compare compare) {
		int k = 10;
		int x = 20;
		int value = compare.compareTo(k,x);
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		exec((i,j) -> {
			return i-j;
		});
	}
	
	
}
