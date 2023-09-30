import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorFrame extends JFrame implements ActionListener {
	private int opCode = 0;
	
	private JTextField jtf1, jtf2, jtf3;
	private JPanel jpBase;
	private JPanel jp1, jp2, jp3, jp4;
	private JButton jb1, jb2, jb3, jb4, jb5, jb6;
	private Font f;
	
	CalculatorFrame() {
		f = new Font("Arial", Font.BOLD, 48);
		jpBase = new JPanel(); add(jpBase);
		jpBase.setLayout(new GridLayout(4, 1));
		jp1 = new JPanel(); jp1.setLayout(new GridLayout(1, 1));
		jpBase.add(jp1); jtf1 = new JTextField(); jtf1.setFont(f); jp1.add(jtf1);
		jp2 = new JPanel(); jp2.setLayout(new GridLayout(1, 1));
		jpBase.add(jp2); jtf2 = new JTextField(); jtf2.setFont(f); jp2.add(jtf2);
		jp3 = new JPanel(); jp3.setLayout(new GridLayout(1, 1));
		jpBase.add(jp3); jtf3 = new JTextField(); jtf3.setFont(f); jp3.add(jtf3);
		jtf3.setEditable(false);
		jp4 = new JPanel(); jp4.setLayout(new GridLayout(1, 5));
		jpBase.add(jp4); 
		jb1 = new JButton("+"); jb1.setFont(f); jp4.add(jb1); jb1.addActionListener(this);
		jb2 = new JButton("-"); jb2.setFont(f); jp4.add(jb2); jb2.addActionListener(this);
		jb3 = new JButton("*"); jb3.setFont(f); jp4.add(jb3); jb3.addActionListener(this);
		jb4 = new JButton("/"); jb4.setFont(f); jp4.add(jb4); jb4.addActionListener(this);
		jb5 = new JButton("%"); jb5.setFont(f); jp4.add(jb5); jb5.addActionListener(this);
		jb6 = new JButton("="); jb6.setFont(f); jp4.add(jb6); jb6.addActionListener(this);
		setButtons();
		
		setSize(600, 400);
		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		setVisible(true);
	}
	
	void clear() {
		jtf1.setText("");
		jtf2.setText("");
		jtf3.setText("");
		opCode = 0; setButtons();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb1) opCode = 1;
		else if(e.getSource() == jb2) opCode = 2;
		else if(e.getSource() == jb3) opCode = 3;
		else if(e.getSource() == jb4) opCode = 4;
		else if(e.getSource() == jb5) opCode = 5;
		setButtons();
	}
	
	void setButtons() {
		if(opCode != 1) jb1.setBackground(Color.LIGHT_GRAY); else jb1.setBackground(Color.CYAN);
		if(opCode != 2) jb2.setBackground(Color.LIGHT_GRAY); else jb2.setBackground(Color.CYAN);
		if(opCode != 3) jb3.setBackground(Color.LIGHT_GRAY); else jb3.setBackground(Color.CYAN);
		if(opCode != 4) jb4.setBackground(Color.LIGHT_GRAY); else jb4.setBackground(Color.CYAN);
		if(opCode != 5) jb5.setBackground(Color.LIGHT_GRAY); else jb5.setBackground(Color.CYAN);
	}
	
	int getOp() {
		return opCode;
	}
	
	void setOp(int value) {
		opCode = value; setButtons();
	}
	
	double calculate(double value1, double value2, int op) {
		if(op == 1) return value1 + value2;
		else if(op == 2) return value1 - value2;
		else if(op == 3) return value1 * value2;
		else if(op == 4) return value1 / value2;
		else if(op == 5) return value1 % value2;
		else return 0.0 / 0.0;
	}
	
	double getValue1() {
		return Double.parseDouble(jtf1.getText());
	}
	
	double getValue2() {
		return Double.parseDouble(jtf2.getText());
	}
	
	double getValue3() {
		return Double.parseDouble(jtf3.getText());
	}
	
	void setValue1(double value) {
		String t = "" + value;
		if(value % 1.0 == 0.0) t = "" + (long)value;
		jtf1.setText(t);
	}
	
	void setValue2(double value) {
		String t = "" + value;
		if(value % 1.0 == 0.0) t = "" + (long)value;
		jtf2.setText(t);
	}
	
	void setValue3(double value) {
		String t = "" + value;
		if(value % 1.0 == 0.0) t = "" + (long)value;
		jtf3.setText(t);
	}
}
