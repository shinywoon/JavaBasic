
class Calculator{
	
	// 인자로 배열을 사용하고 있다.
	// 이렇게 하면 하나의 인자로 여러개의 값을 받을 수 있다.
    int[] oprands;
     
    public void setOprands(int[] oprands){
        this.oprands = oprands;
    }
     
    public void sum(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total);
    }
      
    public void avg(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total/this.oprands.length);
    }
}

public class JavaOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Calculator c1 = new Calculator();
	        c1.setOprands(new int[]{10,20});
	        c1.sum();       
	        c1.avg();
	        c1.setOprands(new int[]{10,20,30});
	        c1.sum();       
	        c1.avg();
		
	        
	        
	}

}
