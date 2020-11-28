import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Binary extends JFrame implements ActionListener{
	public static JTextField hex;
	public static JTextField bin;
	public static JButton submit,clear;
	public static JLabel hex1,bin1;
	public static JFrame frame = new JFrame("Hexadecimal to Binary");
	public static JPanel panel = new JPanel();
	public static void main(String args[])
	{
		hex1 = new JLabel("HEX");
		panel.add(hex1);
		hex1.setBounds(20,20,120,30);
		hex = new JTextField(20);
		panel.add(hex);
		hex.setBounds(100,15,350,40);
		bin1 = new JLabel("BINARY");
		panel.add(bin1);
		bin1.setBounds(20,120,80,30);
		bin = new JTextField(20);
		panel.add(bin);
		bin.setBounds(100,120,350,40);
		bin.setEditable(false);
		submit = new JButton("Convert");
		panel.add(submit);
		submit.setBounds(150,200,100,30);
		clear = new JButton("Clear");
		panel.add(clear);
		clear.setBounds(300,200,100,30);
		clear.addActionListener(new Binary());
		submit.addActionListener(new Binary());
		panel.setLayout(null);
		frame.add(panel);
		frame.setSize(550,350);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{ 
		String s = e.getActionCommand();
		if(s.equals("Convert"))
		{
			String hexadecimal = hex.getText();
			int num = (Integer.parseInt(hexadecimal,16));
			String hexadecimal1 = Integer.toBinaryString(num);
			bin.setText(hexadecimal1);
		}
		if(s.equals("Clear"))
		{
			hex.setText("");
			bin.setText("");
		}
	}
}