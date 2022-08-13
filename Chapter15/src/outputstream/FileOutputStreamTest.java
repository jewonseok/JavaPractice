package outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0; i < bs.length; i++) {
			bs[i] = data++;
		}
		
		try(FileOutputStream fos = new FileOutputStream("output2.txt")){
			fos.write(bs, 2, 10); //c부터 10개만 써라
			
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
