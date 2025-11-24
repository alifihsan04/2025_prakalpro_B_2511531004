package Pekan9_2511531004;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator_2511531004 {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_2511531004 window = new Calculator_2511531004();
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
	public Calculator_2511531004() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 336, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 10, 313, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton(" \uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Backspace = null;
				if(textField.getText() .length() > 0 ) {
					
					StringBuilder str = new StringBuilder(textField.getText()) ;
					str.deleteCharAt(textField.getText() .length()-1);
					Backspace = str. toString();
					textField.setText(Backspace) ;
					
					
				}
					
					
			}
		});
		btnBackspace.setFont(new Font("Windings", Font.BOLD, 18));
		btnBackspace.setBounds(10, 84, 68, 48);
		frame.getContentPane().add(btnBackspace);
		
		JButton angka7 = new JButton("7");
		angka7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+angka7.getText();
				textField.setText(number);
			}
		});
		angka7.setFont(new Font("Tahoma", Font.BOLD, 18));
		angka7.setBounds(10, 132, 68, 48);
		frame.getContentPane().add(angka7);
		
		JButton angka4 = new JButton("4");
		angka4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+angka4.getText();
				textField.setText(number);
			}
		});
		angka4.setFont(new Font("Tahoma", Font.BOLD, 18));
		angka4.setBounds(10, 183, 68, 48);
		frame.getContentPane().add(angka4);
		
		JButton angka1 = new JButton("1");
		angka1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+angka1.getText();
				textField.setText(number);
			}
		});
		angka1.setFont(new Font("Tahoma", Font.BOLD, 18));
		angka1.setBounds(10, 232, 68, 48);
		frame.getContentPane().add(angka1);
		
		JButton angka0 = new JButton("0");
		angka0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+angka0.getText();
				textField.setText(number);
			}
		});
		angka0.setFont(new Font("Tahoma", Font.BOLD, 18));
		angka0.setBounds(10, 284, 68, 48);
		frame.getContentPane().add(angka0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(88, 82, 68, 48);
		frame.getContentPane().add(btnClear);
		
		JButton angka8 = new JButton("8");
		angka8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+angka8.getText();
				textField.setText(number);
			}
		});
		angka8.setFont(new Font("Tahoma", Font.BOLD, 18));
		angka8.setBounds(88, 132, 68, 48);
		frame.getContentPane().add(angka8);
		
		JButton angka5 = new JButton("5");
		angka5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+angka5.getText();
				textField.setText(number);
			}
		});
		angka5.setFont(new Font("Tahoma", Font.BOLD, 18));
		angka5.setBounds(88, 183, 68, 48);
		frame.getContentPane().add(angka5);
		
		JButton angka2 = new JButton("2");
		angka2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+angka2.getText();
				textField.setText(number);
			}
		});
		angka2.setFont(new Font("Tahoma", Font.BOLD, 18));
		angka2.setBounds(88, 232, 68, 48);
		frame.getContentPane().add(angka2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(88, 284, 68, 48);
		frame.getContentPane().add(btnDot);
		
		JButton Btn00 = new JButton("00");
		Btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+Btn00.getText();
				textField.setText(number);
			}
		});
		Btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn00.setBounds(165, 84, 68, 48);
		frame.getContentPane().add(Btn00);
		
		JButton btnTambah = new JButton("+");
		btnTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";	
			}
		});
		btnTambah.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTambah.setBounds(243, 84, 68, 48);
		frame.getContentPane().add(btnTambah);
		
		JButton angka9 = new JButton("9");
		angka9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+angka9.getText();
				textField.setText(number);
			}
		});
		angka9.setFont(new Font("Tahoma", Font.BOLD, 18));
		angka9.setBounds(166, 132, 68, 48);
		frame.getContentPane().add(angka9);
		
		JButton angka6 = new JButton("6");
		angka6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+angka6.getText();
				textField.setText(number);
			}
		});
		angka6.setFont(new Font("Tahoma", Font.BOLD, 18));
		angka6.setBounds(166, 183, 68, 48);
		frame.getContentPane().add(angka6);
		
		JButton angka3 = new JButton("3");
		angka3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+angka3.getText();
				textField.setText(number);
			}
		});
		angka3.setFont(new Font("Tahoma", Font.BOLD, 18));
		angka3.setBounds(166, 232, 68, 48);
		frame.getContentPane().add(angka3);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				second = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = first + second ; 
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				} else if  (operation == "-") {
					result = first - second ; 
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				} else if (operation == "*") {
					result = first * second ; 
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				} else if (operation == "/") {
					result = first / second ; 
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}	else if (operation == "%") {
						result = first % second ; 
						answer = String.format("%.2f", result);
						textField.setText(answer);
						
					
				}
					
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEquals.setBounds(165, 284, 68, 48);
		frame.getContentPane().add(btnEquals);
		
		JButton btnKurang = new JButton("-");
		btnKurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";	
			}
		});
		btnKurang.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnKurang.setBounds(243, 132, 68, 48);
		frame.getContentPane().add(btnKurang);
		
		JButton btnKali = new JButton("*");
		btnKali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";	
			}
		});
		btnKali.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnKali.setBounds(243, 183, 68, 48);
		frame.getContentPane().add(btnKali);
		
		JButton btnBagi = new JButton("/");
		btnBagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";	
			}
		});
		btnBagi.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBagi.setBounds(243, 232, 68, 48);
		frame.getContentPane().add(btnBagi);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";	
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMod.setBounds(243, 284, 68, 48);
		frame.getContentPane().add(btnMod);
	}
}
