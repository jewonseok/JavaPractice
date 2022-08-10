package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyNumber maxNum = (x,y) -> (x >= y)? x: y;
		
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
		
		int i = 100;
		
		MyNumber aaa = new MyNumber() {
			
			@Override
			public int getMaxNumber(int num1, int num2) {
				System.out.println(i); //참조는 가능이지만 값 변환은 불가
				return 0;
			}
		};
	}

}
