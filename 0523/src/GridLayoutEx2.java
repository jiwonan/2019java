import javax.swing.*;
import java.awt.*;

public class GridLayoutEx2 extends JFrame{
	public GridLayoutEx2() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4,2);//프레임 윈도우
		grid.setVgap(5);
		//위의 두줄이 	c.setLayout(new GridLayout(4,2,0,5));
	
		
		Container c = getContentPane();
		//c.setLayout(new GridLayout(4,2,0,5)); //grid를 컨텐트팬의 배치를
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx2();
	}

}
