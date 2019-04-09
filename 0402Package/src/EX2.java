
public class EX2 {

	public static void main(String[] args) {
		
		System.out.println("Wrapper 클래스 13.");
		
		Integer in1 = new Integer(100); // Wrapper 클래스 : 기본형을 감싼다.
		Integer in2 = new Integer(100);
		Integer in3 = new Integer(200);
		System.out.println("in1.equals(in2) -- > " + in1.equals(in2));
		System.out.println("in1.equals(in3) -- > " + in1.equals(in3));
		
		System.out.println("Wrapper 클래스 14.");
		
		Integer wrapi = new Integer(100);
		Double wrapd = new Double(55.7);
		int i = 100;
		double d = 55.7;
		double dl;
		dl = d + i;
		
		System.out.println(i + d);
		System.out.println(Integer.toString(i) + Double.toString(d));
		System.out.println(wrapi.toString() + wrapd.toString());
		
		System.out.println("Wrapper 클래스 15.");
		
		String stri = "123456";
		String strd = "123.56";
		System.out.println(Integer.valueOf(stri));
		System.out.println(Double.valueOf(strd));
		System.out.println(Integer.valueOf(stri) + Double.valueOf(strd)); // valueOf는 사칙연산이 가능한 숫자형으로 계산을 해줌.
		// wrapper 클래스로 감싼다.
		System.out.println("Wrapper 클래스 16.");
		
		String a = "10", b = "20";
		int sum = 0;
		float average = 0;
		System.out.println("input data : "+a+", "+b);
		int c = Integer.parseInt(a);
		int d16 = Integer.parseInt(b); // 괄호 앞 타입의 변수로 바꿔줌.
		sum = c + d16;
		average = sum/2;
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println("평균 = " + average);
		
		System.out.println("Mate 클래스 17.");
		
		System.out.println(Math.abs(63));
		System.out.println(Math.abs(-63));
		System.out.println(Math.abs(63.5));
		System.out.println(Math.abs(-63.5));
		
		System.out.println("Mate 클래스 18.");
		
		System.out.println(Math.round(63));
		System.out.println(Math.round(63.3));
		System.out.println(Math.round(63.5));
		System.out.println(Math.round(-63.4));
		System.out.println(Math.round(-63.5));
		System.out.println(Math.round(-63.6));
		
		System.out.println("Mate 클래스 19.");
		
		System.out.println(Math.pow(6, 3));
		System.out.println(Math.pow(6.0f, 3.0f));
		System.out.println(Math.pow(6.0, 3));
		System.out.println(Math.pow(-6.0, 3.0));
		
		System.out.println("Mate 클래스 20.");
		
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(9.0f));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.sqrt(-9.0));
		
		System.out.println("Mate 클래스 21.");
		
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println((int)Math.random() * 5);
		System.out.println((int)(Math.random() * 5));
		System.out.println((int)(Math.random() * 10));
		System.out.println((int)(Math.random()* 100));
	}

}
