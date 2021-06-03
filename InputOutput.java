 package inputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class InputOutput {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("명단.txt");
			char c;
			String id = new String("");
			while( (c=(char)fr.read()) != ',' ) {
				id = id + c;
			}
			System.out.println( id );
			
			String name = new String("");
			while( (c=(char)fr.read()) != '\n' ) {
				name = name + c;
			}
			System.out.println( name );
			
			fr.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("파일이 없습니다.");
		} catch(Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
		
		try {
			FileWriter fw = new FileWriter("명단.txt");
			char buf[]= {'a', 'b', 'c', 'x'};
			fw.write("1001, 홍길동\n");
			fw.write("1002, 손흥민\n");
			fw.write("1003, 박지성\n");
			System.out.println("Hello");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

/* Reader는 문자 단위로 읽는 스트림 중 최상위 스트림으로 FileReader, InputStreamReader, BufferendReader 하위 클래스를 주로 사용한다. Reader
중 가장 많이 사용하는 것은 FileReader이다. FileReader를 생성하는 데 사용하는 생정자는 FileReader(String name), FileReader(File f)이 있다. 
문자 스트림FileReader로 읽으면 한글이 제대로 읽히지 않는다. Writer는 문자 단위로 출력하는 스트림 중 최상위 클래스로 FileWriter, OutputStearmWriter, 
BufferedWriter 하위 클래스를 주로 사용한다. 
