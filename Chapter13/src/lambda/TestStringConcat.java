package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		StringConcatImpl sImpl = new StringConcatImpl(); //객체지향 프로그램 방식
		sImpl.makeString("hello", "java");
		
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2); //람다식
		concat.makeString("hello", "java");
		
		// concat = concat2
		
		StringConcat concat2 = new StringConcat() {
		//익명 내부클래스	
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};
		
		concat2.makeString("hello", "java");
	}

}
