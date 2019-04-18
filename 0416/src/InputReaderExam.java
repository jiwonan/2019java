import java.io.*;
public class InputReaderExam {
	public static void main(String ar[]) {
		Reader reader = new InputStreamReader(System.in);
		try {
			while (true) {
				int i = reader.read();
				if(i==-1)break;
				char c = (char)i;
				System.out.print(c);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
	}
}
