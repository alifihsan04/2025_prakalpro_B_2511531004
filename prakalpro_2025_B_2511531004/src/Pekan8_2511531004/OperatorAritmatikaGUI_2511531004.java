package Pekan8_2511531004;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511531004 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TextBil1;
	private JTextField TextBil2;
	private JTextField TextHasil;

	
	private void pesanPeringatan(String pesan) {
	JOptionPane.showMessageDialog(this,pesan,"Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
	JOptionPane.showMessageDialog(this,pesan,"Kesalahan", JOptionPane.WARNING_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511531004 frame = new OperatorAritmatikaGUI_2511531004();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUI_2511531004() {
		setTitle("OPERATOR ARITMATIKA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operator Aritmatika");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(150, 10, 118, 36);
		contentPane.add(lblNewLabel);
		
		JLabel bilangan2 = new JLabel("Bilangan 2");
		bilangan2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		bilangan2.setBounds(27, 85, 74, 12);
		contentPane.add(bilangan2);
		
		JLabel bilangan1 = new JLabel("Bilangan 1");
		bilangan1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		bilangan1.setBounds(27, 63, 74, 12);
		contentPane.add(bilangan1);
		
		JLabel operator = new JLabel("Operator");
		operator.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		operator.setBounds(27, 144, 74, 12);
		contentPane.add(operator);
		
		JLabel head = new JLabel("Head");
		head.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		head.setBounds(27, 166, 74, 12);
		contentPane.add(head);
		
		TextBil1 = new JTextField();
		TextBil1.setBounds(111, 60, 74, 18);
		contentPane.add(TextBil1);
		TextBil1.setColumns(10);
		
		TextBil2 = new JTextField();
		TextBil2.setColumns(10);
		TextBil2.setBounds(111, 82, 74, 18);
		contentPane.add(TextBil2);
		
		TextHasil = new JTextField();
		TextHasil.setColumns(10);
		TextHasil.setBounds(111, 166, 74, 18);
		contentPane.add(TextHasil);
		
		JComboBox CbOperator = new JComboBox();
		CbOperator.setModel(new DefaultComboBoxModel(new String[] {"* ", "/", "+", "-", "%"}));
		CbOperator.setBounds(111, 140, 35, 20);
		contentPane.add(CbOperator);
		
		JButton proccess = new JButton("Proccess");
		proccess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hasil = 0;
				if( TextBil1.getText().trim().isEmpty()){
				pesanPeringatan("Bilangan 1 harus diisi");
			} else if ( TextBil2.getText(). trim(). isEmpty()) {
				pesanPeringatan("Bilangan 2 harus diisi");
			} else {
				
				
				try  {
				
					
				int a = Integer.parseInt(TextBil1.getText());
				int b = Integer.parseInt(TextBil2.getText());
				int c = CbOperator.getSelectedIndex(); // memilih operator
				
				
				if ( c == 0 ) {
					hasil = a * b;
				}
				if (c == 1) {
					hasil = a / b;
				}
				if (c == 2) {
					hasil = a + b;
				} 
				if ( c == 3) {
					hasil = a - b;
				}
				if ( c == 4 ) {
					hasil = a % b;
					
			
				
				
					
				}
			} catch (NumberFormatException ex ) {
				pesanError("Bilangan 1 dan Bilangan 2 harus diisi angka");
			}
				
			}
			TextHasil.setText(String.valueOf(hasil));
				
			}
		});
		proccess.setBounds(202, 140, 84, 20);
		contentPane.add(proccess);

	}
}
