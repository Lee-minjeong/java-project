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
