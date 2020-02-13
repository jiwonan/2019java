import javax.swing.*;
import java.awt.*;

public class Lion extends JFrame {
	private MyPanel panel = new MyPanel();
	public Lion () {
		setTitle("라이언 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(700, 700);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent (Graphics g) {
			super.paintComponent(g);
			// 귀
			g.setColor(new Color(0,0,0));
			g.fillArc(210, 80, 73, 73, 60, 360);
			g.setColor(new Color(0,0,0));
			g.fillArc(340, 80, 73, 73, 60, 360);
			g.setColor(new Color(221,155,37));
			g.fillArc(215, 85, 61, 60, 60, 360);
			g.setColor(new Color(221,155,37));
			g.fillArc(345, 85, 61, 60, 60, 360);
			// 얼굴
			g.setColor(new Color(0,0,0));
			g.fillArc(193, 93, 235, 215, 60, 360);
			g.setColor(new Color(221,155,37));
			g.fillArc(200, 100, 220, 200, 60, 360);
			// 눈썹
			g.setColor(Color.BLACK);
			g.fillRoundRect(240, 160, 45, 7, 20, 20);
			g.setColor(Color.BLACK);
			g.fillRoundRect(330, 160, 45, 7, 20, 20);
			// 눈
			g.setColor(Color.BLACK);
			g.fillArc(255, 175, 15, 15, 60, 360);
			g.setColor(Color.BLACK);
			g.fillArc(345, 175, 15, 15, 60, 360);
			// 입
			g.setColor(Color.BLACK);
			g.fillArc(280,205,40,40,60,360);
			g.setColor(Color.BLACK);
			g.fillArc(300,205,40,40,60,360);
			g.setColor(new Color(255,255,255));
			g.fillArc(285,210,30,30,60,360);
			g.setColor(new Color(255,255,255));
			g.fillArc(305,210,30,30,60,360);
			// 코
			g.setColor(Color.BLACK);
			g.fillArc(300,200,20,20,60,360);
		}
	}
	public static void main(String[] args) {
		new Lion();
	}

}
