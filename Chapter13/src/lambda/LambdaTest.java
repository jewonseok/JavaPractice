package lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		PrintString lambdaPrint = str -> System.out.println(str); //변수에 대입해서 바로 임플리멘테이션 하는법
		lambdaPrint.showString("test");
		
		showMyString(lambdaPrint); //임플리멘테이션 된 내용자체가 매개변수로 넘어가는 방법
		
		PrintString reStr = returnPrint(); //임플리멘테이션 한 자체를 반환값으로 넘기는 방법
		reStr.showString("hello");
	}
	
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	
	public static PrintString returnPrint() {
		return s -> System.out.println(s + " world");
	}

}
