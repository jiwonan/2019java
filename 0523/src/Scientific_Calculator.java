import javax.swing.*;
import java.awt.*;

public class Scientific_Calculator extends JFrame {
	Scientific_Calculator() {
		setTitle("공학용 계산기");
		Container contentPane = getContentPane();
		GridLayout grid = new GridLayout(7, 5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane.setLayout(grid);
		contentPane.add(new JButton("x²"));
		contentPane.add(new JButton("yx"));
		contentPane.add(new JButton("sin"));
		contentPane.add(new JButton("cos"));
		contentPane.add(new JButton("tan"));
		contentPane.add(new JButton("√"));
		contentPane.add(new JButton("10^x"));
		contentPane.add(new JButton("log"));
		contentPane.add(new JButton("Exp"));
		contentPane.add(new JButton("Mod"));
		contentPane.add(new JButton("↑"));
		contentPane.add(new JButton("CE"));
		contentPane.add(new JButton("C"));
		contentPane.add(new JButton("←"));
		contentPane.add(new JButton("÷"));
		contentPane.add(new JButton("파이"));
		contentPane.add(new JButton("7"));
		contentPane.add(new JButton("8"));
		contentPane.add(new JButton("9"));
		contentPane.add(new JButton("x"));
		contentPane.add(new JButton("n!"));
		contentPane.add(new JButton("4"));
		contentPane.add(new JButton("5"));
		contentPane.add(new JButton("6"));
		contentPane.add(new JButton("-"));
		contentPane.add(new JButton("±"));
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		contentPane.add(new JButton("+"));
		contentPane.add(new JButton("("));
		contentPane.add(new JButton(")"));
		contentPane.add(new JButton("0"));
		contentPane.add(new JButton("."));
		contentPane.add(new JButton("="));
		
		setSize(400, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Scientific_Calculator();
	}
}