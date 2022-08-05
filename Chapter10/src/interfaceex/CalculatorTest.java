package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();
		
		System.out.println(calc.add(10, 2));
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}

}
