package liontest1;

import java.util.Scanner;

public class LionTest2 {

	public static void main(String[] args) {
		
		int arr[] = new int[11];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<arr.length; i++) {
			while(true) {
				System.out.print("숫자 "+i+" : ");
				try {
					arr[i] = sc.nextInt();
					break;
				} catch(Exception e) {
					sc = new Scanner(System.in);
					System.out.println("[입력오류] : 숫자로 입력해주세요.");
				}
			}
			sum += arr[i];
		}
		System.out.println("결과 : "+sum);
		
	}

}
