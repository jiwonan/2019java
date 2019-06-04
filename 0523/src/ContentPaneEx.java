import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	ContentPaneEx(){
		setTitle("ContentPane과 JFrame 예제"); //프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane(); //컨텐트팬 알아내기
		contentPane.setBackground(Color.ORANGE);//오렌지색 배경설정
		contentPane.setLayout(new FlowLayout());//컨탠트펜에 FlowLayout배치관리자 달기
		
		contentPane.add(new JButton("OK")); //OK버튼 달기
		contentPane.add(new JButton("Cancel"));//cancel버튼 달기
		contentPane.add(new JButton("Ignore"));//ignore버튼 달기
		
		setSize(300,150);//프레인 크기 300x150 설정
		setVisible(true);// 화면에 프레임 출력	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
