package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSoma extends JFrame {
	//Autor: Joao Vitor Souza Pioner | Data: 29/10/2020
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSoma frame = new TelaSoma();
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
	public TelaSoma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 191);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter the first number:");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNumber1.setBounds(70, 31, 138, 22);
		contentPane.add(lblNumber1);
		
		txtNumber1 = new JTextField();
		txtNumber1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber1.setBounds(70, 63, 97, 27);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		txtNumber1.setDocument(new JustNumbers());//Aceita apenas numbers
		
		JLabel lblNumber2 = new JLabel("Enter the first number:");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNumber2.setBounds(228, 31, 138, 22);
		contentPane.add(lblNumber2);
		
		txtNumber2 = new JTextField();
		txtNumber2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber2.setColumns(10);
		txtNumber2.setBounds(228, 63, 97, 27);
		contentPane.add(txtNumber2);
		txtNumber2.setDocument(new JustNumbers()); //Aceita apenas numbers
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBounds(196, 70, 27, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnSum = new JButton("Sum");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String a = txtNumber1.getText(); 
				String b = txtNumber2.getText();
				
				int c = Integer.parseInt(a);
				int d = Integer.parseInt(b);
				
				int soma = c + d;
				
				JLabel lblResult = new JLabel("");
				lblResult.setBounds(361, 63, 76, 27); //LBL QUE MOSTRA OS NUMEROS
				contentPane.add(lblResult);
				
				lblResult.setText(String.valueOf(soma));
			}
		});
		btnSum.setBounds(155, 118, 89, 23);
		contentPane.add(btnSum);
		
		JLabel lblEqual = new JLabel(" =");
		lblEqual.setBounds(335, 70, 16, 14);
		contentPane.add(lblEqual);
		
	
		
		
	}

}
