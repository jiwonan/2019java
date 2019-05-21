import java.io.*;
import java.util.*;
public class Phone_test {
	public static void main(String[] args) {
		FileWriter fin = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력 프로그램입니다.");
		String input;
		try {
			fin=new FileWriter("Phone.txt");
			while(true) {
				System.out.print("name PhoneNumber>>");
				input=sc.nextLine();
				if(input.equals("그만")) {
					System.out.println("Phone.txt에 저장되었습니다.");
					break;
				}
				fin.write(input);
				fin.write("\r\n");
			}
			fin.close();
			sc.close();
		} catch (IOException e) {
			System.out.println("파일을 저장하지 못했습니다.");
		}
	}

}