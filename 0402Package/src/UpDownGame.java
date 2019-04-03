import java.util.*;
public class UpDownGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random() * 101);
		int user_num = -1;
		int count = 1;
		while(count <= 5) {
			System.out.print("숫자 입력(0~99)? ");
			user_num = sc.nextInt();
			if(user_num > num) {
				System.out.println(">>> 너무 큽니다.(" + count + "회)");
			}
			else if(user_num < num) {
				System.out.println(">>> 너무 작습니다.(" + count + "회)");
			}
			else {
				System.out.println("***** 축하합니다. *****");
				break;
			}
			count++;
		}
		if(num != user_num) {
			System.out.println("다 틀리셨네요 하하 갈깔 정답은 "+user_num+"입니다.");
		}
	}

}
