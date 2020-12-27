import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frame;
	private JTextField textFieldNum2;
	private JTextField textFieldNum1;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 563, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(272, 42, 238, 64);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(30, 42, 238, 64);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans= num1+num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
				
			}
		});
		btnNewButton.setBounds(54, 129, 193, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans= num1-num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton_1.setBounds(289, 129, 193, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(218, 231, 269, 52);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The Answer is");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(72, 240, 136, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans= num1*num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
				
			}
		});
		btnNewButton_2.setBounds(54, 176, 193, 34);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans= num1/num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton_3.setBounds(289, 176, 193, 34);
		frame.getContentPane().add(btnNewButton_3);
	}
}
