import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
	FlowLayoutEx(){
		setTitle("FlowLayout Sample"); //프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); //컨텐트팬 알아내기
		//왽쪽 정렬로 수평 간격을 30, 수직 간격을 40픽셀로 배치하는 FlowLayout 생성
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutEx();
	}

}
