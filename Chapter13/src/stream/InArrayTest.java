package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InArrayTest {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		
		int count = (int)Arrays.stream(arr).count(); //한번쓴 스트림은 없어져서 다시생성해서 사용
		System.out.println(count);
		}
	}

