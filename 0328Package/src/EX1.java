
public class EX1 {

	public static void main(String[] args) {
		System.out.println("String 클래스 1.");
		String strData1 = "I LOVE MIRIM MEISTER";
		System.out.println("strData1의 길이 : "+strData1.length());
		
		System.out.println("String 클래스 2.");
		
		for(int i = 0 ; i < strData1.length() ; i++) {
			System.out.print(strData1.charAt(i));
		}
		System.out.println();
		
		System.out.println("String 클래스 3.");
		
		String R1 = new String("JAVA");
		String R2 = new String("JAVA");
		String R3 = new String("java");
		System.out.println("R1 == R2 --> "+(R1 == R2));
		System.out.println("R1.equals(R2) --> "+(R1.equals(R2)));
		System.out.println("R1 == R3 --> "+(R1 == R3));
		System.out.println("R1.equals(R3) --> "+(R1.equals(R3)));
		
		
		System.out.println("String 클래스 4.");
		
		char ch = 'A';
		String strData4_1 = "A";
		String strData4_2;
		strData4_2 = String.valueOf(ch);
		if(strData4_1.equals(strData4_2)) {
			System.out.println("같음");
		}
		else {
			System.out.println("다름");
		}
		
		System.out.println("String 클래스 5.");
		String strData5_1 = "I LOVE MIRIM MEISTER";
		String strData5_2 = strData5_1.trim();
		if(strData5_1.equals(strData5_2)) {
			System.out.println("같음");
		}
		else {
			System.out.println("다름");
		}
		
		System.out.println("String 클래스 6.");
		String strData6_1 = "I LOVE MIRIM MEISTER";
		String strData6_2 = strData6_1.substring(7, 13);
		System.out.println("strData6_2 : "+strData6_2);
		
		System.out.println("String 클래스 7.");
		String strData7_1 = "I LOVE MIRIM MEISTER";
		String strData7_2 = strData6_1.substring(2, 5);
		System.out.println("strData7_2 : "+strData7_2);
	
		System.out.println("String Buffer 클래스 9.");
		
		StringBuffer sb1 = new StringBuffer("java programming");
		StringBuffer sb2 = new StringBuffer(" project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		str1 = sb1.append(" project");
		str2 = sb1.append(sb2);
		System.out.println("sb1 = "+sb1);
		System.out.println("str2 = "+str2);
		
		System.out.println("String Buffer 클래스 10.");
		
		System.out.println("sb2 = "+sb2);
		System.out.println("str1 = "+str1);
		StringBuffer sb3 = new StringBuffer("java programming");
		StringBuffer sb4 = null;
		sb4 = sb2.replace(0,4,"JAVA");
		System.out.println("sb4 = "+sb4);
		
		System.out.println("String Buffer 클래스 11.");
		
		StringBuffer sb5 = new StringBuffer("java programming");
		StringBuffer sb6 = null;
		sb6 = sb5.reverse();
		System.out.println("sb6 = "+sb6);
		
		System.out.println("String Buffer 클래스 12.");
		
		StringBuffer sb7 = new StringBuffer("java Programing");
		String str = null;
		str = sb7.toString();
		System.out.println("str.toUpperCase() = " + str.toUpperCase());
	}
}
