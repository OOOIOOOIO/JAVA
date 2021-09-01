package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		bw.write("의사");
		bw.newLine();
		bw.write("간호사\r\n");
		/*
		 * Java는 운영체제의 종류에 맞게 자동으로 줄바꿈 문자를 변경해준다.
		 * 즉, Java에서 줄바꿈을 인식하는 문자는 "\n"과 "\r\n"으로 두가지이다.
		 * 윈도우즈에서는 텍스트 파일로부터 텍스트들을 불러올 떄 엔터키(줄바꿈)을 구분자로 사용하려면 "\r\n"으로 해야한다.
		 * 
		 */
		bw.write("가수\r\n");
		bw.write("룰루\r\n");
		bw.close();
		
		String line = "";
		while((line = br.readLine()) != null) { // \n or \r이 없으면 null 리턴
			System.out.println(line);		// 여기서 한번 읽히기 때문에 변수에 담고 그 변수를 출력
			
		}
		br.close();
	}
}
