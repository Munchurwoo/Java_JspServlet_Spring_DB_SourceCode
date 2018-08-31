package solo;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	try {
    		System.out.print("������� ");
    		System.out.print(this.left/this.right);
    		System.out.print(" �Դϴ�.");
    	}catch(Exception e){
    		System.out.println("������ �߻� �߽��ϴ�. : "+e.getMessage());
    		System.out.println("������ �߻� �߽��ϴ�. : "+e.getLocalizedMessage());
    		System.out.println("������ �߻� �߽��ϴ�. : "+e.getStackTrace());
    	}
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) {
    	Calculator c1 = new Calculator();
        //Calculator c2 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}