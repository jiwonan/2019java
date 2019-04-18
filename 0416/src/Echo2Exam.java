import java.io.*;
public class Echo2Exam {
	public static void main(String ar[]) {
		int bt;
		try {
			while((bt = System.in.read()) != -1) {
				System.out.print((char)bt);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
