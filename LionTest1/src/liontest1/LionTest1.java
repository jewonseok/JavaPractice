package liontest1;

import java.util.Scanner;

public class LionTest1 {
	public static void main(String[] args) {
		int x,y;
		int result;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("첫번째 숫자를 입력해주세요 : ");
			try {
				x = sc.nextInt();
				break;
			}catch(Exception e) {
				sc = new Scanner(System.in);
				System.out.println("[입력오류] : 숫자로 입력해주세요.");
			}
		}
		while(true) {
			System.out.print("두번째 숫자를 입력해주세요 : ");
			try {
				y = sc.nextInt();
				break;
			}catch(Exception e) {
				sc = new Scanner(System.in);
				System.out.println("[입력오류] : 숫자로 입력해주세요.");
			}
		}
		result = x + y;
		System.out.println("결과 : "+ result);
		
	}

}
