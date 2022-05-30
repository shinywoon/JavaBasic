
class Point{
	
	private int x , y;
	public Point(int x, int y) {
		this.x=x; this.y=y;
	}
	
	public String toString() {
		return "(" + x +", " + y +")"; 
	}
	
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(1,2);
		System.out.println(p.toString()); 		
		
		
	}

}
