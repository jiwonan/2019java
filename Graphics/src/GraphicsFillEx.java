import javax.swing.*;
import java.awt.*;

public class GraphicsFillEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsFillEx() {
		setTitle("fillXXX 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(100, 350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillArc(10,130,50,50,60,60);
			g.setColor(Color.ORANGE);
			g.fillArc(10,130,50,50,120,60);
			g.setColor(Color.YELLOW);
			g.fillArc(10,130,50,50,180,60);
			g.setColor(Color.GREEN);
			g.fillArc(10,130,50,50,240,60);
			g.setColor(Color.BLUE);
			g.fillArc(10,130,50,50,300,60);
			g.setColor(Color.MAGENTA);
			g.fillArc(10,130,50,50,360,60);
			g.setColor(Color.MAGENTA);
			g.fillArc(10,190,50,50,90,120); 
			g.setColor(Color.YELLOW);
			g.fillArc(10,190,50,50,210,120); 
			g.setColor(Color.GREEN);
			g.fillArc(10,190,50,50,330,120); 
		}
	}	
	public static void main(String [] args) {
		new GraphicsFillEx();
	}
}