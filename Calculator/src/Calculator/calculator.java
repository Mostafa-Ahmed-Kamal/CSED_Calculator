package Calculator;

public class calculator implements ICalculator {
	public int add(int x , int y) {
		return x+y;
	}
	public float divide(int x , int y) {
		if(y==0) {
			System.out.println("Math Error , you can't divide by zero");
			return -1;
		}
		else {
			return (float)x/y;
		}
	}

}
