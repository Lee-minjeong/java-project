 package inputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class InputOutput {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("���.txt");
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
			System.out.println("������ �����ϴ�.");
		} catch(Exception e) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
		
		try {
			FileWriter fw = new FileWriter("���.txt");
			char buf[]= {'a', 'b', 'c', 'x'};
			fw.write("1001, ȫ�浿\n");
			fw.write("1002, �����\n");
			fw.write("1003, ������\n");
			System.out.println("Hello");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
